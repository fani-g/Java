// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class Camera  extends SoundAndPicture
{
	private String type;
	private double megapixel;
	private String opticalZoom;
	private String digitalZoom;
	private double screenSize;
	
	public Camera()
	{
	  super();
	}
	
	public Camera(float code,String model,int yearOfModel,String designer,double price,int pieces,
	              String type,double megapixel,String opticalZoom, String digitalZoom,double screenSize)
	{
		super(code,model,yearOfModel,designer, price,pieces);
		this.type = type;
		this.megapixel = megapixel;
		this.opticalZoom = opticalZoom;
		this.digitalZoom = digitalZoom;
		this.screenSize = screenSize;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	
	public void setMegapixel(double megapixel)
	{
		this.megapixel = megapixel;
	}
	
	public double getMegapixel()
	{
		return megapixel;
	}
	
	public void setOpticalZoom(String opticalZoom)
	{
		this.opticalZoom = opticalZoom;
	}
	
	public String getOpticalZoom()
	{
		return opticalZoom;
	}
	
	public void setDigitalZoom(String digitalZoom)
	{
		this.digitalZoom = digitalZoom;
	}
	
	public String getDigitalZoom()
	{
		return digitalZoom;
	}
	
	public void setScreenSize(double screenSize)
	{
		this.screenSize = screenSize;
	}
	
	public double getScreenSize()
	{
		return screenSize;
	}
	
	
	public String getContents()
	{
		String s = super.getContents();
	    s = s +"\nType:" + type;
		s = s +"\nMegapixel: " + megapixel;
		s = s +"\nOptical zoom: " + opticalZoom;
		s = s +"\nDigital zoom: " + digitalZoom;
		s = s +"\nSize of screen: " + screenSize;
	    return s;
	}//getContents
	
	
    public String toString()
	{
		return "Cameras details: \n------------------ " + super.toString()
	    +"\nType:" + getType()
		+"\nMegapixel: " +getMegapixel()
		+"\nOptical zoom: " + getOpticalZoom()
		+"\nDigital zoom: " + getDigitalZoom()
		+"\nSize of screen: " + getScreenSize();
		
	}	
	
}// end of class