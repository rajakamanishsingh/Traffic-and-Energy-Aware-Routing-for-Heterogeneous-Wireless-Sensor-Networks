import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.*;

public class Router extends JFrame implements ActionListener
{
	JPanel p1;
	ImageIcon Red,Black,Green,c1;
	JLabel n1,n2,n3,n4,n5,n6,n7,n8;
	JLabel n9,n10,n11,n12,n13,n14,n15,n16;
	JLabel n17,n18,n19,n20,n21,n22,n23,n24;
	JLabel n25,n26,n27,n28,n29,n30,n31,n32;
	
	JLabel clust1,clust2,clust3,clust4;
	
	MenuBar mbr;
	MenuItem i1,i2;
	Menu m1;
	
	public Font f1 = new Font("Times new roman", Font.BOLD, 18);
	public Font f2 = new Font("Times new roman", Font.BOLD, 16);
	
	
	String node1="Node1",node2="Node2",node3="Node3" ,node4="Node4",node5="Node5",node6="Node6",node7="Node7",node8="Node8";
	String node9="Node9",node10="Node10",node11="Node11" ,node12="Node12",node13="Node13",node14="Node14",node15="Node15",node16="Node16";
	String node17="Node17",node18="Node18",node19="Node19" ,node20="Node20",node21="Node21",node22="Node22",node23="Node23",node24="Node24";
	String node25="Node25",node26="Node26",node27="Node27" ,node28="Node28",node29="Node29",node30="Node30",node31="Node31",node32="Node32";
	
	String dis1="",dis2="",dis3="",dis4="",dis5="",dis6="",dis7="",dis8="",dis9="",dis10="";
	String dis11="",dis12="",dis13="",dis14="",dis15="",dis16="",dis17="",dis18="",dis19="",dis20="";
	String dis21="",dis22="",dis23="",dis24="",dis25="",dis26="",dis27="",dis28="",dis29="",dis30="";
	String dis31="",dis32="";
	
	
	Router()
	{
		p1=new JPanel();
		p1.setLayout(null);
		setTitle("Router : Co-relation Degree Clustering");
		p1.setBackground(Color.orange);
		
		mbr=new MenuBar();
		setMenuBar(mbr);
		
		m1=new Menu("File");
		i1=new MenuItem("Assign Values");
		i2=new MenuItem("View NodeDetails");
		m1.add(i1);
		m1.add(i2);
		mbr.add(m1);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		
		Red=new ImageIcon(this.getClass().getResource("images\\r1.png"));
		Black=new ImageIcon(this.getClass().getResource("images\\b1.png"));
		Green=new ImageIcon(this.getClass().getResource("images\\g1.png"));
		c1=new ImageIcon(this.getClass().getResource("images\\c1.png"));
		
		
		
		
		n1=new JLabel();           
		n1.setIcon(Black);         
		n1.setBounds(80,80,60,60); 
		
		JLabel t1=new JLabel();     
		t1.setText("n1");           
		t1.setForeground(Color.white);
		t1.setBounds(90,80,60,60);
		p1.add(t1);
		
		
		n2=new JLabel();
		n2.setIcon(Black);
		n2.setBounds(150,80,60,60);
		
		JLabel t2=new JLabel();
		t2.setText("n2");
		t2.setForeground(Color.white);
		t2.setBounds(160,80,60,60);
		p1.add(t2);
		
		n3=new JLabel();
		n3.setIcon(Black);
		n3.setBounds(220,80,60,60);
		
		JLabel t3=new JLabel();
		t3.setText("n3");
		t3.setForeground(Color.white);
		t3.setBounds(230,80,60,60);
		p1.add(t3);
		
		n4=new JLabel();
		n4.setIcon(Black);
		n4.setBounds(60,150,60,60);
		
		JLabel t4=new JLabel();
		t4.setText("n4");
		t4.setForeground(Color.white);
		t4.setBounds(70,150,60,60);
		p1.add(t4);
		
		
		n5=new JLabel();
		n5.setIcon(Black);
		n5.setBounds(130,150,60,60);
		
		JLabel t5=new JLabel();
		t5.setText("n5");
		t5.setForeground(Color.white);
		t5.setBounds(140,150,60,60);
		p1.add(t5);
		
		n6=new JLabel();
		n6.setIcon(Black);
		n6.setBounds(190,150,60,60);
		
		JLabel t6=new JLabel();
		t6.setText("n6");
		t6.setForeground(Color.white);
		t6.setBounds(200,150,60,60);
		p1.add(t6);
		
		n7=new JLabel();
		n7.setIcon(Black);
		n7.setBounds(120,220,60,60);
		
		JLabel t7=new JLabel();
		t7.setText("n7");
		t7.setForeground(Color.white);
		t7.setBounds(130,220,60,60);
		p1.add(t7);
		
		n8=new JLabel();
		n8.setIcon(Black);
		n8.setBounds(220,220,60,60);
		
		JLabel t8=new JLabel();
		t8.setText("n8");
		t8.setForeground(Color.white);
		t8.setBounds(230,220,60,60);
		p1.add(t8);
		
		n9=new JLabel();
		n9.setIcon(Black);
		n9.setBounds(420,80,60,60);
		
		JLabel t9=new JLabel();
		t9.setText("n9");
		t9.setForeground(Color.white);
		t9.setBounds(430,80,60,60);
		p1.add(t9);
		
		
		n10=new JLabel();
		n10.setIcon(Black);
		n10.setBounds(500,80,60,60);
		
		JLabel t10=new JLabel();
		t10.setText("n10");
		t10.setForeground(Color.white);
		t10.setBounds(510,80,60,60);
		p1.add(t10);
		
		n11=new JLabel();
		n11.setIcon(Black);
		n11.setBounds(570,80,60,60);
		
		JLabel t11=new JLabel();
		t11.setText("n11");
		t11.setForeground(Color.white);
		t11.setBounds(580,80,60,60);
		p1.add(t11);
		
		n12=new JLabel();
		n12.setIcon(Black);
		n12.setBounds(450,150,60,60);
		
		JLabel t12=new JLabel();
		t12.setText("n12");
		t12.setForeground(Color.white);
		t12.setBounds(460,150,60,60);
		p1.add(t12);
		
		
		n13=new JLabel();
		n13.setIcon(Black);
		n13.setBounds(530,150,60,60);
		
		JLabel t13=new JLabel();
		t13.setText("n13");
		t13.setForeground(Color.white);
		t13.setBounds(540,150,60,60);
		p1.add(t13);
		
		n14=new JLabel();
		n14.setIcon(Black);
		n14.setBounds(600,150,60,60);
		
		JLabel t14=new JLabel();
		t14.setText("n14");
		t14.setForeground(Color.white);
		t14.setBounds(610,150,60,60);
		p1.add(t14);
		
		n15=new JLabel();
		n15.setIcon(Black);
		n15.setBounds(410,220,60,60);
		
		JLabel t15=new JLabel();
		t15.setText("n15");
		t15.setForeground(Color.white);
		t15.setBounds(420,220,60,60);
		p1.add(t15);
		
		n16=new JLabel();
		n16.setIcon(Black);
		n16.setBounds(480,220,60,60);
		
		JLabel t16=new JLabel();
		t16.setText("n16");
		t16.setForeground(Color.white);
		t16.setBounds(490,220,60,60);
		p1.add(t16);
		
	    n17=new JLabel();
	    n17.setIcon(Black);
	    n17.setBounds(80,340,60,60);
	    
		JLabel t17=new JLabel();     
		t17.setText("n17");           
		t17.setForeground(Color.white);
		t17.setBounds(90,340,60,60);
		p1.add(t17);
		
		
		n18=new JLabel();
		n18.setIcon(Black);
		n18.setBounds(150,340,60,60);
		
		JLabel t18=new JLabel();
		t18.setText("n18");
		t18.setForeground(Color.white);
		t18.setBounds(160,340,60,60);
		p1.add(t18);
		
		n19=new JLabel();
		n19.setIcon(Black);
		n19.setBounds(220,340,60,60);
		
		JLabel t19=new JLabel();
		t19.setText("n19");
		t19.setForeground(Color.white);
		t19.setBounds(230,340,60,60);
		p1.add(t19);
		
		n20=new JLabel();
		n20.setIcon(Black);
		n20.setBounds(60,400,60,60);
		
		JLabel t20=new JLabel();
		t20.setText("n20");
		t20.setForeground(Color.white);
		t20.setBounds(70,400,60,60);
		p1.add(t20);
		
	
		n21=new JLabel();
		n21.setIcon(Black);
		n21.setBounds(130,400,60,60);
		
		JLabel t21=new JLabel();
		t21.setText("n21");
		t21.setForeground(Color.white);
		t21.setBounds(140,400,60,60);
		p1.add(t21);
		
		n22=new JLabel();
		n22.setIcon(Black);
		n22.setBounds(190,400,60,60);
		
		JLabel t22=new JLabel();
		t22.setText("n22");
		t22.setForeground(Color.white);
		t22.setBounds(200,400,60,60);
		p1.add(t22);
		
		n23=new JLabel();
		n23.setIcon(Black);
		n23.setBounds(120,470,60,60);
		
		JLabel t23=new JLabel();
		t23.setText("n23");
		t23.setForeground(Color.white);
		t23.setBounds(130,470,60,60);
		p1.add(t23);
		
		
		n24=new JLabel();
		n24.setIcon(Black);
		n24.setBounds(220,470,60,60);
		
		JLabel t24=new JLabel();
		t24.setText("n24");
		t24.setForeground(Color.white);
		t24.setBounds(230,470,60,60);
		p1.add(t24);
		
		n25=new JLabel();
		n25.setIcon(Black);
		n25.setBounds(420,340,60,60);
		
		JLabel t25=new JLabel();
		t25.setText("n25");
		t25.setForeground(Color.white);
		t25.setBounds(430,340,60,60);
		p1.add(t25);
		
		
		n26=new JLabel();
		n26.setIcon(Black);
		n26.setBounds(500,340,60,60);
		
		JLabel t26=new JLabel();
		t26.setText("n26");
		t26.setForeground(Color.white);
		t26.setBounds(510,340,60,60);
		p1.add(t26);
		
		n27=new JLabel();
		n27.setIcon(Black);
		n27.setBounds(570,340,60,60);
		
		JLabel t27=new JLabel();
		t27.setText("n27");
		t27.setForeground(Color.white);
		t27.setBounds(580,340,60,60);
		p1.add(t27);
		
		n28=new JLabel();
		n28.setIcon(Black);
		n28.setBounds(465,410,60,60);

		JLabel t28=new JLabel();
		t28.setText("n28");
		t28.setForeground(Color.white);
		t28.setBounds(475,410,60,60);
		p1.add(t28);
		
		
		n29=new JLabel();
		n29.setIcon(Black);
		n29.setBounds(535,410,60,60);
		
		JLabel t29=new JLabel();
		t29.setText("n29");
		t29.setForeground(Color.white);
		t29.setBounds(545,410,60,60);
		p1.add(t29);
		
		n30=new JLabel();
		n30.setIcon(Black);
		n30.setBounds(600,410,60,60);
		
		JLabel t30=new JLabel();
		t30.setText("n30");
		t30.setForeground(Color.white);
		t30.setBounds(610,410,60,60);
		p1.add(t30);
		
		n31=new JLabel();
		n31.setIcon(Black);
		n31.setBounds(410,480,60,60);
		
		JLabel t31=new JLabel();
		t31.setText("n31");
		t31.setForeground(Color.white);
		t31.setBounds(420,480,60,60);
		p1.add(t31);
		
		n32=new JLabel();
		n32.setIcon(Black);
		n32.setBounds(480,480,60,60);
		
		JLabel t32=new JLabel();
		t32.setText("n16");
		t32.setForeground(Color.white);
		t32.setBounds(490,480,60,60);
		p1.add(t32);
		
		clust1=new JLabel();
		clust1.setIcon(c1);
		clust1.setBounds(25,25,320,300);
		clust2=new JLabel();
		clust2.setIcon(c1);
		clust2.setBounds(355,28,320,300);
		clust3=new JLabel();
		clust3.setIcon(c1);
		clust3.setBounds(25,285,320,300);
		clust4=new JLabel();
		clust4.setIcon(c1);
		clust4.setBounds(355,295,320,300);
		
		JLabel txt1=new JLabel();
		txt1.setText("CLUSTER1");
		txt1.setFont(f2);
		txt1.setBounds(120,280,100,30);
		p1.add(txt1);
		
		JLabel txt2=new JLabel();
		txt2.setText("CLUSTER2");
		txt2.setFont(f2);
		txt2.setBounds(420,280,100,30);
		p1.add(txt2);
		
		JLabel txt3=new JLabel();
		txt3.setText("CLUSTER3");
		txt3.setFont(f2);
		txt3.setBounds(120,540,100,30);
		p1.add(txt3);
		
		JLabel txt4=new JLabel();
		txt4.setText("CLUSTER4");
		txt4.setFont(f2);
		txt4.setBounds(420,550,100,30);
		p1.add(txt4);
		
		p1.add(n1);p1.add(n2);p1.add(n3);p1.add(n4);p1.add(n5);p1.add(n6);p1.add(n7);p1.add(n8);
		p1.add(n9);p1.add(n10);p1.add(n11);p1.add(n12);p1.add(n13);p1.add(n14);p1.add(n15);p1.add(n16);
		p1.add(n17);p1.add(n18);p1.add(n19);p1.add(n20);p1.add(n21);p1.add(n22);p1.add(n23);p1.add(n24);p1.add(n25);
		p1.add(n26);p1.add(n27);p1.add(n28);p1.add(n29);p1.add(n30);p1.add(n31);p1.add(n32);
		p1.add(clust1);p1.add(clust2);p1.add(clust3);p1.add(clust4);
		setSize(750,620);
		setVisible(true);
		add(p1);
		
		int[] ports = new int[]
			              		{8989};

			              		for (int i = 0; i < 1; i++)
			              		{
			              			Thread t = new Thread(new PortListener(ports[i]));
			              			t.setName("Listener-" + ports[i]);
			              			t.start();

			              		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource()==i1)
		{
			new AssignValues();
		}
		if(ae.getSource()==i2)
		{
			new ViewNDetails();
		}
		
	}
	
	class PortListener implements Runnable
	{
	
		
		int port;

		public PortListener(int port)
		{
			this.port = port;
		}

		public void run()
		{
			
			String Strength="";
			Dbcon db=new Dbcon();
			Connection connect=db.getConnection();
			
			
			
			String CH="";
			String snode="";
			String value="";
			
			
			
			if(this.port==8989)
			{
				try
				{
					
				
					ServerSocket sst = new ServerSocket(8989);
					Socket cn;
					while (true) 
					{
					cn = sst.accept();
					
					DataInputStream in3=new DataInputStream(cn.getInputStream());
					String fname=in3.readUTF();
					String ct=in3.readUTF();
					String dest=in3.readUTF();
					
					System.out.println(fname);
					System.out.println(ct);
					System.out.println(dest);
					
					
					//Start Action  For Cluster1
					
					System.out.println("calculation started");
					
					ResultSet r6=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node6+"'");
					if(r6.next()==true){dis6=r6.getString("Distance"); System.out.println(dis6);}
					
					ResultSet r7=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node7+"'");
					if(r7.next()==true){dis7=r7.getString("Distance"); System.out.println(dis7); }
					
					ResultSet r8=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node8+"'");
					if(r8.next()==true){dis8=r8.getString("Distance"); System.out.println(dis8); }
					
					System.out.println("DISTANCE CALCULATED");
					
					System.out.println("Dis6 "+dis6);
					System.out.println("Dis7 "+dis7);
					System.out.println("Dis8 "+dis8);
					
					
					Statement st=connect.createStatement();
					String s="select max(Energy) as Strength from Cluster1";
					ResultSet rs=st.executeQuery(s);
					if(rs.next()==true){Strength=rs.getString("Strength");}
					
					System.out.println(Strength);
					
					Statement st2=connect.createStatement();
					String s2="select * from Cluster1 where Energy='"+Strength+"'";
					
					
					ResultSet rs1=st.executeQuery(s2);
					if(rs1.next()==true)                                 // Cluster1
					{
						CH=rs1.getString("Nname");
						value=rs1.getString("Energy");
						
						System.out.println("Node: " +CH);
						System.out.println("Energy: " +value);
						System.out.println("Distance: " +rs1.getString(4));
						
					
						
						System.out.println("CH IS " +CH);
						System.out.println("VALUE IS " +value);
						
						if(CH.equalsIgnoreCase("Node1"))
						{
							Thread.sleep(2000);
							n1.setIcon(Green);      
							
							String cpath="";
							
							Statement stm=connect.createStatement();
							String sm="select min(Distance) as cpath from Cluster1";
							ResultSet rsm=stm.executeQuery(sm);
							if(rsm.next()==true){cpath=rsm.getString("cpath");}
							
							System.out.println("The Value of Cpath is "+cpath);
							
							Statement st33=connect.createStatement();
							String s23="select * from Cluster1 where Distance='"+cpath+"'";
							ResultSet rs34=st.executeQuery(s23);
							
							if(rs34.next()==true){snode=rs34.getString("Nname");}
							
							if(snode.equalsIgnoreCase("Node2"))
							{
								Thread.sleep(2000);
								n2.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node3"))
							{
								Thread.sleep(2000);
								n3.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node4"))
							{
								Thread.sleep(2000);
								n4.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node5"))
							{
								Thread.sleep(2000);
								n5.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node6"))
							{
								Thread.sleep(2000);
								n6.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node7"))
							{
								Thread.sleep(2000);
								n7.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node8"))
							{
								Thread.sleep(2000);
								n8.setIcon(Green);     
							}
							
							
						}
						if(CH.equalsIgnoreCase("Node2"))
						{
							Thread.sleep(2000);
							n2.setIcon(Green); 
							
							int num=2;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster1  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node3"))
							{
								Thread.sleep(2000);
								n3.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node4"))
							{
								Thread.sleep(2000);
								n4.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node5"))
							{
								Thread.sleep(2000);
								n5.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node6"))
							{
								Thread.sleep(2000);
								n6.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node7"))
							{
								Thread.sleep(2000);
								n7.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node8"))
							{
								Thread.sleep(2000);
								n8.setIcon(Green);     
							}
							
							
						}
						if(CH.equalsIgnoreCase("Node3"))
						{
							Thread.sleep(2000);
							n3.setIcon(Green);     
							
							int num=3;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster1  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node4"))
							{
								Thread.sleep(2000);
								n4.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node5"))
							{
								Thread.sleep(2000);
								n5.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node6"))
							{
								Thread.sleep(2000);
								n6.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node7"))
							{
								Thread.sleep(2000);
								n7.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node8"))
							{
								Thread.sleep(2000);
								n8.setIcon(Green);     
							}
						}
						if(CH.equalsIgnoreCase("Node4"))
						{
							Thread.sleep(2000);
							n4.setIcon(Green);  
							
							int num=4;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster1  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node5"))
							{
								Thread.sleep(2000);
								n5.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node6"))
							{
								Thread.sleep(2000);
								n6.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node7"))
							{
								Thread.sleep(2000);
								n7.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node8"))
							{
								Thread.sleep(2000);
								n8.setIcon(Green);     
							}
						}
						if(CH.equalsIgnoreCase("Node5"))
						{
							Thread.sleep(2000);
							n5.setIcon(Green);   
							
							if(Integer.parseInt(dis6)<=Integer.parseInt(dis7) && Integer.parseInt(dis6)<=Integer.parseInt(dis8) )
							{
								Thread.sleep(2000);
								n6.setIcon(Green);
							}
							if(Integer.parseInt(dis7)<=Integer.parseInt(dis8) && Integer.parseInt(dis7)<=Integer.parseInt(dis6) )
							{
								Thread.sleep(2000);
								n7.setIcon(Green);
							}
							else
							{
								Thread.sleep(2000);
								n8.setIcon(Green);
							}

						}
						if(CH.equalsIgnoreCase("Node6"))
						{
							Thread.sleep(2000);
							n6.setIcon(Green);     
				
							if(Integer.parseInt(dis7)<=Integer.parseInt(dis8))
							{
							Thread.sleep(2000);
							n7.setIcon(Green);
							}
							else
							{
							Thread.sleep(2000);
							n8.setIcon(Green);     
							}
						
						}
						if(CH.equalsIgnoreCase("Node7"))
						{
							Thread.sleep(2000);
							n7.setIcon(Green);
							
							Thread.sleep(2000);
							n8.setIcon(Green);     
						}
						if(CH.equalsIgnoreCase("Node8"))
						{
							
							Thread.sleep(2000);
							n8.setIcon(Green);     	
						}
						
						
					}
					
				//	Start Action for Cluster2
					
					
					System.out.println("calculation started");
					
					
					ResultSet r14=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node14+"'");
					if(r14.next()==true){dis14=r14.getString("Distance"); System.out.println(dis14);}
					
					ResultSet r15=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node15+"'");
					if(r15.next()==true){dis15=r15.getString("Distance"); System.out.println(dis15); }
					
					ResultSet r16=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node16+"'");
					if(r16.next()==true){dis16=r16.getString("Distance"); System.out.println(dis16); }
					
					System.out.println("DISTANCE CALCULATED");
					
					System.out.println("Dis14 "+dis14);
					System.out.println("Dis15 "+dis15);
					System.out.println("Dis16 "+dis16);
					
					
					Statement stc2=connect.createStatement();
					String sc2="select max(Energy) as Strength from Cluster2";
					ResultSet rcs=stc2.executeQuery(sc2);
					if(rcs.next()==true){Strength=rcs.getString("Strength");}
					
					System.out.println(Strength);
					
					Statement scc2=connect.createStatement();
					String sccc2="select * from Cluster2 where Energy='"+Strength+"'";
					ResultSet rcs1=scc2.executeQuery(sccc2);
					
					if(rcs1.next()==true)                                 // Cluster2
					{
						CH=rcs1.getString("Nname");
						value=rcs1.getString("Energy");
						
						System.out.println("Node: " +CH);
						System.out.println("Energy: " +value);
						System.out.println("Distance: " +rcs1.getString(4));
						
					
						
						System.out.println("CH IS " +CH);
						System.out.println("VALUE IS " +value);
						
						if(CH.equalsIgnoreCase("Node9"))
						{
							Thread.sleep(2000);
							n11.setIcon(Green);      
							
							String cpath="";
							
							Statement stm=connect.createStatement();
							String sm="select min(Distance) as cpath from Cluster2";
							ResultSet rsm=stm.executeQuery(sm);
							if(rsm.next()==true){cpath=rsm.getString("cpath");}
							
							System.out.println("The Value of Cpath is "+cpath);
							
							Statement st33=connect.createStatement();
							String s23="select * from Cluster2 where Distance='"+cpath+"'";
							ResultSet rs34=st.executeQuery(s23);
							
							if(rs34.next()==true){snode=rs34.getString("Nname");}
							
							if(snode.equalsIgnoreCase("Node10"))
							{
								Thread.sleep(2000);
								n10.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node11"))
							{
								Thread.sleep(2000);
								n11.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node12"))
							{
								Thread.sleep(2000);
								n12.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node13"))
							{
								Thread.sleep(2000);
								n13.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node14"))
							{
								Thread.sleep(2000);
								n14.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node15"))
							{
								Thread.sleep(2000);
								n15.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node16"))
							{
								Thread.sleep(2000);
								n16.setIcon(Green);     
							}
							
							
						}
						if(CH.equalsIgnoreCase("Node10"))
						{
							Thread.sleep(2000);
							n10.setIcon(Green); 
							
							int num=2;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster2  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node11"))
							{
								Thread.sleep(2000);
								n11.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node12"))
							{
								Thread.sleep(2000);
								n12.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node13"))
							{
								Thread.sleep(2000);
								n13.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node14"))
							{
								Thread.sleep(2000);
								n14.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node15"))
							{
								Thread.sleep(2000);
								n15.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node16"))
							{
								Thread.sleep(2000);
								n16.setIcon(Green);     
							}
							
						}
						if(CH.equalsIgnoreCase("Node11"))
						{
							Thread.sleep(2000);
							n11.setIcon(Green);     
							
							int num=3;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster2  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node12"))
							{
								Thread.sleep(2000);
								n12.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node13"))
							{
								Thread.sleep(2000);
								n13.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node14"))
							{
								Thread.sleep(2000);
								n14.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node15"))
							{
								Thread.sleep(2000);
								n15.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node16"))
							{
								Thread.sleep(2000);
								n16.setIcon(Green);     
							}
							
						}
						if(CH.equalsIgnoreCase("Node12"))
						{
							Thread.sleep(2000);
							n12.setIcon(Green);  
							
							int num=4;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster2  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node13"))
							{
								Thread.sleep(2000);
								n13.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node14"))
							{
								Thread.sleep(2000);
								n14.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node15"))
							{
								Thread.sleep(2000);
								n15.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node16"))
							{
								Thread.sleep(2000);
								n16.setIcon(Green);     
							}
						}
						if(CH.equalsIgnoreCase("Node13"))
						{
							Thread.sleep(2000);
							n13.setIcon(Green);   
							
							if(Integer.parseInt(dis14)<=Integer.parseInt(dis15) && Integer.parseInt(dis14)<=Integer.parseInt(dis16) )
							{
								Thread.sleep(2000);
								n14.setIcon(Green);
							}
							if(Integer.parseInt(dis15)<=Integer.parseInt(dis16) && Integer.parseInt(dis15)<=Integer.parseInt(dis14) )
							{
								Thread.sleep(2000);
								n15.setIcon(Green);
							}
							else
							{
								Thread.sleep(2000);
								n16.setIcon(Green);
							}

						}
						if(CH.equalsIgnoreCase("Node14"))
						{
							Thread.sleep(2000);
							n14.setIcon(Green);     
				
							if(Integer.parseInt(dis15)<=Integer.parseInt(dis16))
							{
							Thread.sleep(2000);
							n15.setIcon(Green);
							}
							else
							{
							Thread.sleep(2000);
							n16.setIcon(Green);     
							}
						
						}
						if(CH.equalsIgnoreCase("Node15"))
						{
							Thread.sleep(2000);
							n15.setIcon(Green);
							
							Thread.sleep(2000);
							n16.setIcon(Green);     
						}
						if(CH.equalsIgnoreCase("Node16"))
						{
							
							Thread.sleep(2000);
							n16.setIcon(Green);     	
						}
						
						
					}
				//	Start Action for Cluster 3
					
					
					
					System.out.println("calculation started");
					
					
					ResultSet r22=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node22+"'");
					if(r22.next()==true){dis22=r22.getString("Distance"); System.out.println(dis22);}
					
					ResultSet r23=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node23+"'");
					if(r23.next()==true){dis23=r23.getString("Distance"); System.out.println(dis23); }
					
					ResultSet r24=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node24+"'");
					if(r24.next()==true){dis24=r24.getString("Distance"); System.out.println(dis24); }
					
					System.out.println("DISTANCE CALCULATED");
					
					System.out.println("Dis22 "+dis22);
					System.out.println("Dis23 "+dis23);
					System.out.println("Dis24 "+dis24);
					
					
					Statement mnc=connect.createStatement();
					String m1="select max(Energy) as Strength from Cluster3";
					ResultSet rm1=mnc.executeQuery(m1);
					if(rm1.next()==true){Strength=rm1.getString("Strength");}
					
					System.out.println(Strength);
					
					Statement mnc2=connect.createStatement();
					String m2="select * from Cluster3 where Energy='"+Strength+"'";
					ResultSet rm2=mnc2.executeQuery(m2);
					
					if(rm2.next()==true)                                 // Cluster3
					{
						CH=rm2.getString("Nname");
						value=rm2.getString("Energy");
						
						System.out.println("Node: " +CH);
						System.out.println("Energy: " +value);
						System.out.println("Distance: " +rm2.getString(4));
						
					
						
						System.out.println("CH IS " +CH);
						System.out.println("VALUE IS " +value);
						
						if(CH.equalsIgnoreCase("Node17"))
						{
							Thread.sleep(2000);
							n17.setIcon(Green);      
							
							String cpath="";
							
							Statement stm=connect.createStatement();
							String sm="select min(Distance) as cpath from Cluster3";
							ResultSet rsm=stm.executeQuery(sm);
							if(rsm.next()==true){cpath=rsm.getString("cpath");}
							
							System.out.println("The Value of Cpath is "+cpath);
							
							Statement st33=connect.createStatement();
							String s23="select * from Cluster3 where Distance='"+cpath+"'";
							ResultSet rs34=st.executeQuery(s23);
							
							if(rs34.next()==true){snode=rs34.getString("Nname");}
							
							if(snode.equalsIgnoreCase("Node18"))
							{
								Thread.sleep(2000);
								n18.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node19"))
							{
								Thread.sleep(2000);
								n19.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node20"))
							{
								Thread.sleep(2000);
								n20.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node21"))
							{
								Thread.sleep(2000);
								n21.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node22"))
							{
								Thread.sleep(2000);
								n22.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node23"))
							{
								Thread.sleep(2000);
								n23.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node24"))
							{
								Thread.sleep(2000);
								n24.setIcon(Green);     
							}
							
							
						}
						if(CH.equalsIgnoreCase("Node18"))
						{
							Thread.sleep(2000);
							n18.setIcon(Green); 
							
							int num=2;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster3  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node19"))
							{
								Thread.sleep(2000);
								n19.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node20"))
							{
								Thread.sleep(2000);
								n20.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node21"))
							{
								Thread.sleep(2000);
								n21.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node22"))
							{
								Thread.sleep(2000);
								n22.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node23"))
							{
								Thread.sleep(2000);
								n23.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node24"))
							{
								Thread.sleep(2000);
								n24.setIcon(Green);     
							}
							
						}
						if(CH.equalsIgnoreCase("Node19"))
						{
							Thread.sleep(2000);
							n19.setIcon(Green);     
							
							int num=3;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster3  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node20"))
							{
								Thread.sleep(2000);
								n20.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node21"))
							{
								Thread.sleep(2000);
								n21.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node22"))
							{
								Thread.sleep(2000);
								n22.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node23"))
							{
								Thread.sleep(2000);
								n23.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node24"))
							{
								Thread.sleep(2000);
								n24.setIcon(Green);     
							}
							
						}
						if(CH.equalsIgnoreCase("Node20"))
						{
							Thread.sleep(2000);
							n20.setIcon(Green);  
							
							int num=4;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster3  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node21"))
							{
								Thread.sleep(2000);
								n21.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node22"))
							{
								Thread.sleep(2000);
								n22.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node23"))
							{
								Thread.sleep(2000);
								n23.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node24"))
							{
								Thread.sleep(2000);
								n24.setIcon(Green);     
							}
							
						}
						if(CH.equalsIgnoreCase("Node21"))
						{
							Thread.sleep(2000);
							n21.setIcon(Green);   
							
							if(Integer.parseInt(dis22)<=Integer.parseInt(dis23) && Integer.parseInt(dis22)<=Integer.parseInt(dis24) )
							{
								Thread.sleep(2000);
								n22.setIcon(Green);
							}
							if(Integer.parseInt(dis23)<=Integer.parseInt(dis24) && Integer.parseInt(dis23)<=Integer.parseInt(dis22) )
							{
								Thread.sleep(2000);
								n23.setIcon(Green);
							}
							else
							{
								Thread.sleep(2000);
								n24.setIcon(Green);
							}

						}
						if(CH.equalsIgnoreCase("Node22"))
						{
							Thread.sleep(2000);
							n22.setIcon(Green);     
				
							if(Integer.parseInt(dis23)<=Integer.parseInt(dis24))
							{
							Thread.sleep(2000);
							n23.setIcon(Green);
							}
							else
							{
							Thread.sleep(2000);
							n24.setIcon(Green);     
							}
						
						}
						if(CH.equalsIgnoreCase("Node23"))
						{
							Thread.sleep(2000);
							n23.setIcon(Green);
							
							Thread.sleep(2000);
							n24.setIcon(Green);     
						}
						if(CH.equalsIgnoreCase("Node24"))
						{
							
							Thread.sleep(2000);
							n24.setIcon(Green);     	
						}
						
						
					}
					
//	Start Action for Cluster 4
					
					
					
					System.out.println("calculation started");
					
					
					ResultSet r30=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node30+"'");
					if(r30.next()==true){dis30=r30.getString("Distance"); System.out.println(dis30);}
					
					ResultSet r31=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node31+"'");
					if(r31.next()==true){dis31=r31.getString("Distance"); System.out.println(dis31); }
					
					ResultSet r32=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node32+"'");
					if(r32.next()==true){dis32=r32.getString("Distance"); System.out.println(dis32); }
					
					System.out.println("DISTANCE CALCULATED");
					
					System.out.println("Dis30 "+dis30);
					System.out.println("Dis31 "+dis31);
					System.out.println("Dis32 "+dis32);
					
					
					Statement mnc3=connect.createStatement();
					String m3="select max(Energy) as Strength from Cluster4";
					ResultSet rm3=mnc3.executeQuery(m3);
					if(rm3.next()==true){Strength=rm3.getString("Strength");}
					
					System.out.println(Strength);
					
					Statement mnc4=connect.createStatement();
					String m4="select * from Cluster4 where Energy='"+Strength+"'";
					ResultSet rm4=mnc4.executeQuery(m4);
					
					if(rm4.next()==true)                                 // Cluster4
					{
						CH=rm4.getString("Nname");
						value=rm4.getString("Energy");
						
						System.out.println("Node: " +CH);
						System.out.println("Energy: " +value);
						System.out.println("Distance: " +rm4.getString(4));
						
					
						
						System.out.println("CH IS " +CH);
						System.out.println("VALUE IS " +value);
						
						if(CH.equalsIgnoreCase("Node25"))
						{
							Thread.sleep(2000);
							n25.setIcon(Green);      
							
							String cpath="";
							
							Statement stm=connect.createStatement();
							String sm="select min(Distance) as cpath from Cluster4";
							ResultSet rsm=stm.executeQuery(sm);
							if(rsm.next()==true){cpath=rsm.getString("cpath");}
							
							System.out.println("The Value of Cpath is "+cpath);
							
							Statement st33=connect.createStatement();
							String s23="select * from Cluster4 where Distance='"+cpath+"'";
							ResultSet rs34=st.executeQuery(s23);
							
							if(rs34.next()==true){snode=rs34.getString("Nname");}
							
							if(snode.equalsIgnoreCase("Node26"))
							{
								Thread.sleep(2000);
								n26.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node27"))
							{
								Thread.sleep(2000);
								n27.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node28"))
							{
								Thread.sleep(2000);
								n28.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node29"))
							{
								Thread.sleep(2000);
								n29.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node30"))
							{
								Thread.sleep(2000);
								n30.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node31"))
							{
								Thread.sleep(2000);
								n31.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node32"))
							{
								Thread.sleep(2000);
								n32.setIcon(Green);     
							}
							
							
						}
						if(CH.equalsIgnoreCase("Node26"))
						{
							Thread.sleep(2000);
							n26.setIcon(Green); 
							
							int num=2;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster4  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node27"))
							{
								Thread.sleep(2000);
								n27.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node28"))
							{
								Thread.sleep(2000);
								n28.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node29"))
							{
								Thread.sleep(2000);
								n29.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node30"))
							{
								Thread.sleep(2000);
								n30.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node31"))
							{
								Thread.sleep(2000);
								n31.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node32"))
							{
								Thread.sleep(2000);
								n32.setIcon(Green);     
							}
							
						}
						if(CH.equalsIgnoreCase("Node27"))
						{
							Thread.sleep(2000);
							n27.setIcon(Green);     
							
							int num=3;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster4  where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node28"))
							{
								Thread.sleep(2000);
								n28.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node29"))
							{
								Thread.sleep(2000);
								n29.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node30"))
							{
								Thread.sleep(2000);
								n30.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node31"))
							{
								Thread.sleep(2000);
								n31.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node32"))
							{
								Thread.sleep(2000);
								n32.setIcon(Green);     
							}
							
						}
						if(CH.equalsIgnoreCase("Node28"))
						{
							Thread.sleep(2000);
							n28.setIcon(Green);  
							
							int num=4;
							
							Statement ob=connect.createStatement();
							String s1="Select * from Cluster4 where Number > "+num+" order By Distance ";
							ResultSet rrt=ob.executeQuery(s1);
							if(rrt.next()==true)
							{
								snode=rrt.getString("Nname"); 
								value=rrt.getString("Distance");
								
								System.out.println("The Node is "+snode);
								System.out.println("Value is" +value);
							}
							if(snode.equalsIgnoreCase("Node29"))
							{
								Thread.sleep(2000);
								n29.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node30"))
							{
								Thread.sleep(2000);
								n30.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node31"))
							{
								Thread.sleep(2000);
								n31.setIcon(Green);     
							}
							if(snode.equalsIgnoreCase("Node32"))
							{
								Thread.sleep(2000);
								n32.setIcon(Green);     
							}
							
						}
						if(CH.equalsIgnoreCase("Node29"))
						{
							Thread.sleep(2000);
							n29.setIcon(Green);   
							
							if(Integer.parseInt(dis30)<=Integer.parseInt(dis31) && Integer.parseInt(dis30)<=Integer.parseInt(dis32) )
							{
								Thread.sleep(2000);
								n30.setIcon(Green);
							}
							if(Integer.parseInt(dis31)<=Integer.parseInt(dis32) && Integer.parseInt(dis31)<=Integer.parseInt(dis30) )
							{
								Thread.sleep(2000);
								n31.setIcon(Green);
							}
							else
							{
								Thread.sleep(2000);
								n32.setIcon(Green);
							}

						}
						if(CH.equalsIgnoreCase("Node30"))
						{
							Thread.sleep(2000);
							n30.setIcon(Green);     
				
							if(Integer.parseInt(dis31)<=Integer.parseInt(dis32))
							{
							Thread.sleep(2000);
							n31.setIcon(Green);
							}
							else
							{
							Thread.sleep(2000);
							n32.setIcon(Green);     
							}
						
						}
						if(CH.equalsIgnoreCase("Node31"))
						{
							Thread.sleep(2000);
							n31.setIcon(Green);
							
							Thread.sleep(2000);
							n32.setIcon(Green);     
						}
						if(CH.equalsIgnoreCase("Node32"))
						{
							
							Thread.sleep(2000);
							n32.setIcon(Green);     	
						}
						
						
					}
					
					if(dest.equalsIgnoreCase("Dest A"))
					{
						Socket dest1=new Socket("localhost",9991);
						DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
						dos91.writeUTF(fname);
						dos91.writeUTF(ct);
						
						DataInputStream ins=new DataInputStream(dest1.getInputStream());
						String msg=ins.readUTF();
					}
					if(dest.equalsIgnoreCase("Dest B"))
					{
						Socket dest1=new Socket("localhost",9992);
						DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
						dos91.writeUTF(fname);
						dos91.writeUTF(ct);
						
						DataInputStream ins=new DataInputStream(dest1.getInputStream());
						String msg=ins.readUTF();
					}
					if(dest.equalsIgnoreCase("Dest C"))
					{
						Socket dest1=new Socket("localhost",9993);
						DataOutputStream dos91=new DataOutputStream(dest1.getOutputStream());
						dos91.writeUTF(fname);
						dos91.writeUTF(ct);
						
						DataInputStream ins=new DataInputStream(dest1.getInputStream());
						String msg=ins.readUTF();
					}
					
					
					
					
					}
				}catch(Exception es){System.out.println(es);}
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		new Router();
	}

}
