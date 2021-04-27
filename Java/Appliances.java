// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class Appliances extends Devices
{

    private static final double discount = 0.20;
    private double newPrice;
   
    public Appliances()
    {
        super();
	}
	
	public Appliances(float code,String model,int yearOfModel,String designer,double price,int pieces)
	{
	    super(code,model,yearOfModel,designer, price,pieces);
	}

	public double discount3(double price)
	{
	    newPrice = price - (price * discount);
		return newPrice;
	}
	
	
	
	
}// end of class