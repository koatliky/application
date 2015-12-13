package application;
import java.util.ArrayList;
import java.util.Scanner;


public class Property
{
private String addressID;
private String address;
private String keyNumber;
private int numberOfFloors;
private int numberOfBedrooms;
private int numberOfBathrooms;
public String city;
public String state;
public String zip;
public ArrayList<Appliance> appliances = new ArrayList<Appliance>();

    public Property() {  }

    public Property(String addressID, String keyNumber, int numberOfFloors, int numberOfBedrooms, int numberOfBathrooms)
    {
        this.setAddressID(addressID);
        this.setKeyNumber(keyNumber);
        this.setNumberOfFloors(numberOfFloors);
        this.setNumberOfBedrooms(numberOfBedrooms);
        this.setNumberOfBathrooms(numberOfBathrooms);
    }
    
    public void addPhysicalAddress(String address, String city, String state, String zip)
    {
        this.setAddress(address);
        this.city=city;
        this.state=state;
        this.zip=zip;
    }
    
    public void addDishwasher()
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Type: ");
        String type=in.next();
        System.out.println("Serial#: ");
        String serial=in.next();
        System.out.println("Model#: ");
        String model=in.next();
        Dishwasher dishwasher= new Dishwasher();
        dishwasher.setAttributes(type, serial, model);
        appliances.add(dishwasher);
    }
    
    public ArrayList<Appliance> getAppliances()
    {
        return appliances;
    }

	public String getAddressID() {
		return addressID;
	}

	public void setAddressID(String addressID) {
		this.addressID = addressID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getKeyNumber() {
		return keyNumber;
	}

	public void setKeyNumber(String keyNumber) {
		this.keyNumber = keyNumber;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}

	public int getNumberOfBathrooms() {
		return numberOfBathrooms;
	}

	public void setNumberOfBathrooms(int numberOfBathrooms) {
		this.numberOfBathrooms = numberOfBathrooms;
	}
 


}