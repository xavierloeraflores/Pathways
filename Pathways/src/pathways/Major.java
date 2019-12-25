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
public class Major {
    private String majorName;
    private String majorId;
    private Courselist[] requirements;
    public Major(String majorName, String majorID,Courselist[] requirements){
       this.majorId = majorID;
       this.majorName = majorName;
       this.requirements = requirements;
    }
    public Major(String majorName, String majorID){
       this.majorId = majorID;
       this.majorName = majorName;
       
    }    
    public String getMajorName(){
        return this.majorName;
    }
    public String getMajorID(){
        return this.majorId;
    }
    public boolean meetsAllRequirements(){
        for (Courselist requirement : requirements) 
            if (!requirement.meetRequirements())
                return false;
        return true;
    }
    public String printAllRequirements(){
        String allReq ="";
        for( Courselist requirement: requirements)
            allReq+= requirement.toString();
        return allReq;
    }
    public int getRequirementsMet(){
        int count=0;
        for (Courselist requirement : requirements) 
            if (requirement.meetRequirements())
                count++;
        return count;
    }
    @Override
    public String toString(){
       return String.format("%s %d/%d\n %s", this.getMajorName(), this.getRequirementsMet(),
       this.requirements.length, this.printAllRequirements());
    }   
        
        
}
    
    
    

