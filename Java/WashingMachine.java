// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class WashingMachine extends Appliances
{
	private String energyClass;
	private String capacity;
	private int rotations;
	
    public WashingMachine()
	{
	   super();
	}  
	 
	 
	public WashingMachine(float code,String model,int yearOfModel,String designer,double price,int pieces,
	                      String energyClass,String capacity,int rotations)
	{
		super(code,model,yearOfModel,designer, price,pieces);
		this.energyClass =  energyClass;
		this.capacity = capacity;
		this.rotations = rotations;
	}
	
	public void setEnergyClass(String energyClass)
	{
		this.energyClass =  energyClass;
	}
	
	public String getEnergyClass()
	{
		return energyClass;
	}
	
	public void setCapacity(String capacity)
	{
		this.capacity = capacity;
	}
	
	public String getCapacity()
	{
		return capacity;
	}
	
	public void setRotations(int rotations)
	{
		this.rotations =  rotations;
	}
	
	public int getRotations()
	{
		return rotations;
	}
	
	public String getContents()
	{
		String s = super.getContents();
	    s = s + "\nEnergy Class: " + energyClass;
		s = s +"\nCapacity: " + capacity;
		s = s +"Rotations:"  + rotations;
	    return s;
	}//getContents
	
	
	public String toString()
	{
		return "Washing Machines details: \n--------------------------- " + super.toString()
	    +"\nEnergy Class: " + getEnergyClass() 
		+"\nCapacity: " + getCapacity()
		+"Rotations:"  + getRotations() ;
		
	}	
	
}// end of class