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
public class Student extends User{
    private String studentID;
    private Major studentMajor;
         Course[] blankcourses1 = new Course[]{Data.blank, Data.blank, Data.blank,
            Data.blank, Data.blank , Data.blank };
         Course[] blankcourses2 = new Course[]{Data.blank, Data.blank, Data.blank,
            Data.blank, Data.blank , Data.blank };
         Course[] blankcourses3 = new Course[]{Data.blank, Data.blank, Data.blank,
            Data.blank, Data.blank , Data.blank };
         Course[] blankcourses4 = new Course[]{Data.blank, Data.blank, Data.blank,
            Data.blank, Data.blank , Data.blank };
         Course[] blankcourses5 = new Course[]{Data.blank, Data.blank, Data.blank,
            Data.blank, Data.blank , Data.blank };
         Course[] blankcourses6 = new Course[]{Data.blank, Data.blank, Data.blank,
            Data.blank, Data.blank , Data.blank };        
         Course[] blankcourses7 = new Course[]{Data.blank, Data.blank, Data.blank,
            Data.blank, Data.blank , Data.blank }; 
         Course[] blankcourses8 = new Course[]{Data.blank, Data.blank, Data.blank,
            Data.blank, Data.blank , Data.blank };         
        public  Courselist term1 = new Courselist(blankcourses1,4,4);
        public  Courselist term2 = new Courselist(blankcourses2,4,4);
        public  Courselist term3 = new Courselist(blankcourses3,4,4);
        public  Courselist term4 = new Courselist(blankcourses4,4,4);
        public  Courselist term5 = new Courselist(blankcourses5,4,4);
        public  Courselist term6 = new Courselist(blankcourses6,4,4);
        public  Courselist term7 = new Courselist(blankcourses7,4,4);
        public  Courselist term8 = new Courselist(blankcourses8,4,4);
        public  Courselist[] terms ;
    public Student(String firstName, String lastName, String email, String password,
            String studentID){
        super(firstName, lastName, email, password);
        this.studentID= studentID;
        terms= new Courselist[]{term1,term2,term3,term4,term5,term6,term7,term8};
        
            }
    public Student(String firstName, String lastName, String email, String password,
            String studentID,Courselist t1,Courselist t2, Courselist t3){
        super(firstName, lastName, email, password);
        this.studentID= studentID;
        terms=new Courselist[] {t1,t2,t3,term4,term5,term6,term7,term8};

        
        
            }    
    
    public void setStudentID(String studentID){
        this.studentID = studentID;
    }
    public void setMajor(Major major){
        this.studentMajor = major;
    }
    public Major getMajor(){
        return this.studentMajor;
    }
    public String getStudentID(){
        return this.studentID;
    }
    public String toString(){
        return String.format("%25s %15s %10s %10s",
                super.getFullName(), super.getEmail(), this.studentID, 
                this.studentMajor.getMajorName());
    }
    public Courselist getTerm(int i){
        return terms[i];
    }
    public void addTerm(int i,Courselist term ){
        terms[i] = term;
    }



}





