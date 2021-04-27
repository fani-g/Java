// Nikolina Karanastasi 3150063
// Fani Gouera 3150028

import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GraphicMenu extends JFrame implements ActionListener,MouseListener 
{
	
	private ImageIcon imIco1;
	// type devices
	private DefaultListModel listModel;
	private static ArrayList<String> types = new ArrayList<String>();
	private JList list;
	private JTextArea resultArea = new JTextArea("List of Available devices.\nIf you double click one of the devices,\nyou will see short information of them.\nIf you tripple click a model in the next \nlist you will see more details.",1,5);
	private JTextArea resultArea2 = new JTextArea("List of Orders ",2,5);
	private JTextArea resultArea3 = new JTextArea("List of Sales",2,5);
	
	// the models of the devices
	private static ArrayList<Devices> devices = new ArrayList<Devices>();
	private DefaultListModel listModel1;
	private JList list1;
	// Order
	private static ArrayList<Order> Order = new ArrayList<Order>();
	private DefaultListModel listModel2;
	private JList list2;
	// Sale
	private static ArrayList<Sale> Sale = new ArrayList<Sale>();
	private DefaultListModel listModel3;
	private JList list3;
	
	private JButton but1;
	private JButton but2;
	private JButton but3;
	private JButton but4;
	private JButton but5;
	
	
	
	
	public GraphicMenu()
	{
		setTitle("Graphic Menu");
		drawFrame();
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		but4.addActionListener(this);
		but5.addActionListener(this);
		list.addMouseListener(this);
		list1.addMouseListener(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == but1)
		{
			int k = list1.getSelectedIndex();
			if (k != -1)
			{
				int pos;
				for (int i=0; i<devices.size(); i++)
				{
					if (listModel1.get(k).equals(devices.get(i).getModel()))
					{
						pos=i;
						String name = (String)JOptionPane.showInputDialog(this, "Please give your name");
						String phone = (String)JOptionPane.showInputDialog(this, "Please give your phone number");
						Object[] a={"3/6/2016"};
						String saleDate = (String)JOptionPane.showInputDialog(this, "Please give your sale date",null,JOptionPane.QUESTION_MESSAGE,null,null,a[0]);
						if (!name.equals("")&& !phone.equals("")&&!saleDate.equals(""))
						{
							if (devices.get(pos).getPieces() >0)
							{
							   Sale sale=new Sale();
								int p=list.getSelectedIndex();
								if ((listModel.get(p).equals("Television"))||(listModel.get(p).equals("Dvds/Blue rays"))||(listModel.get(p).equals("Cameras")))
								{
									double cost=devices.get(pos).getPrice()-devices.get(pos).getPrice()*0.25;
									sale.setCost(cost);
									JOptionPane.showMessageDialog(null,"The total cost for this device is " + sale.getCost(),null,JOptionPane.INFORMATION_MESSAGE);
								}else if ((listModel.get(p).equals("Fridges"))||(listModel.get(p).equals("Washing Machines")))
								{
									double cost=devices.get(pos).getPrice()-devices.get(pos).getPrice()*0.20;
									sale.setCost(cost);
									JOptionPane.showMessageDialog(null,"The total cost for this device is " + sale.getCost(),null,JOptionPane.INFORMATION_MESSAGE);
								}else if (listModel.get(p).equals("Consoles"))
								{
									double cost=devices.get(pos).getPrice()-devices.get(pos).getPrice()*0.10;
									sale.setCost(cost);
									JOptionPane.showMessageDialog(null,"The total cost for this device is " + sale.getCost(),null,JOptionPane.INFORMATION_MESSAGE);
								}
							    sale.setDevice(devices.get(pos).getModel());
								sale.setName(name);
								sale.setPhone(phone);
								sale.setSaleDate(saleDate);
							
								if (Sale.size()== 0)
								{
									sale.setSaleCode(100);
								}else{
									for(int j=0; j <Sale.size(); j++)
									{
										sale.setSaleCode(100+j+1);
									}
								}
								Sale.add(sale);
								listModel3.addElement(listModel1.get(k));
								int pieces = devices.get(pos).getPieces();
								devices.get(pos).setPieces( pieces -1);
						}else{
							JOptionPane.showMessageDialog(null,"There aren't available pieces of this device.You have to order it.",null,JOptionPane.WARNING_MESSAGE);
							
						}	
					}
					}
				}
				
				
			}
		}else if (e.getSource() == but2)
		{
			int k = list1.getSelectedIndex();
			if (k != -1)
			{
				int pos;
				for (int i = 0; i<devices.size(); i++)
				{
					if (listModel1.get(k).equals(devices.get(i).getModel()))
					{
						pos = i;
						String name = (String)JOptionPane.showInputDialog(this, "Please give your name");
						String phone = (String)JOptionPane.showInputDialog(this, "Please give your phone number");
						Object[] a={"3/6/2016"};
						String orderDate = (String)JOptionPane.showInputDialog(this, "Please give your order date",null,JOptionPane.QUESTION_MESSAGE,null,null,a[0]);
						Object[] b={"18/6/2016"};
						String arrivalDate = (String)JOptionPane.showInputDialog(this, "Please give your arrival date",null,JOptionPane.QUESTION_MESSAGE,null,null,b[0]);
						if (!name.equals("")&& !phone.equals("")&&!orderDate.equals("")&&!arrivalDate.equals(""))
						{
							Order order =new Order();
							int p=list.getSelectedIndex();
							if ((listModel.get(p).equals("Television"))||(listModel.get(p).equals("Dvds/Blue rays"))||(listModel.get(p).equals("Cameras")))
							{
								double cost=devices.get(pos).getPrice()-devices.get(pos).getPrice()*0.25;
								order.setCost(cost);
								JOptionPane.showMessageDialog(null,"The total cost for this device is " + order.getCost(),null,JOptionPane.INFORMATION_MESSAGE);
							}else if ((listModel.get(p).equals("Fridges"))||(listModel.get(p).equals("Washing Machines")))
							{
								double cost=devices.get(pos).getPrice()-devices.get(pos).getPrice()*0.20;
								order.setCost(cost);
								JOptionPane.showMessageDialog(null,"The total cost for this device is " + order.getCost(),null,JOptionPane.INFORMATION_MESSAGE);
							}else if (listModel.get(p).equals("Consoles"))
							{
								double cost=devices.get(pos).getPrice()-devices.get(pos).getPrice()*0.10;
								order.setCost(cost);
								JOptionPane.showMessageDialog(null,"The total cost for this device is " + order.getCost(),null,JOptionPane.INFORMATION_MESSAGE);
							}
						    order.setDevice(devices.get(pos).getModel());
							order.setName(name);
							order.setPhone(phone);
							order.setOrderDate(orderDate);
							order.setArrivalDate(arrivalDate);
						    order.setCondition(false);
							if (Order.size()== 0)
							{
								order.setOrderCode(100);
							}else{
								for(int j=0; j <Order.size(); j++)
								{
									order.setOrderCode(100+j+1);
								}
							}
							Order.add(order);
							listModel2.addElement(listModel1.get(k));
					    }	
					}
	            }
			}
		
		}
		else if (e.getSource() == but3)
		{
			int i=list2.getSelectedIndex();
			if (i!=-1)
			{
				Object[] a = {"3/6/2016"};
				String date = (String)JOptionPane.showInputDialog(this, "Please give the arrival date",null,JOptionPane.QUESTION_MESSAGE,null,null,a[0]);
				int pos;
				for (int j = 0; j<Order.size(); j++ )
				{
					if (listModel2.get(i).equals(Order.get(j).getDevice()) && date.equals(Order.get(j).getArrivalDate()))
					{
						pos = j;
						Order.get(pos).setCondition(true);
						listModel3.addElement(listModel2.get(i));
						JOptionPane.showMessageDialog(null,"The ordered device has been bought");
					}
					
				}
			}
			
		}
		else if (e.getSource() == but4)
		{
			String name = (String)JOptionPane.showInputDialog(this, "Please give your name to find your order");
			int k=-1;
			for (int i =0; i<Order.size(); i++)
			{
				if (name.equals(Order.get(i).getName()))
				{
					k = i;
				    JOptionPane.showMessageDialog(null,"You have the following order: " + Order.get(k).getDevice(),null,JOptionPane.INFORMATION_MESSAGE);
				}		
			}  
			list2.setSelectedIndex(k);	
		}
		else if (e.getSource() == but5)
		{
			
			String name = (String)JOptionPane.showInputDialog(this, "Please give your name to find your sale");
			int k=-1;
			for (int i =0; i<Sale.size(); i++)
			{
				if (name.equals(Sale.get(i).getName()))
				{
					k = i;
				    JOptionPane.showMessageDialog(null,"You have the following sale: " + Sale.get(k).getDevice(),null,JOptionPane.INFORMATION_MESSAGE);
				}
				
				list3.setSelectedIndex(k);		
			}	
		}			
		
	}// end of  actionPerformed
	
	public void mouseClicked(MouseEvent event)
	{
		int i = list.getSelectedIndex();
		if (event.getClickCount()==2)
		{
			listModel1.removeAllElements();
			if (list.getSelectedIndex() != -1)
			{
				if (i==0)
				{
					String outputText = "Manufacturer: " +devices.get(i).getDesigner() + "," + devices.get(i+1).getDesigner()
										+"\nModels: " +devices.get(i).getModel() + "," + devices.get(i+1).getModel();
					resultArea.setText(outputText);
					listModel1.addElement(devices.get(i).getModel());
					listModel1.addElement(devices.get(i+1).getModel());
				}
				if (i==1)
				{
					String outputText = "Manufacturer: " +devices.get(i+1).getDesigner() + "," + devices.get(i+2).getDesigner()
										+"\nModels: " +devices.get(i+1).getModel() + "," + devices.get(i+2).getModel();
					resultArea.setText(outputText);
					listModel1.addElement(devices.get(i+1).getModel());
					listModel1.addElement(devices.get(i+2).getModel());
				}
				if (i==2)
				{
					String outputText = "Manufacturer: " +devices.get(i+2).getDesigner() + "," + devices.get(i+3).getDesigner()
										+"\nModels: " +devices.get(i+2).getModel() + "," + devices.get(i+3).getModel();				
					resultArea.setText(outputText);
					listModel1.addElement(devices.get(i+2).getModel());
					listModel1.addElement(devices.get(i+3).getModel());
				}
				if (i==3)
				{
					String outputText = "Manufacturer: " +devices.get(i+3).getDesigner() + "," + devices.get(i+4).getDesigner()
											+"\nModels: " +devices.get(i+3).getModel() + "," + devices.get(i+4).getModel();
					resultArea.setText(outputText);
					listModel1.addElement(devices.get(i+3).getModel());
					listModel1.addElement(devices.get(i+4).getModel());
				}
				if (i==4)
				{
					String outputText = "Manufacturer: " +devices.get(i+4).getDesigner() + "," + devices.get(i+5).getDesigner()
											+"\nModels: " +devices.get(i+4).getModel() + "," + devices.get(i+5).getModel();
					resultArea.setText(outputText);
					listModel1.addElement(devices.get(i+4).getModel());
					listModel1.addElement(devices.get(i+5).getModel());
				}
				if (i==5)
				{
					String outputText = "Manufacturer: " +devices.get(i+5).getDesigner() + "," + devices.get(i+6).getDesigner()
										+"\nModels: " +devices.get(i+5).getModel() + "," + devices.get(i+6).getModel();
					resultArea.setText(outputText);
					listModel1.addElement(devices.get(i+5).getModel());
					listModel1.addElement(devices.get(i+6).getModel());
				}
			}
			
			
		}
		int k = list1.getSelectedIndex();
	
		
		if (event.getClickCount()==3) // tripple ckick
		{
			
			if (k !=-1) 
			{ 
				if(i==0)
				{
					if(k==0)
					{
						String pathimage = devices.get(0).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(0).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}else{
						String pathimage = devices.get(1).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(1).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}
			    }else if(i==1)
				{
					if(k==0)
					{
						String pathimage = devices.get(2).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(2).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}else{
						String pathimage = devices.get(3).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(3).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}
				}else if(i==2)
				{
					if(k==0)
					{
						String pathimage = devices.get(4).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(4).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
				   }else{
						String pathimage = devices.get(5).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(5).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}
				}else if(i==3)
				{
					if(k==0)
					{
						String pathimage = devices.get(6).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(6).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}else{
						String pathimage = devices.get(7).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(7).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}	
				}else if(i==4)
				{
					if(k==0)
					{
						String pathimage = devices.get(8).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(8).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}else{
						String pathimage = devices.get(9).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(9).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}	
				}else if(i==5)
				{
					if(k==0)
					{
						String pathimage = devices.get(10).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(10).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}else{
						String pathimage = devices.get(11).getImagePath();
						ImageIcon icon=new ImageIcon(pathimage);
						JOptionPane.showMessageDialog(null,"details: \n" +devices.get(11).getContents(),"more details",JOptionPane.INFORMATION_MESSAGE,icon);
					}
				}
			}	
				  
		}
	}// end of mouseClicked
		 

	
	public void mouseExited(MouseEvent event){}
	public void mouseEntered(MouseEvent event){}
	public void mouseReleased(MouseEvent event){}
	public void mousePressed(MouseEvent event){}

	
	private void drawFrame()
	{
		setBounds(0, 300, 350, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		listModel = new DefaultListModel();
		for (int i=0; i<types.size(); i++)
		{
			listModel.addElement(types.get(i));
		}
		list = new JList(listModel);
		listModel2 = new DefaultListModel();
		list2 = new JList(listModel2);
		listModel3 = new DefaultListModel();
		list3 = new JList(listModel3);
		Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
		
		but1 = new JButton("Buy the device");
		but2 = new JButton("Order a device");
		but3 = new JButton("Arrival order & sale");
		but3.setLocation(300,300);
		but4 = new JButton("Search an order");
		but5 = new JButton("Search a sale");
		JPanel paneButton = new JPanel();
		paneButton.setLayout(new FlowLayout());
		JPanel paneButton2 = new JPanel();
		paneButton2.setLayout(new FlowLayout());
		JPanel paneButton3 = new JPanel();
		paneButton3.setLayout(new FlowLayout());
		paneButton.add(but1);
		
		paneButton2.add(but2);
		paneButton2.add(but3);
		paneButton2.add(but4);
		paneButton3.add(but5);
		resultArea.setFont(new Font("Serif", Font.ITALIC, 18)); 
		resultArea.setForeground(Color.RED);      
		resultArea.setEditable(false);          
		paneButton.add(resultArea);
		
		resultArea2.setFont(new Font("Serif", Font.ITALIC, 18)); 
		resultArea2.setForeground(Color.RED);      
		resultArea2.setEditable(false);          
		paneButton2.add(resultArea2);
		resultArea3.setFont(new Font("Serif", Font.ITALIC, 18)); 
		resultArea3.setForeground(Color.RED);      
		resultArea3.setEditable(false);          
		paneButton3.add(resultArea3);
		
		
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(180, 300));
		JScrollPane listScroller2 = new JScrollPane(list2);
		listScroller2.setPreferredSize(new Dimension(180, 300));
		JScrollPane listScroller3 = new JScrollPane(list3);
		listScroller3.setPreferredSize(new Dimension(180, 300));
		listModel1 = new DefaultListModel();
	    list1 = new JList(listModel1);
	    JScrollPane listScroller1 = new JScrollPane(list1);
		listScroller1.setPreferredSize(new Dimension(180, 300));
		paneButton.add(listScroller);
		paneButton.add(listScroller1);
		paneButton2.add(listScroller2);
		paneButton3.add(listScroller3);
		cp.add(paneButton, BorderLayout.LINE_START);
		cp.add(paneButton2, BorderLayout.CENTER);
		cp.add(paneButton3, BorderLayout.LINE_END);
		pack();
	}
	
	private static final String a = "DVD Player";
	private static final String b = "Blue Ray";
	
	
	public static void main(String[] args)
	{
		//objects of Sound and Picture
		Television tv1 = new Television(155111,"32PHT4100",2013,"Philips",249,8,"LED",32,"1366 x 768","HDMI");
	    Television tv2 = new Television(154376,"KDL32R400C",2014,"Sony",279,2,"LED",32,"1366 x 768","HDMI");
	    DvdBlue db1 = new DvdBlue(160201,"BD-J4500R",2015,"Samsung",71.90,7,b,"BD-R");
	    DvdBlue db2 = new DvdBlue(148192,"FD23601",2013,"F&U",29.90,9,a,"DVD-RW");
	    Camera c1 = new Camera(153931,"Coolpix L31",2012,"Nikon",59.90,3,"Lifestyle",16,"5x","4x",2.7);
	    Camera c2 = new Camera(138361,"DSCW800",2014,"Sony",78.90,3,"Lifestyle",20.1,"5x","10x",2.7);
		
		// objects of Gaming
	    Gaming g1 = new Gaming(156919,"C Chassis",2014,"Sony",359,4,"PS4","AMD Jaguar x86-64, 8-Core","1.84 TFLOPS, AMD next-generation Radeon","Dolby Digital","500GB");
	    Gaming g2 = new Gaming(113202,"12GB PS3 console",2012,"Sony",205,5,"PS3","Cell Broadband EngineT Processor","RSX Reality Synthesizer","Dolby Digital 5.1 ch, DTS 5.1 ch, LPCM 7.1 ch, AAC","12GB");
		
		// objects of Appliances
	    Fridges fr1 = new Fridges(138313,"KDV29VW30",2005,"Bosch" ,405,6,"two doors","A++","70lt","194lt");
	    Fridges fr2 = new Fridges(122606,"KD29VVL30",2009,"Siemens",420,4,"two doors","A++","194lt","70lt");
	    WashingMachine wm1 = new WashingMachine(155676,"GS1483D3/1-S",2011,"Candy",299,3,"A+++","8kg",1400);
	    WashingMachine wm2 = new WashingMachine(152878,"WW70J3283KW/LE W",2012,"Samsung",250,6,"A+++","7kg",1200);
		
		types.add("Television");
		types.add("Dvds/Blue rays");
		types.add("Cameras");
		types.add("Consoles");
		types.add("Fridges");
		types.add("Washing Machines");
		
		devices.add(tv1);
		devices.add(tv2);
		devices.add(db1);
		devices.add(db2);
		devices.add(c1);
		devices.add(c2);
		devices.add(g1);
		devices.add(g2);
		devices.add(fr1);
		devices.add(fr2);
		devices.add(wm1);
		devices.add(wm2);
		
		tv1.setImagePath("Images/tv1.jpg");
		tv2.setImagePath("Images/tv2.jpg");
		db1.setImagePath("Images/db1.jpg");
		db2.setImagePath("Images/db2.jpg");
		c1.setImagePath("Images/c1.jpg");
		c2.setImagePath("Images/c2.jpg");
		g1.setImagePath("Images/g1.jpg");
		g2.setImagePath("Images/g2.jpg");
		fr1.setImagePath("Images/fr1.jpg");
		fr2.setImagePath("Images/fr2.jpg");
		wm1.setImagePath("Images/wm1.jpg");
		wm2.setImagePath("Images/wm2.jpg");
		
	
		GraphicMenu frame = new GraphicMenu();

	}
}// end of class