
package pathways;

/**
 *
 * @author xavierloera
 */
public class User {
   private String firstName;
   private String lastName;
   private String email;
   private String password;
   public User(String firstName, String lastName, String email, String password){
       this.firstName= firstName;
       this.lastName = lastName;
       this.email = email;
       this.password = password;
   }
   public void setFirstName(String name){
       this.firstName = name;
   }
   public void setLastName(String name){
       this.lastName = name;
   }
   public void setEmail(String email){
       this.email = email;
   }
   public void setPassword(String password){
       this.password = password;
   }
   public String getFirstName(){
       return this.firstName;
   }
   public String getLastName(){
       return this.lastName;
   }
   public String getFullName(){
       return this.firstName + " " + this.lastName;
   }
   public String getEmail(){
       return this.email;
   }
   public String getPassword(){
       return this.password;
   }
   
   
   
}
