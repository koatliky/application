package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a description of class Dishwasher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Dishwasher extends Appliance
{
    private BufferedReader reader;
    private HashMap <String, Integer> parts = new HashMap <String, Integer>();
    public ArrayList<WorkOrder> history = new ArrayList<WorkOrder>();

    public void findParts (String modelNumber)
    {
        String[] data;
        try {
            reader = new BufferedReader(new FileReader("washParts.csv"));
            String line="";
             while (line != null)
                {
                    line = reader.readLine();
                    data=line.split(",");
                    if (data[0].equals(modelNumber))
                    {
                    for (int i=1; i<data.length; i += 2){
                       String temp = data[i+1];
                       int number = Integer.parseInt(temp);
                       if (number!=0)
                       {
                       parts.put(data[i], number);
                    }
                     }
                }
            }
            reader.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("File missing");
        }
        catch(IOException e) {
            System.out.println("NO!");
        }
    }

    public HashMap<String, Integer> getParts()
    {
        return parts;
    }

    public int numberOfParts (String partName)
    {
        return parts.get(partName);
    }

    public ArrayList<WorkOrder> getHistory ()
    {
        return history;
    }
}