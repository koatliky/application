package application;

/**
 * class Appliance is a superclass for basic appliances.
 * The class creates on object of appliances and takes manufacturer, serial number, and model number
 * information.
 *
 * @author (Kate Miz)
 * @version (1.01)
 */
public class Appliance
{
    private String model;
    private String serial;
    private String manufacturer;

    /**
     * Constructor for objects of class Appliance used when no info about an appliance is provided
     */
    public Appliance(){ }

    /**
     * Constructor for objects of class Appliance used when the initial information is provided
     */
    public Appliance (String manufacturer, String model, String serial)
    {
        this.model=model;
        this.serial=serial;
        this.setManufacturer(manufacturer);
    }

    public void setAttributes (String manufacturer, String model, String serial)
    {
        this.model=model;
        this.serial=serial;
        this.setManufacturer(manufacturer);
    }

    public String getModelNumber()
    {
        return model;
    }

    public String getSerialNumber()
    {
        return serial;
    }


	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}