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
public class Counselor extends User{
        private String department;
        private String description;
        private String phoneNumber;
        private Student[] students;
        public Counselor(String firstName, String lastName, String email, String password,
            String department, String description, String phoneNumber){
        super(firstName, lastName, email, password);
        this.department = department;
        this.description = description;
        this.phoneNumber = phoneNumber;
        }
        public void setDescription(String bio){
            this.description = bio;
        }
        public void setDepartment(String dep){
            this.department = dep;
        }
        public void setPhoneNumber(String num){
            this.phoneNumber = num;
        }
        public String getDescription(){
            return this.description;
        }
        public String getDepartment(){
            return this.department;
        }
        public String getPhoneNumber(){
            return this.phoneNumber;
        }
        public String getStudents(){
            String list="";
            for (Student student : students) {
                list += student.toString();
                list += "\n";
            }
            return list;
        }
        
        
        
}
