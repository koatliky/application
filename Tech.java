package application;

/**
 * Write a description of class Tech here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Tech extends Person
{



    public enum Type {
        PLUMBER("Plumber"), HVAC("HVAC"), ROOFER ("Roofer"), CARPENTER ("Carpenter"), APPLIANCES ("Appliances"),OTHER("Other");
        private String name;
        private Type(String n) {
            name = n;
        }
        
        public String toString() {
            return name;
        }
    }
    
    public enum Schedule {
        MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");
        private String day;
        private Schedule(String d) {
            day = d;
        }
        
        public String toString() {
            return day;
        }       
    }
    
   
    
    private Type type;
    private Schedule day;
    public ArrayList<String> skills=new ArrayList<String>();
    private ArrayList<Schedule> schedule= new ArrayList<Schedule>();
	private Scanner in;
    
    public Tech()
    {
  
    }
   
    public Tech createTech()
    {
        Tech newTech = new Tech();
        in = new Scanner(System.in);
        System.out.print("First name: ");
        firstName = in.next();
        System.out.print("Last name: ");
        lastName = in.next();
        System.out.print("Email: ");
        email = in.next();
        System.out.print("Password: ");
        password = in.next();
        userID = "1";
        newTech.setAttributes(firstName, lastName, email, password, userID);
        System.out.print("Type: ");
        newTech.setType(in.next());
        System.out.print("Skills: ");
        newTech.setSkills(in.next());
        System.out.print("Schedule: ");
        for (int i=0; i<5; i++)
        {
        newTech.setSchedule(in.next());
    }
        newTech.techInfo();
        
  
        return newTech;
        
    }
    public void techInfo()
    {
        System.out.println("Tech Name: "+ firstName + " " + lastName);
        System.out.println("Tech Domain: " + type);
        System.out.println("Skills: ");
        for (String s: skills)
        {
            System.out.println("* " + s);
    }
        System.out.println("Schedule: ");
        for (Schedule d: schedule)
        {
            System.out.println("* " + d);
    }
}

  
    public void setType(String type)
    {        
        boolean found = false;
        for(Type t: Type.values()){
            if (t.toString().equals(type)) {
                this.type=t;
                found = true;
            }
        }
        if (!found)
            {this.type=Type.OTHER;
            }
    }
    
        public void setSchedule(String day)
    {
        boolean found = false;
        for(Schedule d: Schedule.values()){
            if (d.toString().equals(day)) {
              schedule.add(d);
              found=true;
            }
        }
        if (!found)
            schedule.add(Schedule.MONDAY);

    }
  
    
    public ArrayList<Schedule> getSchedule()
    {
        return schedule;
    }
    public Type getType()
    {
        return type;
    }
    
    public void setSkills(String skill)
    {
      skills.add(skill);
    }
    
    public ArrayList<String> getSkills()
    {
        return skills;
    }
    
    public String getName()
    {
        return firstName;
    }
    
    public Type currentTypes()
    {
        return type;
    }

	public Schedule getDay() {
		return day;
	}

	public void setDay(Schedule day) {
		this.day = day;
	}
    

}
