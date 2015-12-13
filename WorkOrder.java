package application;

/**
 * Write a description of class WorkOrder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class WorkOrder
{
    // instance variables - replace the example below with your own
    private final int ID=1000;
    public int id;
    public String description;
    public Person assignTo;

    /**
     * Constructor for objects of class WorkOrder
     */
    public WorkOrder()
    {
        this.id=ID+1;
        Scanner in = new Scanner(System.in);
        System.out.println("Create a new work order: ");
        System.out.print("Description: ");
        description=in.nextLine();
        System.out.print("Location: ");
        Property asset = new Property();
        asset.addDishwasher();
        System.out.println("Assign to: ");
        String name = in.next();
        Tech assignTo=new Tech();
        System.out.println("Tech name: John Doe");
        System.out.println("Tech specialization: Plumbing");
        
    }

    public int getId()
    {
        return id;
    }
    
    public String description()
    {
        return description;
    }
    
    public String getTechName()
    {
        return assignTo.getName();
    }
    

}
