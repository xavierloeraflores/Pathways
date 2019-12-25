/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathways;

/**
 *
 * @author xavierloera
 */
public class Courselist {
    private Course[] courses ;
    private String name;
    private int courselistType;//1-ReqClasses, 2-ReqUnits, 3-MaxUnits ,4-Open
    private int requiredCourses;
    private double requiredUnits;
    private double maxUnits;
    public Courselist(  ){
        this.courselistType = 4;
    }    
    public Courselist(Course[] courses, int courselistType, double count ){
        this.courses = courses;
        this.courselistType = courselistType;
        if (courselistType == 1 )
            this.requiredCourses = (int)count;
        if (courselistType == 2 )
            this.requiredUnits = count;
        if (courselistType == 3)
            this.maxUnits = count;
    }
    public void addCourse(Course newCourse){
        Course[] tempcourses = new Course[this.courses.length+1];
        System.arraycopy(courses, 0, tempcourses, 0, courses.length);
        tempcourses[this.courses.length+1] = newCourse;
        this.courses = tempcourses;
    }
    public void replaceCourse(Course newCourse, int i ){
        courses[i]=newCourse;
    }
    //public void subCourse(int i){
    //    this.courses[i]=null;
    //    this.count-=1;        
    //}
    public double getTotalUnits(){
        double totalUnits=0;
        for (Course course : courses) {
            totalUnits += course.getTotalUnits();
        }
        return totalUnits;
    }
    public int getNumCourses(){
        return courses.length;
    }
    public double getRequiredUnits(){
        return this.requiredUnits;
    }
    public double getMax(){
        return this.maxUnits;
    }
    public String printCourseList(){
        String list = "";
        for (Course course : courses) {
            list += course.getName();
            list += "\n";
        }
        return list;
    }
    public void setCourseListType(int courselistType ){
        this.courselistType = courselistType;
    }
    public boolean meetRequirements(){
        if (courselistType == 1 ){
            if(courses.length>=requiredCourses)
                return true;
        }
        if (courselistType == 2 ){
            if(this.getTotalUnits()>=requiredUnits)
            return true;
        }
        if (courselistType == 3){
            if(this.getTotalUnits()<=requiredUnits)
                return true;
        }
        return false;
    }    
    public void setCount(double count){
        if (courselistType == 1 )
            this.requiredCourses = (int)count;
        if (courselistType == 2 )
            this.requiredUnits = count;
        if (courselistType == 3)
            this.maxUnits = count;
    }
    public boolean isInCourselist(String courseCode){
        for (Course course : courses) {
            if(course.getCourseCode().equals(courseCode))
                return true;
        }
        return false;
    }
    public Course getCourse(int i){
        return courses[i];
    }
    public int getCourseIndex(String courseCode){
        int index=0;
        for (Course course : courses) {
            if(course.getCourseCode().equals(courseCode))
                break;
            index+=1;
        }return index;
        
    }    
    public String printCourselistType(){
        String printType="";
        
        if (courselistType == 1 ){
        printType = String.format("Required Classes: %d/%d",this.getNumCourses(),
                this.requiredCourses);
        }
        if (courselistType == 2 ){
        printType = String.format("Required Units: %.1f/%.1f",this.getTotalUnits(),
                this.requiredUnits);            
        }
        if (courselistType == 3){
        printType = String.format("Max Units: %.1f/%.1f",this.getTotalUnits(),
                this.maxUnits);         
        }
        return printType;
    }    
    @Override
    public String toString(){
        String requirements="";
        requirements+= this.printCourselistType()+"\n"+this.printCourseList();
        return requirements;
    
    
    }






}
    

