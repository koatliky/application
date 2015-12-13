package application;

/**
 * Write a description of class Company here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Company
{
    // instance variables - replace the example below with your own
    ArrayList<Tech> techs = new ArrayList<Tech>();
    String answer;
    String name;
    int techsNumber;
    int dispNumber;
    FileReader in = null;
    FileWriter out = null;
	private Scanner in2;
    
    public Company(String name) throws IOException
    {
        this.name=name;
        in2 = new Scanner(System.in);
        System.out.println("How many technicians does your company have?");
        this.techsNumber=in2.nextInt();
        System.out.println("How many dispatchers does your company have?");
        this.dispNumber=in2.nextInt();
        System.out.println("the number: " + techsNumber);
        out = new FileWriter("company.txt");
        out.write("The company name: " + name);
        out.write(System.lineSeparator());
        for (int i=0; i<techsNumber; i++)
        {
            Tech tech = new Tech();
            tech.createTech();
            out.write(name + " has " + techsNumber + " techs");
            out.write(System.lineSeparator());
            out.write("Technician " + i+1 + ":");
            out.write(System.lineSeparator());
            out.write(tech.firstName + " " + tech.lastName);
            out.write(System.lineSeparator());
    }
            out.close();
}
    
    /**
     * Checks if the list of technicians is not empty.
     * 
     * @param ArrayList
     * @throws IlligalArgumentException if the array list is empty.
     */
    public void technicians(ArrayList<Tech> techs)
    {
        if (techs.isEmpty())
        {
            // Enforce preconditions specified above
            throw new IllegalArgumentException("The tech's list is empty");
        } 
        for (Tech t: techs)
        {
            t.techInfo();
    }
}

public void addTech()throws IOException
{
    Tech tech = new Tech();
    tech.createTech();
    out = new FileWriter("company.txt", true);
    out.write("Technician :");
    out.write(System.lineSeparator());
    out.write(tech.firstName + " " + tech.lastName);
    out.write(System.lineSeparator());
    out.close();
    
}
}
