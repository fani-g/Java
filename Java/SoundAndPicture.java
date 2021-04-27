// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class SoundAndPicture extends Devices
{
   private static final double discount = 0.25;
   private double newPrice;
   
   
	public SoundAndPicture()
	{
	   super();
	}
	
    public SoundAndPicture(float code,String model,int yearOfModel,String designer,double price,int pieces)
	{
	    super(code,model,yearOfModel,designer, price,pieces);
	}
	
	public double discount2(double price)
	{
	    newPrice = price - (price * discount);
		return newPrice;
	}
	
	
}// end of class