// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class Fridges extends Appliances
{
	private String type;
	private String energyClass;
	private String capacityUpKeep;       //  maintenance
	private String capacityDeepFreeze;
	
	public Fridges()
	{	
	    super();
	}
	
	public Fridges(float code,String model,int yearOfModel,String designer,double price,int pieces,
	              String type,String energyClass,String capacityUpKeep,String capacityDeepFreeze)
	{	
	    super(code,model,yearOfModel,designer, price,pieces);
	    this.type = type;
		this.energyClass = energyClass;
		this.capacityUpKeep = capacityUpKeep;
		this.capacityDeepFreeze = capacityDeepFreeze;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getType()
	{
		return type;
	}
	
	
	public void setEnergyClass(String energyClass)
	{
		this.energyClass =  energyClass;
	}
	
	public String getEnergyClass()
	{
		return energyClass;
	}
	
	public void setCapacityUpKeep(String capacityUpKeep)
	{
		this.capacityUpKeep = capacityUpKeep;
	}
	
	public String getCapacityUpKeep()
	{
		return capacityUpKeep;
	}
	
	public void setCapacityDeepFreeze(String capacityDeepFreeze)
	{
		this.capacityDeepFreeze = capacityDeepFreeze;
	}
	
	public String getCapacityDeepFreeze()
	{
		return capacityDeepFreeze;
	}
	
	public String getContents()
	{
		String s = super.getContents();
	    s = s + "\nType:" + type;
		s = s + "\nEnergy Class: " + energyClass;
		s = s + "\nCapacity UpKeep: " + capacityUpKeep;
		s = s + "\nCapacity Deep Freeze: " + capacityDeepFreeze;
	    return s;
	}//getContents
	
	
	
	public String toString()
	{
		return "Fridges details: \n------------------" + super.toString()
		+"\nType:" + getType()
		+"\nEnergy Class: " + getEnergyClass()
		+"\nCapacity UpKeep: " + getCapacityUpKeep()
		+"\nCapacity Deep Freeze: " + getCapacityDeepFreeze();
		
	}	
	
}// end of class