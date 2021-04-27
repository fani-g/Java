// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

public class Order
{

    private int orderCode;
	private String device;
	private String name;
	private String phone;
	private String orderDate;
	private String arrivalDate;
	private double cost;
	private boolean condition;
	
	public Order(){
	}
	
	public Order(int orderCode,String device,String name,String phone,String orderDate,String arrivalDate,double cost,boolean condition){
	    this.orderCode=orderCode;   
		this.device=device;
		this.name=name;
		this.phone=phone;
		this.orderDate=orderDate;
		this.arrivalDate=arrivalDate;
		this.cost=cost;
		this.condition=condition;
	
	}
	
	public void setOrderCode(int orderCode)
	{
		this.orderCode = orderCode;
	}
	
	public int getOrderCode()
	{
		return orderCode;
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
	
	public void setOrderDate(String orderDate)
	{
		this.orderDate = orderDate;
	}
	
	public String getOrderDate()
	{
		return orderDate;
	}
	
	public void setArrivalDate(String arrivalDate)
	{
		this.arrivalDate = arrivalDate;
	}
	
	public String getArrivalDate()
	{
		return arrivalDate;
	}
	
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public void setCondition(boolean condition)
	{
		this. condition= condition;
	}
	
	public boolean getCondition()
	{
		return condition;
	}

    public String toString()
	{
		return "Order details: \n---------------- \nOrder code: " + getOrderCode()
		+"\nDevice: " + getDevice()
		+"\nName: " + getName()
		+"\nPhone: " + getPhone()
		+"\nDate: " + getOrderDate()
		+"\nArrival date: " + getArrivalDate()
		+"\nCost: " + getCost()
		+"\nCondition(if the order is expected(false) or is executed(true)): " + getCondition();
	}

}