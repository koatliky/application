package application;

import java.util.Date;
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
    public String briefDescription;
    public Person assignTo;
    private static int increment = 0;

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

    public void setID()
    {
        id=ID+increment;
        this.increment++;
    }

    public int getID()
    {
        return id;
    }

    public Date setDate()
    {
        Date date = new Date();
        return date;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setBriefDescription(String briefDescription)
    {
        this.briefDescription = briefDescription;
    }

    public String getBriefDescription()
    {
        return briefDescription;
    }

    /**public Property addAsset (String ID)
    {
        return
    }**/

    public String getTechName()
    {
        return assignTo.getName();
    }

    public void main (String[] args)
    {

    }
}