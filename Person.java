package application;

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.IllegalArgumentException;
public class Person
{
    protected String firstName;
    protected String lastName;
    protected String password;
    protected String email;
    protected String userID;
    
    public Person(){
    }
     
    public void setAttributes(String firstName, String lastName, String email, String password, String userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = emailValidation(email);
        this.userID = userID;
    }
     
         /** 
         * Sets the valid email address.
         * 
         * @param email address as a sring.
         * @throws IlligalArgumentException if the email address does not contain "@" or "."
         */
        public String emailValidation(String email) {

        if (!email.contains("@"))
        {
            // Enforce preconditions specified above
            throw new IllegalArgumentException("Please, enter a valid e-mail address");
        }
        return email;
    }
    
             /** 
         * Sets the valid password.
         * 
         * @param password as a sring.
         * @throws IlligalArgumentException if the password is shorter than 6 characters.
         */
        public String passwordValidation(String password) {

        if (password.length()<6)
        {
            // Enforce preconditions specified above
            throw new IllegalArgumentException("Please, enter a valid e-mail address");
        }
        return email;
    }
    
    
    public String getName() {
        return firstName + " " + lastName;
    }
     
    public void setPassword(String p) {
        password = p;
    }
     
    public static void main(String [] args) {
        Person currentPerson = new Person();
        currentPerson.setAttributes("John", "Doe","lkjdf","pauleanderson@gmail.com","1");
        System.out.println(currentPerson.getName());
    }
}
