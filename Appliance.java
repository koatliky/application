package application;

import javafx.scene.image.Image;

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
	private Image image;

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
    
    public void addImage(String imageName)
    {
        setImage(new Image(imageName));
    }

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
}