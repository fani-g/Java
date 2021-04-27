// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class Sale
{

    private int saleCode;
	private String device;
	private String name;
	private String phone;
	private String saleDate;
	private double cost;
    
	public Sale(){
	}
	

    public Sale(int SaleCode,String device,String name,String phone,String saleDate,double cost)
	{
	    this.saleCode=saleCode;   
		this.device=device;
		this.name=name;
		this.phone=phone;
		this.saleDate=saleDate;
		this.cost=cost;
	
	}

     
	public void setSaleCode(int saleCode)
	{
		this.saleCode = saleCode;
	}
	
	public int getSaleCode()
	{
		return saleCode;
	}
	
	public void setDevice(String device)
	{
		this.device = device;
	}
	
	public String getDevice()
	{
		return device;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setSaleDate(String saleDate)
	{
		this.saleDate = saleDate;
	}
	
	public String getSaleDate()
	{
		return saleDate;
	}
	
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public double getCost()
	{
		return cost;
	}

}