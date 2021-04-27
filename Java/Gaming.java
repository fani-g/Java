// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class Gaming extends Devices
{
	private String type;
	private String processor;
	private String graphics;
	private String sound;
	private String capacityHD;
	private  double discount = 0.10;
    private double newPrice;
	
	
	public Gaming()
	{
	    super();
	}
	
	public Gaming(float code,String model,int yearOfModel,String designer,double price,int pieces,
	                String type,String processor,String graphics,String sound,String capacityHD)
	{
		super(code,model,yearOfModel,designer, price,pieces);
	    this.type = type;
		this.processor = processor;
		this.graphics = graphics;
		this.sound = sound;
		this.capacityHD = capacityHD;
	}
	
	
	
	
	public double discount1(double price)
	{
	    newPrice = price - (price * discount);
		return newPrice;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	
	public void setProcessor(String processor)
	{
		this.processor = processor;
	}
	
	public String getProcessor()
	{
		return processor;
	}
	
	public void setGraphics(String graphics)
	{
		this.graphics = graphics;
	}
	
	public String getGraphics()
	{
		return graphics;
	}
	
	public void setSound(String sound)
	{
		this.sound = sound;
	}
	
	public String getSound()
	{
		return sound;
	}
	
	public void setCapacityHD(String capacityHD)
	{
		this.capacityHD = capacityHD;
	}
	
	public String getCapacityHD()
	{
		return capacityHD;
	}
	
	public String getContents()
	{
		String s = super.getContents();
	    s = s +"\nType:" + type;
		s = s +"\nProcessor: " + processor;
		s = s +"\nGraphics: " + graphics;
		s = s +"\nSound: " + sound;
		s = s +"\nCapacity HD: " + capacityHD;
	    return s;
	}//getContents
	
	
	
	
	public String toString()
	{
		return "Consoles details: \n------------------\n" + super.toString()
		+"\nType:" + getType()
		+"\nProcessor: " + getProcessor()
		+"\nGraphics: " + getGraphics()
		+"\nSound: " + getSound()
		+"\nCapacity HD: " + getCapacityHD();
		
	}	
	
}// end of class