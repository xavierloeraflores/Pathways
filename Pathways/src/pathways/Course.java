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
public class Course {
    private String courseCode;
    private String name;
    private String courseType;
    private double units;
    private double labUnits;
    private int transfer;
    private boolean passnopass;
    private String prerequisite;

    
    public Course(String courseCode, String name, String courseType,
            double units, double labUnits,boolean passnopass){
        this(courseCode,name,courseType,units,labUnits,0, passnopass,"");
    }    
    public Course(String courseCode, String name, String courseType,
            double units, double labUnits,boolean passnopass,String prerequisite){
        this(courseCode,name,courseType,units,labUnits,0, passnopass,
                prerequisite);
    }
    public Course(String courseCode, String name, String courseType,
            double units, double labUnits,String prerequisite){
        this(courseCode,name,courseType,units,labUnits,0, false,
                prerequisite);
    }     
    public Course(String courseCode, String name, String courseType,
            double units, double labUnits,int transfer,String prerequisite){
        this(courseCode,name,courseType,units,labUnits,transfer, false,
                prerequisite);
    }    
    public Course(String courseCode, String name, String courseType,
            double units, double labUnits){
        this(courseCode,name,courseType,units,labUnits,0, false ,"");
    }
    public Course(String courseCode, String name, String courseType,
            double units, double labUnits, int transfer){
        this(courseCode,name,courseType,units,labUnits,transfer, false ,"");
    }    
    public Course(String courseCode, String name, String courseType,
            double units, double labUnits, int transfer, boolean passnopass){
        this(courseCode,name,courseType,units,labUnits,transfer,passnopass,"");
    }
    public Course(String courseCode, String name, String courseType,
            double units, double labUnits, int transfer, boolean passnopass,
            String prerequisite){
        this.courseCode= courseCode;
        this.name = name;
        this.courseType = courseType;
        this.units = units;
        this.labUnits = labUnits;
        this.transfer = transfer;
        this.passnopass = passnopass;
        this.prerequisite = prerequisite;
        
    }
    public void setCourseCode(String code){
        this.courseCode=code;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setUnits(double units){
        if(units>= 0.0 && units <=18)
        this.units = units;
    }
    public void setLabUnits(double units){
        if (units >= 0.0 && units <= 18)
        this.labUnits = units;
    }
    public void setPrerequisite(String course){
        this.prerequisite = course;
    }
    public void setTransfer(int code){
        this.transfer = code;
    }
    public void setPassnopass(boolean pass){
        this.passnopass = pass;
    }
    public void setCourseType(String type){
        this.courseType = type;
    }
    public String getCourseCode(){
        return this.courseCode;
    }
    public String getName(){
        return this.name;
    }
    public double getUnits(){
        return this.units;
    }
    public double getLabUnits(){
        return this.labUnits;
    }
    public double getTotalUnits(){
        return this.units + this.labUnits;
    }
    public String getPrerequisite(){
        return this.prerequisite;
    }
    public String getCourseType(){
        return this.courseType;
    }
    public int getTransfer(){
        return this.transfer;
    }
    public String printTransfer(){
        if (this.transfer==2)
            return "Transfer:CSU/UC";
        if(this.transfer == 1)
            return "Transfer:CSU ONLY ";
        else
            return "";      
    }
    public String printPrerequisite(){
        if(!this.prerequisite.equals(""))
            return String.format("Prequisite:%s ", this.prerequisite);
        else
            return "";
    }
    public String printPassnopass(){
        if  ( this.passnopass)
            return "Pass/NoPass Option Available";
        else
            return "";
    }
    @Override
    public String toString(){
        return String.format("%s %s %.1f/%.1f", this.courseCode, 
                this.name, this.units,this.labUnits);
    }
    public String toFullString(){
        return String.format("%s %s %.1f/%.1f\n%s%s %s\n", this.courseCode, 
                this.name, this.units,this.labUnits,printPrerequisite(),
                printTransfer(), printPassnopass());
    }
    

    
}
