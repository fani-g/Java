// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class Television extends SoundAndPicture
{
    private String type;
	private double dimensions;   
	private String analysis;
	private String ports;
	
	public Television()
	{
	   super();
	}
	
	public Television(float code,String model,int yearOfModel,String designer,double price,int pieces,
	                 String type,double dimensions,String analysis,String ports)
	{
		super(code,model,yearOfModel,designer, price,pieces);
		this.type = type;
		this.dimensions = dimensions;
		this.analysis = analysis;
		this.ports = ports;
	}
	
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	public void setDimensions(double dimensions)
	{
		this.dimensions = dimensions;
	}
	
	public double getDimensions()
	{
		return dimensions;
	}
	
	public void setAnalysis(String analysis)
	{
		this.analysis = analysis;
	}
	
	public String getAnalysis()
	{
		return analysis;
	}
	
	public void setPorts(String ports)
	{
		this.ports = ports;
	}
	
	public String getPorts()
	{
		return ports;
	}
	
	public String getContents()
	{
		String s = super.getContents();
	    s = s + "\ntype: " + type;
	    s = s + "\ndimensions: " +dimensions;
		s = s + "\nanalysis: " +analysis;
		s = s + "\nports: " +ports; 
	    return s;
	}//getContents
	
   
	public String toString()
	{
		return "TV details: \n-----------------" + super.toString()
		+"\nType:" + getType()
		+"\nDimensions: " + getDimensions()
		+"\nAnalysis: " + getAnalysis()
		+"\nPorts: " + getPorts();
		
	}
	
	
}// end of class