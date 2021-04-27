// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class Devices
{
    private float code;
	private String model;
	private int yearOfModel;     // the common characteristics of all the devices
	private String designer;
	private double price;
	private int pieces;
	private String imagePath;
	
	
	public Devices(){ 
	}
    
	public Devices(float code,String model,int yearOfModel,String designer,double price,int pieces)
	{
		this.code = code;
		this.model = model;
		this.yearOfModel = yearOfModel;
		this.designer = designer;
		this.price = price;
		this.pieces=pieces;
	}
	
	public void setCode(float code)
	{
		this.code = code;
	}
	
	public float getCode()
	{
		return code;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setYearOfModel(int yearOfModel)
	{
		this.yearOfModel = yearOfModel;
	}
	
	public int getYearOfModel()
	{
		return yearOfModel;
	}
	
	public void setDesigner(String designer)
	{
		this.designer = designer;
	}
	
	public String getDesigner()
	{
		return designer;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	
	public void setPieces(int pieces)
	{
		this.pieces = pieces;
	}
	
	public int getPieces()
	{
		return pieces;
	}
	
	  public void setImagePath(String path)
	{
		imagePath = path;
	}
	
	
	public String getImagePath()
	{
		return imagePath;
	}
    
	
	public String toString()
	{
		return "\nCode: " + getCode()
		+"\nModel: " + getModel()
		+"\nYear of Model: " + getYearOfModel()
		+"\nDesigner: " + getDesigner()
		+"\nPrice: " + getPrice();
	}
	
	public String getContents()
	{
		String s = new String("model: " + model);
	    s = s + "\ncode: " + code;
	    s = s + "\nPrice: " + price;
		s = s + "\ndesigner: " + designer;
		s = s + "\nyear of model: " +yearOfModel; 
	    return s;
	}//getContents
	
}// end of class