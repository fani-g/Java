// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class DvdBlue extends SoundAndPicture
{
	private String type;
	private String format;
	
	
	public DvdBlue()
	{
	   super();
	}
	
	public DvdBlue(float code,String model,int yearOfModel,String designer,double price,int pieces,
	              String type,String format)
	{
		super(code,model,yearOfModel,designer, price,pieces);
	    this.type = type;
		this.format = format;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setFormat(String format)
	{
		this.format = format;
	}
	
	public String getFormat()
	{
		return format;
	}
	
	public String getContents()
	{
		String s = super.getContents();
	    s = s +"\nType:" + type;
		s = s + "\nFormat: " + format;
	    return s;
	}//getContents
	
    
	public String toString()
	{
		return "DVD player/Blue ray details: \n-----------------------------" + super.toString()
		+"\nType:" + getType()
		+"\nFormat: " + getFormat();
	}	
	
}// end of class