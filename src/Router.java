import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Router  extends JFrame implements ActionListener
{
	JPanel p1;
	ImageIcon Red,Black,Green,c1,a1,a2,a3;
	JLabel n1,n2,n3,n4,n5,n6,n7,n8;
	JLabel n9,n10,n11,n12,n13,n14,n15,n16;
	JLabel n17,n18,n19,n20,n21,n22,n23,n24;
	JLabel n25,n26,n27,n28,n29,n30,n31,n32;
	JLabel s1,s2,s3;
	
	JLabel clust1,clust2,clust3,clust4;
	
	String CHead1,CHead2,CHead3,CHead4;
	String CHp1,CHp2,CHp3,CHp4;
	
	
	//JButton b1,b2,b3,b4;
	
	MenuBar mbr;
	MenuItem i1,i2,b1,b2,b3;
	Menu m1;
	
	public Font f = new Font("Times new roman", Font.BOLD, 25);
	public Font f1 = new Font("Times new roman", Font.BOLD, 18);
	public Font f2 = new Font("Times new roman", Font.BOLD, 16);
	public Font f3 = new Font("Times new roman", Font.BOLD, 23);
	public Font f4 = new Font("Times new roman", Font.BOLD, 15);
	
	String node111="Node1",node222="Node2",node33="Node3" ,node44="Node4",node55="Node5",node66="Node6",node77="Node7",node88="Node8";
	String nodec2111="Node9",nodec2222="Node10",nodec233="Node11" ,nodec244="Node12",nodec255="Node13",nodec266="Node14",nodec277="Node15",nodec288="Node16";
	String nodec3111="Node17",nodec3222="Node18",nodec333="Node19" ,nodec344="Node20",nodec355="Node21",nodec366="Node22",nodec377="Node23",nodec388="Node24";
	String nodec4111="Node25",nodec4222="Node26",nodec433="Node27" ,nodec444="Node28",nodec455="Node29",nodec466="Node30",nodec477="Node31",nodec488="Node32";
	
	
	
	String node1="Node1",node2="Node2",node3="Node3" ,node4="Node4",node5="Node5",node6="Node6",node7="Node7",node8="Node8";
	String node9="Node9",node10="Node10",node11="Node11" ,node12="Node12",node13="Node13",node14="Node14",node15="Node15",node16="Node16";
	String node17="Node17",node18="Node18",node19="Node19" ,node20="Node20",node21="Node21",node22="Node22",node23="Node23",node24="Node24";
	String node25="Node25",node26="Node26",node27="Node27" ,node28="Node28",node29="Node29",node30="Node30",node31="Node31",node32="Node32";
	
	String dis1="",dis2="",dis3="",dis4="",dis5="",dis6="",dis7="",dis8="",dis9="",dis10="";
	String dis11="",dis12="",dis13="",dis14="",dis15="",dis16="",dis17="",dis18="",dis19="",dis20="";
	String dis21="",dis22="",dis23="",dis24="",dis25="",dis26="",dis27="",dis28="",dis29="",dis30="";
	String dis31="",dis32="";
	
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	
	
	String Degree;
	
	Router()
	{
		p1=new JPanel();
		p1.setLayout(null);
		setTitle("Router::Traffic and Energy Aware Routing for Heterogeneous Wireless Sensor Networks");
		p1.setBackground(Color.WHITE);
		
		mbr=new MenuBar();
		setMenuBar(mbr);
		
		m1=new Menu("File");
		i1=new MenuItem("Assign Values");
		i2=new MenuItem("View NodeDetails");
		b1=new MenuItem("View Routing Path ");
		b2=new MenuItem("View Results");
		b3=new MenuItem("View Attackers");
		
		
		m1.add(i1);
		m1.add(i2);
		m1.add(b1);
		m1.add(b2);
		m1.add(b3);
		mbr.add(m1);
		
		/*b1=new JButton("V-RPath");
		b1.setBounds(670,20,140,30);
		b1.setFont(f4);
		b1.setBackground(Color.WHITE);
		b1.setForeground(new Color(0, 0, 0));
		
		b2=new JButton("V-TimeDelay");
		b2.setBounds(670,70,140,30);
		b2.setFont(f4);
		b2.setBackground(Color.WHITE);
		b2.setForeground(new Color(0, 0, 0));
		
		
		b3=new JButton("V-Correlation");
		b3.setBounds(670,120,140,30);
		b3.setFont(f4);
		b3.setBackground(Color.WHITE);
		b3.setForeground(new Color(0, 0, 0));
		
		b4=new JButton("V-Attackers");
		b4.setBounds(670,120,140,30);
		b4.setFont(f4);
		b4.setBackground(Color.WHITE);
		b4.setForeground(new Color(0, 0, 0));*/
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		l1=new JLabel("Cluster 1");
		l1.setFont(f1);
		l1.setBounds(670,170,140,30);
		l1.setForeground(Color.black);
		p1.add(l1);
		
		l2=new JLabel("Node 1");
		l2.setFont(f4);
		l2.setBounds(670,220,140,30);
		l2.setForeground(Color.black);
		p1.add(l2);
		
		l3=new JLabel("Node 2");
		l3.setFont(f4);
		l3.setBounds(670,270,140,30);
		l3.setForeground(Color.black);
		p1.add(l3);
		
		l4=new JLabel("Node 3");
		l4.setFont(f4);
		l4.setBounds(670,320,140,30);
		l4.setForeground(Color.black);
		p1.add(l4);
		
		l5=new JLabel("Node 4");
		l5.setFont(f4);
		l5.setBounds(670,370,140,30);
		l5.setForeground(Color.black);
		p1.add(l5);
		
		l6=new JLabel("Node 5");
		l6.setFont(f4);
		l6.setBounds(670,420,140,30);
		l6.setForeground(Color.black);
		p1.add(l6);
		
		l7=new JLabel("Node 6");
		l7.setFont(f4);
		l7.setBounds(670,470,140,30);
		l7.setForeground(Color.black);
		p1.add(l7);
		
		l8=new JLabel("Node 7");
		l8.setFont(f4);
		l8.setBounds(670,520,140,30);
		l8.setForeground(Color.black);
		p1.add(l8);
		
		l9=new JLabel("Node 8");
		l9.setFont(f4);
		l9.setBounds(670,570,140,30);
		l9.setForeground(Color.black);
		p1.add(l9);
		
		l1.setVisible(false);
		l2.setVisible(false);
		l3.setVisible(false);
		l4.setVisible(false);
		l5.setVisible(false);
		l6.setVisible(false);
		l7.setVisible(false);
		l8.setVisible(false);
		l9.setVisible(false);
		
		i1.addActionListener(this);
		i2.addActionListener(this);
		
		Red=new ImageIcon(this.getClass().getResource("images\\r1.png"));
		Black=new ImageIcon(this.getClass().getResource("images\\b1.png"));
		Green=new ImageIcon(this.getClass().getResource("images\\g1.png"));
		c1=new ImageIcon(this.getClass().getResource("images\\c1.png"));
		a1=new ImageIcon(this.getClass().getResource("a1.png"));
		a2=new ImageIcon(this.getClass().getResource("a2.png"));
		a3=new ImageIcon(this.getClass().getResource("a3.png"));
		
		s1=new JLabel();           
		s1.setIcon(a1);         
		s1.setBounds(130,-195,500,500); 
		p1.add(s1);
		
		s2=new JLabel();           
		s2.setIcon(a2);         
		s2.setBounds(235,170,300,300); 
		p1.add(s2);
		
		s3=new JLabel();           
		s3.setIcon(a3);         
		s3.setBounds(130,310,500,500); 
		p1.add(s3);
		
		
		s1.setVisible(false);
		s2.setVisible(false);
		s3.setVisible(false);
		
		n1=new JLabel();           
		n1.setIcon(Black);         
		n1.setBounds(80,80,60,60); 
		
		JLabel t1=new JLabel();     
		t1.setText("N1");           
		t1.setForeground(Color.black);
		t1.setBounds(60,80,60,60);
		p1.add(t1);
		
		
		n2=new JLabel();
		n2.setIcon(Black);
		n2.setBounds(150,80,60,60);
		
		JLabel t2=new JLabel();
		t2.setText("N2");
		t2.setForeground(Color.black);
		t2.setBounds(130,80,60,60);
		p1.add(t2);
		
		n3=new JLabel();
		n3.setIcon(Black);
		n3.setBounds(235,80,60,60);
		
		JLabel t3=new JLabel();
		t3.setText("N3");
		t3.setForeground(Color.black);
		t3.setBounds(215,80,60,60);
		p1.add(t3);
		
		n4=new JLabel();
		n4.setIcon(Black);
		n4.setBounds(60,150,60,60);
		
		JLabel t4=new JLabel();
		t4.setText("N4");
		t4.setForeground(Color.black);
		t4.setBounds(40,150,60,60);
		p1.add(t4);
		
		
		n5=new JLabel();
		n5.setIcon(Black);
		n5.setBounds(170,150,60,60);
		
		JLabel t5=new JLabel();
		t5.setText("N5");
		t5.setForeground(Color.black);
		t5.setBounds(150,150,60,60);
		p1.add(t5);
		
		n6=new JLabel();
		n6.setIcon(Black);
		n6.setBounds(260,150,60,60);
		
		JLabel t6=new JLabel();
		t6.setText("N6");
		t6.setForeground(Color.black);
		t6.setBounds(240,150,60,60);
		p1.add(t6);
		
		n7=new JLabel();
		n7.setIcon(Black);
		n7.setBounds(110,220,60,60);
		
		JLabel t7=new JLabel();
		t7.setText("N7");
		t7.setForeground(Color.black);
		t7.setBounds(90,220,60,60);
		p1.add(t7);
		
		n8=new JLabel();
		n8.setIcon(Black);
		n8.setBounds(220,220,60,60);
		
		JLabel t8=new JLabel();
		t8.setText("N8");
		t8.setForeground(Color.black);
		t8.setBounds(200,220,60,60);
		p1.add(t8);
		
		n9=new JLabel();
		n9.setIcon(Black);
		n9.setBounds(400,80,60,60);
		
		JLabel t9=new JLabel();
		t9.setText("N9");
		t9.setForeground(Color.black);
		t9.setBounds(380,80,60,60);
		p1.add(t9);
		
		
		n10=new JLabel();
		n10.setIcon(Black);
		n10.setBounds(500,80,60,60);
		
		JLabel t10=new JLabel();
		t10.setText("N10");
		t10.setForeground(Color.black);
		t10.setBounds(480,80,60,60);
		p1.add(t10);
		
		n11=new JLabel();
		n11.setIcon(Black);
		n11.setBounds(570,80,60,60);
		
		JLabel t11=new JLabel();
		t11.setText("N11");
		t11.setForeground(Color.black);
		t11.setBounds(550,80,60,60);
		p1.add(t11);
		
		n12=new JLabel();
		n12.setIcon(Black);
		n12.setBounds(370,150,60,60);
		
		JLabel t12=new JLabel();
		t12.setText("N12");
		t12.setForeground(Color.black);
		t12.setBounds(350,150,60,60);
		p1.add(t12);
		
		
		n13=new JLabel();
		n13.setIcon(Black);
		n13.setBounds(480,150,60,60);
		
		JLabel t13=new JLabel();
		t13.setText("N13");
		t13.setForeground(Color.black);
		t13.setBounds(460,150,60,60);
		p1.add(t13);
		
		n14=new JLabel();
		n14.setIcon(Black);
		n14.setBounds(600,150,60,60);
		
		JLabel t14=new JLabel();
		t14.setText("N14");
		t14.setForeground(Color.black);
		t14.setBounds(580,150,60,60);
		p1.add(t14);
		
		n15=new JLabel();
		n15.setIcon(Black);
		n15.setBounds(410,220,60,60);
		
		JLabel t15=new JLabel();
		t15.setText("N15");
		t15.setForeground(Color.black);
		t15.setBounds(390,220,60,60);
		p1.add(t15);
		
		n16=new JLabel();
		n16.setIcon(Black);
		n16.setBounds(530,220,60,60);
		
		JLabel t16=new JLabel();
		t16.setText("N16");
		t16.setForeground(Color.black);
		t16.setBounds(510,220,60,60);
		p1.add(t16);
		
	    n17=new JLabel();
	    n17.setIcon(Black);
	    n17.setBounds(60,340,60,60);
	    
		JLabel t17=new JLabel();     
		t17.setText("N17");           
		t17.setForeground(Color.black);
		t17.setBounds(40,340,60,60);
		p1.add(t17);
		
		
		n18=new JLabel();
		n18.setIcon(Black);
		n18.setBounds(150,340,60,60);
		
		JLabel t18=new JLabel();
		t18.setText("N18");
		t18.setForeground(Color.black);
		t18.setBounds(130,340,60,60);
		p1.add(t18);
		
		n19=new JLabel();
		n19.setIcon(Black);
		n19.setBounds(230,340,60,60);
		
		JLabel t19=new JLabel();
		t19.setText("N19");
		t19.setForeground(Color.black);
		t19.setBounds(210,340,60,60);
		p1.add(t19);
		
		n20=new JLabel();
		n20.setIcon(Black);
		n20.setBounds(30,400,60,60);
		
		JLabel t20=new JLabel();
		t20.setText("N20");
		t20.setForeground(Color.black);
		t20.setBounds(10,400,60,60);
		p1.add(t20);
		
	
		n21=new JLabel();
		n21.setIcon(Black);
		n21.setBounds(120,400,60,60);
		
		JLabel t21=new JLabel();
		t21.setText("N21");
		t21.setForeground(Color.black);
		t21.setBounds(100,400,60,60);
		p1.add(t21);
		
		n22=new JLabel();
		n22.setIcon(Black);
		n22.setBounds(250,400,60,60);
		
		JLabel t22=new JLabel();
		t22.setText("N22");
		t22.setForeground(Color.black);
		t22.setBounds(230,400,60,60);
		p1.add(t22);
		
		n23=new JLabel();
		n23.setIcon(Black);
		n23.setBounds(90,470,60,60);
		
		JLabel t23=new JLabel();
		t23.setText("N23");
		t23.setForeground(Color.black);
		t23.setBounds(70,470,60,60);
		p1.add(t23);
		
		
		n24=new JLabel();
		n24.setIcon(Black);
		n24.setBounds(220,470,60,60);
		
		JLabel t24=new JLabel();
		t24.setText("N24");
		t24.setForeground(Color.black);
		t24.setBounds(200,470,60,60);
		p1.add(t24);
		
		n25=new JLabel();
		n25.setIcon(Black);
		n25.setBounds(390,340,60,60);
		
		JLabel t25=new JLabel();
		t25.setText("N25");
		t25.setForeground(Color.black);
		t25.setBounds(370,340,60,60);
		p1.add(t25);
		
		
		n26=new JLabel();
		n26.setIcon(Black);
		n26.setBounds(480,340,60,60);
		
		JLabel t26=new JLabel();
		t26.setText("N26");
		t26.setForeground(Color.black);
		t26.setBounds(460,340,60,60);
		p1.add(t26);
		
		n27=new JLabel();
		n27.setIcon(Black);
		n27.setBounds(570,340,60,60);
		
		JLabel t27=new JLabel();
		t27.setText("N27");
		t27.setForeground(Color.black);
		t27.setBounds(550,340,60,60);
		p1.add(t27);
		
		n28=new JLabel();
		n28.setIcon(Black);
		n28.setBounds(370,410,60,60);

		JLabel t28=new JLabel();
		t28.setText("N28");
		t28.setForeground(Color.black);
		t28.setBounds(350,410,60,60);
		p1.add(t28);
		
		
		n29=new JLabel();
		n29.setIcon(Black);
		n29.setBounds(470,410,60,60);
		
		JLabel t29=new JLabel();
		t29.setText("N29");
		t29.setForeground(Color.black);
		t29.setBounds(450,410,60,60);
		p1.add(t29);
		
		n30=new JLabel();
		n30.setIcon(Black);
		n30.setBounds(600,410,60,60);
		
		JLabel t30=new JLabel();
		t30.setText("C30");
		t30.setForeground(Color.black);
		t30.setBounds(580,410,60,60);
		p1.add(t30);
		
		n31=new JLabel();
		n31.setIcon(Black);
		n31.setBounds(410,480,60,60);
		
		JLabel t31=new JLabel();
		t31.setText("N31");
		t31.setForeground(Color.black);
		t31.setBounds(390,480,60,60);
		p1.add(t31);
		
		n32=new JLabel();
		n32.setIcon(Black);
		n32.setBounds(520,480,60,60);
		
		JLabel t32=new JLabel();
		t32.setText("N32");
		t32.setForeground(Color.black);
		t32.setBounds(500,480,60,60);
		p1.add(t32);
		
		
		JLabel t322=new JLabel();
		t322.setText("N--Node");
		t322.setForeground(Color.RED);
		t322.setBounds(330,550,160,60);
		p1.add(t322);
		
		
		 ImageIcon banner = new ImageIcon(this.getClass().getResource("ChannelDetails.png"));
		 JLabel title = new JLabel();
		 title.setIcon(banner);
		 title.setBounds(660, 100, 144,500);
		
		
		
		
//		clust1=new JLabel();
//		clust1.setIcon(c1);
//		clust1.setBounds(10,25,320,300);
//		clust2=new JLabel();
//		clust2.setIcon(c1);
//		clust2.setBounds(335,25,320,300);
//		clust3=new JLabel();
//		clust3.setIcon(c1);
//		clust3.setBounds(10,285,320,300);
//		clust4=new JLabel();
//		clust4.setIcon(c1);
//		clust4.setBounds(335,285,320,300);
		
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
		txt3.setBounds(50,540,100,30);
		p1.add(txt3);
		
		JLabel txt4=new JLabel();
		txt4.setText("CLUSTER4");
		txt4.setFont(f2);
		txt4.setBounds(510,540,100,30);
		p1.add(txt4);
		
		
		Border b11=BorderFactory.createLineBorder(Color.black,3);
	
		
		TitledBorder b22=new TitledBorder(b11);
		b22.setTitleFont(f2);
		JLabel bord =new JLabel();
		bord.setBorder(b22);
		bord.setBackground(Color.black);
	//	bord.setBounds(660,10,160,600);
		
		p1.add(bord);
		p1.add(n1);p1.add(n2);p1.add(n3);p1.add(n4);p1.add(n5);p1.add(n6);p1.add(n7);p1.add(n8);
		p1.add(n9);p1.add(n10);p1.add(n11);p1.add(n12);p1.add(n13);p1.add(n14);p1.add(n15);p1.add(n16);
		p1.add(n17);p1.add(n18);p1.add(n19);p1.add(n20);p1.add(n21);p1.add(n22);p1.add(n23);p1.add(n24);p1.add(n25);
		p1.add(n26);p1.add(n27);p1.add(n28);p1.add(n29);p1.add(n30);p1.add(n31);p1.add(n32);
//		p1.add(clust1);p1.add(clust2);p1.add(clust3);p1.add(clust4);
		
		p1.add(title);
		setSize(850,680);
		setVisible(true);
		add(p1);
		
		int[] ports = new int[]
			              		{8989,4444,5555};

			              		for (int i = 0; i < 3; i++)
			              		{
			              			Thread t = new Thread(new PortListener(ports[i]));
			              			t.setName("Listener-" + ports[i]);
			              			t.start();

			              		}
		
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		Dbcon db=new Dbcon();
		Connection con=db.getConnection();
		if(ae.getSource()==i1)
		{
			String cn[]={"Cluster1","Cluster2","Cluster3","Cluster4"};
			JComboBox cb1=new JComboBox(cn);
			JOptionPane.showMessageDialog(null,cb1,"Select Cluster",JOptionPane.QUESTION_MESSAGE);
			String nname="";
			try
			{
				String cname=cb1.getSelectedItem().toString();
				
				if(cname.equalsIgnoreCase("Cluster1"))
				{
					
					String cn1[]={"Node1","Node2","Node3","Node4","Node5","Node6","Node7","Node8"};
					JComboBox clust1=new JComboBox(cn1);
					JOptionPane.showMessageDialog(null,clust1,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust1.getSelectedItem().toString();
				}
				if(cname.equalsIgnoreCase("Cluster2"))
				{
					
					String cn2[]={"Node9","Node10","Node11","Node12","Node13","Node14","Node15","Node16"};
					JComboBox clust2=new JComboBox(cn2);
					JOptionPane.showMessageDialog(null,clust2,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust2.getSelectedItem().toString();
				}
				if(cname.equalsIgnoreCase("Cluster3"))
				{
					
					String cn3[]={"Node17","Node18","Node19","Node20","Node21","Node22","Node23","Node24"};
					JComboBox clust3=new JComboBox(cn3);
					JOptionPane.showMessageDialog(null,clust3,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust3.getSelectedItem().toString();
				}
				if(cname.equalsIgnoreCase("Cluster4"))
				{
					
					String cn4[]={"Node25","Node26","Node27","Node28","Node29","Node30","Node31","Node32"};
					JComboBox clust4=new JComboBox(cn4);
					JOptionPane.showMessageDialog(null,clust4,"Select Node",JOptionPane.QUESTION_MESSAGE);
					
					nname=clust4.getSelectedItem().toString();
				}
				
				
				String Ener=JOptionPane.showInputDialog(null,"Enter Energy");
				
				int Energy=Integer.parseInt(Ener);
				Statement st=con.createStatement();
				String n1="update "+cname+" set Energy="+Energy+" where Nname='"+nname+"' ";
				st.executeUpdate(n1);
				
				JOptionPane.showMessageDialog(null,"Energy Assigned Successfully");
				
			}catch(Exception es){System.out.println(es);}
			
		}
		if(ae.getSource()==i2)
		{
			new ViewNDetails();
		}
		if(ae.getSource()==b1)
		{
			new RoutingPath();
		}
		if(ae.getSource()==b2)
		{
			new ViewTimeDelay();
		}
		if(ae.getSource()==b3)
		{
			new ViewAttackers();
		}
		
	}
	
	public static void main(String[] args) 
	{
		new Router();
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
			Dbcon db=new Dbcon();
			Connection connect=db.getConnection();
			
			String CH="";
			String snode="",snode2="",snode3="",snode4="",snode5="",snode6="",snode7="",snode8="";
			String value="";
			
			if(this.port==4444)
			{
				try
				{
					
				
					ServerSocket sst = new ServerSocket(4444);
					Socket cn;
					while (true) 
					{
					cn = sst.accept();
					
					DataInputStream in3=new DataInputStream(cn.getInputStream());
					String clust=in3.readUTF();
					String node=in3.readUTF();
				
					
					Statement st=connect.createStatement();
					String a1="select * from "+clust+" where Nname='"+node+"'";
					ResultSet rs1=st.executeQuery(a1);
					
					int Energy=0;
					if(rs1.next()==true)
					{
						Energy=rs1.getInt("Energy");
						
						
					}
					DataOutputStream dos66=new DataOutputStream(cn.getOutputStream());
					dos66.writeInt(Energy);
					
					
					
					}
				}catch(Exception es){System.out.println(es);}
			}
			if(this.port==5555)
			{
				try
				{
					
				
					ServerSocket sst = new ServerSocket(5555);
					Socket cn;
					while (true) 
					{
					cn = sst.accept();
					
					DataInputStream in3=new DataInputStream(cn.getInputStream());
					String clust=in3.readUTF();
					String node=in3.readUTF();
					String mener=in3.readUTF();
					String ip=in3.readUTF();
					
					int Aenergy=Integer.parseInt(mener);
					
					Statement st=connect.createStatement();
					String a1="update "+clust+" set Energy="+Aenergy+" where Nname='"+node+"' ";
					st.executeUpdate(a1);
				
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
					SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");

					Date d = new Date();

					String b = stf.format(d);
					String dt = sdf.format(d);

					String date = dt + " " + b;;
					
					Statement Attack=connect.createStatement();
					String b1="insert into Attacker values('"+ip+"','"+clust+"','"+node+"','"+date+"','"+mener+"')";
					Attack.executeUpdate(b1);
					
					DataOutputStream dos66=new DataOutputStream(cn.getOutputStream());
					dos66.writeUTF("success");
					
					
					
					}
				}catch(Exception es){System.out.println(es);}
			}
			if(this.port==8989)
			{
				int Strength=0;
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
					
					
					int fsize=ct.length();
					
					System.out.println(fname);
					System.out.println(ct);
					System.out.println(dest);
					System.out.println(fsize);
					
					 ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
					 long start = threadBean.getCurrentThreadCpuTime();
					
					//Distance of All 8 NODES in Cluster1
					 
					 ResultSet r1=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node1+"'");
						if(r1.next()==true){dis1=r1.getString("Energy"); System.out.println(dis1);}
					
					ResultSet r2=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node2+"'");
					if(r2.next()==true){dis2=r2.getString("Energy"); System.out.println(dis2);}
					
					ResultSet r3=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node3+"'");
					if(r3.next()==true){dis3=r3.getString("Energy"); System.out.println(dis3);}
					
					ResultSet r4=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node4+"'");
					if(r4.next()==true){dis4=r4.getString("Energy"); System.out.println(dis4);}
					
					ResultSet r5=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node5+"'");
					if(r5.next()==true){dis5=r5.getString("Energy"); System.out.println(dis5);}
					
					ResultSet r6=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node6+"'");
					if(r6.next()==true){dis6=r6.getString("Energy"); System.out.println(dis6);}
					
					ResultSet r7=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node7+"'");
					if(r7.next()==true){dis7=r7.getString("Energy"); System.out.println(dis7); }
					
					ResultSet r8=connect.createStatement().executeQuery("select * from Cluster1 where Nname='"+node8+"'");
					if(r8.next()==true){dis8=r8.getString("Energy"); System.out.println(dis8); }
					
					System.out.println("dis1 "+dis1);
					System.out.println("dis2 "+dis2);
					System.out.println("dis3 "+dis3);
					System.out.println("dis4 "+dis4);
					System.out.println("dis5 "+dis5);
					System.out.println("dis6 "+dis6);
					System.out.println("dis7 "+dis7);
					System.out.println("dis8 "+dis8);
					
					l1.setForeground(Color.black);
					l2.setForeground(Color.black);
					l3.setForeground(Color.black);
					l4.setForeground(Color.black);
					l5.setForeground(Color.black);
					l6.setForeground(Color.black);
					l7.setForeground(Color.black);
					l8.setForeground(Color.black);
					l9.setForeground(Color.black);
					
					l1.setVisible(false);
					l2.setVisible(false);
					l3.setVisible(false);
					l4.setVisible(false);
					l5.setVisible(false);
					l6.setVisible(false);
					l7.setVisible(false);
					l8.setVisible(false);
					l9.setVisible(false);
					
					
					
					l1.setText("Cluster 1");
					l1.setVisible(true);
					Thread.sleep(1000);
					l2.setText(node111+"->"+dis1);
					l2.setVisible(true);
					Thread.sleep(1000);
					l3.setText(node222+"->"+dis2);
					l3.setVisible(true);
					Thread.sleep(1000);
					l4.setText(node33+"->"+dis3);
					l4.setVisible(true);
					Thread.sleep(1000);
					l5.setText(node44+"->"+dis4);
					l5.setVisible(true);
					Thread.sleep(1000);
					l6.setText(node55+"->"+dis5);
					l6.setVisible(true);
					Thread.sleep(1000);
					l7.setText(node66+"->"+dis6);
					l7.setVisible(true);
					Thread.sleep(1000);
					l8.setText(node77+"->"+dis7);
					l8.setVisible(true);
					Thread.sleep(1000);
					l9.setText(node88+"->"+dis8);
					l9.setVisible(true);
					Thread.sleep(1000);
					
					
				//Beginning OF CLUSTER-1 TRAVERSING	
				
					
					Statement st=connect.createStatement();
					String s="Select * from Cluster1 ORDER BY Energy DESC";
				//String s="select max(Energy int) as Strength from Cluster1";
					ResultSet rs=st.executeQuery(s);
					
					System.out.println("ResultSet Produced");
					if(rs.next()==true){Strength=rs.getInt("Energy");}
					
					
					System.out.println(Strength);
					
					Statement st2=connect.createStatement();
					String x2="select * from Cluster1 where Energy="+Strength+"";
					
					
					ResultSet rs1=st.executeQuery(x2);
					if(rs1.next()==true)                                
					{
						CH=rs1.getString("Nname");
						value=rs1.getString("Energy");
						
						System.out.println("Node: " +CH);
						System.out.println("Energy: " +value);
						System.out.println("Distance: " +rs1.getString(4));
						System.out.println("CH IS " +CH);
						System.out.println("VALUE IS " +value);
						
						 CHead1=CH;
						 
						 
						 String From="Cluster1";
							String to="Cluster2";
						 
					if(CH.equalsIgnoreCase("Node1"))     
					{
						l2.setVisible(false);
						l2.setForeground(Color.green);
						l2.setText(node1+"->"+dis1);
						l2.setVisible(true);
						Thread.sleep(1000);
						
						EnergyUpdate(fsize,"Cluster1",CH);
						
							Thread.sleep(2000);
							n1.setIcon(Green);  
							String path1="Node1-> ";
							connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
													
				  }
					
					if(CH.equalsIgnoreCase("Node2"))     
					{
						l3.setVisible(false);
						l3.setForeground(Color.green);
						l3.setText(node2+"->"+dis2);
						l3.setVisible(true);
						Thread.sleep(1000);
						
						EnergyUpdate(fsize,"Cluster1",CH);
						
							Thread.sleep(2000);
							n2.setIcon(Green);  
							String path1="Node2-> ";
							connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
													
				  }
					
					if(CH.equalsIgnoreCase("Node3"))     
					{
						l4.setVisible(false);
						l4.setForeground(Color.green);
						l4.setText(node3+"->"+dis3);
						l4.setVisible(true);
						Thread.sleep(1000);
						
						EnergyUpdate(fsize,"Cluster1",CH);
						
							Thread.sleep(2000);
							n3.setIcon(Green);  
							String path1="Node3-> ";
							connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
													
				  }
					if(CH.equalsIgnoreCase("Node4"))     
					{
						l5.setVisible(false);
						l5.setForeground(Color.green);
						l5.setText(node4+"->"+dis4);
						l5.setVisible(true);
						Thread.sleep(1000);
						
						EnergyUpdate(fsize,"Cluster1",CH);
						
							Thread.sleep(2000);
							n4.setIcon(Green);  
							String path1="Node4-> ";
							connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
													
				  }
					if(CH.equalsIgnoreCase("Node5"))     
					{
						l6.setVisible(false);
						l6.setForeground(Color.green);
						l6.setText(node5+"->"+dis5);
						l6.setVisible(true);
						Thread.sleep(1000);
						
						EnergyUpdate(fsize,"Cluster1",CH);
						
							Thread.sleep(2000);
							n5.setIcon(Green);  
							String path1="Node5-> ";
							connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
													
				  }
					if(CH.equalsIgnoreCase("Node6"))     
					{
						l7.setVisible(false);
						l7.setForeground(Color.green);
						l7.setText(node6+"->"+dis6);
						l7.setVisible(true);
						Thread.sleep(1000);
						
						EnergyUpdate(fsize,"Cluster1",CH);
						
							Thread.sleep(2000);
							n6.setIcon(Green);  
							String path1="Node6-> ";
							connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
													
				  }
					
					if(CH.equalsIgnoreCase("Node7"))     
					{
						l8.setVisible(false);
						l8.setForeground(Color.green);
						l8.setText(node7+"->"+dis7);
						l8.setVisible(true);
						Thread.sleep(1000);
						
						EnergyUpdate(fsize,"Cluster1",CH);
						
							Thread.sleep(2000);
							n7.setIcon(Green);  
							String path1="Node7-> ";
							connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
													
				  }
					
					if(CH.equalsIgnoreCase("Node8"))     
					{
						l9.setVisible(false);
						l9.setForeground(Color.green);
						l9.setText(node8+"->"+dis8);
						l9.setVisible(true);
						Thread.sleep(1000);
						
						EnergyUpdate(fsize,"Cluster1",CH);
						
							Thread.sleep(2000);
							n8.setIcon(Green);  
							String path1="Node8-> ";
							connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
													
				  }
									
					
			
			
					s1.setVisible(true);
					Thread.sleep(2000);
			
			
		}
		
//Distance of All 8 NODES in Cluster2
					
					
					ResultSet r9=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node9+"'");
					if(r9.next()==true){dis9=r9.getString("Energy"); System.out.println(dis9);}
					
					ResultSet r10=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node10+"'");
					if(r10.next()==true){dis10=r10.getString("Energy"); System.out.println(dis10);}
					
					ResultSet r11=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node11+"'");
					if(r11.next()==true){dis11=r11.getString("Energy"); System.out.println(dis11);}
					
					ResultSet r12=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node12+"'");
					if(r12.next()==true){dis12=r12.getString("Energy"); System.out.println(dis12);}
					
					ResultSet r13=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node13+"'");
					if(r13.next()==true){dis13=r13.getString("Energy"); System.out.println(dis13);}
					
					ResultSet r14=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node14+"'");
					if(r14.next()==true){dis14=r14.getString("Energy"); System.out.println(dis14);}
					
					ResultSet r15=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node15+"'");
					if(r15.next()==true){dis15=r15.getString("Energy"); System.out.println(dis15); }
					
					ResultSet r16=connect.createStatement().executeQuery("select * from Cluster2 where Nname='"+node16+"'");
					if(r16.next()==true){dis16=r16.getString("Energy"); System.out.println(dis16); }
					
					System.out.println("dis10 "+dis10);
					System.out.println("dis11 "+dis11);
					System.out.println("dis12 "+dis12);
					System.out.println("dis13 "+dis13);
					System.out.println("dis14 "+dis14);
					System.out.println("dis15 "+dis15);
					System.out.println("dis16 "+dis16);
					
					l1.setForeground(Color.black);
					l2.setForeground(Color.black);
					l3.setForeground(Color.black);
					l4.setForeground(Color.black);
					l5.setForeground(Color.black);
					l6.setForeground(Color.black);
					l7.setForeground(Color.black);
					l8.setForeground(Color.black);
					l9.setForeground(Color.black);
					
					l1.setVisible(false);
					l2.setVisible(false);
					l3.setVisible(false);
					l4.setVisible(false);
					l5.setVisible(false);
					l6.setVisible(false);
					l7.setVisible(false);
					l8.setVisible(false);
					l9.setVisible(false);
					
					
					l1.setText("Cluster 2");
					l1.setVisible(true);
					Thread.sleep(1000);
					l2.setText(nodec2111+"->"+dis9);
					l2.setVisible(true);
					Thread.sleep(1000);
					l3.setText(nodec2222+"->"+dis10);
					l3.setVisible(true);
					Thread.sleep(1000);
					l4.setText(nodec233+"->"+dis11);
					l4.setVisible(true);
					Thread.sleep(1000);
					l5.setText(nodec244+"->"+dis12);
					l5.setVisible(true);
					Thread.sleep(1000);
					l6.setText(nodec255+"->"+dis13);
					l6.setVisible(true);
					Thread.sleep(1000);
					l7.setText(nodec266+"->"+dis14);
					l7.setVisible(true);
					Thread.sleep(1000);
					l8.setText(nodec277+"->"+dis15);
					l8.setVisible(true);
					Thread.sleep(1000);
					l9.setText(nodec288+"->"+dis16);
					l9.setVisible(true);
					Thread.sleep(1000);
					
					
	//BEGINNING OF cLUSTER2 tRAVERSING
					
					Statement cst=connect.createStatement();
					String cs2="select * from Cluster2 ORDER BY Energy DESC";
					//String cs2="select max(Energy) as Strength from Cluster2";
					ResultSet crs=cst.executeQuery(cs2);
					if(crs.next()==true){Strength=crs.getInt("Energy");}
					
					System.out.println(Strength);
					
					Statement cst2=connect.createStatement();
					String cs22="select * from Cluster2 where Energy="+Strength+"";
					
					
					ResultSet crs1=cst2.executeQuery(cs22);
					if(crs1.next()==true)                                
					{
						CH=crs1.getString("Nname");
						value=crs1.getString("Energy");
						
						System.out.println("Node: " +CH);
						System.out.println("Energy: " +value);
						System.out.println("Distance: " +crs1.getString(4));
						System.out.println("CH IS " +CH);
						System.out.println("VALUE IS " +value);
						
						 CHead2=CH;
						
						 
						 String From="Cluster2";
							String to="Cluster3";
							
							if(CH.equalsIgnoreCase("Node9"))     
							{
								l2.setVisible(false);
								l2.setForeground(Color.green);
								l2.setText(node9+"->"+dis9);
								l2.setVisible(true);
								Thread.sleep(1000);
								
								EnergyUpdate(fsize,"Cluster2",CH);
								
									Thread.sleep(2000);
									n9.setIcon(Green);  
									String path1="Node9-> ";
									connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
															
						  }
							
							if(CH.equalsIgnoreCase("Node10"))     
							{
								l3.setVisible(false);
								l3.setForeground(Color.green);
								l3.setText(node10+"->"+dis10);
								l3.setVisible(true);
								Thread.sleep(1000);
								
								EnergyUpdate(fsize,"Cluster2",CH);
								
									Thread.sleep(2000);
									n10.setIcon(Green);  
									String path1="Node10-> ";
									connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
															
						  }
							
							if(CH.equalsIgnoreCase("Node11"))     
							{
								l4.setVisible(false);
								l4.setForeground(Color.green);
								l4.setText(node111+"->"+dis11);
								l4.setVisible(true);
								Thread.sleep(1000);
								
								EnergyUpdate(fsize,"Cluster2",CH);
								
									Thread.sleep(2000);
									n11.setIcon(Green);  
									String path1="Node11-> ";
									connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
															
						  }
							if(CH.equalsIgnoreCase("Node12"))     
							{
								l5.setVisible(false);
								l5.setForeground(Color.green);
								l5.setText(node12+"->"+dis12);
								l5.setVisible(true);
								Thread.sleep(1000);
								
								EnergyUpdate(fsize,"Cluster2",CH);
								
									Thread.sleep(2000);
									n12.setIcon(Green);  
									String path1="Node12-> ";
									connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
															
						  }
							if(CH.equalsIgnoreCase("Node13"))     
							{
								l6.setVisible(false);
								l6.setForeground(Color.green);
								l6.setText(node13+"->"+dis13);
								l6.setVisible(true);
								Thread.sleep(1000);
								
								EnergyUpdate(fsize,"Cluster2",CH);
								
									Thread.sleep(2000);
									n13.setIcon(Green);  
									String path1="Node13-> ";
									connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
															
						  }
							if(CH.equalsIgnoreCase("Node14"))     
							{
								l7.setVisible(false);
								l7.setForeground(Color.green);
								l7.setText(node14+"->"+dis14);
								l7.setVisible(true);
								Thread.sleep(1000);
								
								EnergyUpdate(fsize,"Cluster2",CH);
								
									Thread.sleep(2000);
									n14.setIcon(Green);  
									String path1="Node14-> ";
									connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
															
						  }
							
							if(CH.equalsIgnoreCase("Node15"))     
							{
								l8.setVisible(false);
								l8.setForeground(Color.green);
								l8.setText(node15+"->"+dis15);
								l8.setVisible(true);
								Thread.sleep(1000);
								
								EnergyUpdate(fsize,"Cluster2",CH);
								
									Thread.sleep(2000);
									n15.setIcon(Green);  
									String path1="Node15-> ";
									connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
															
						  }
							
							if(CH.equalsIgnoreCase("Node16"))     
							{
								l9.setVisible(false);
								l9.setForeground(Color.green);
								l9.setText(node16+"->"+dis16);
								l9.setVisible(true);
								Thread.sleep(1000);
								
								EnergyUpdate(fsize,"Cluster2",CH);
								
									Thread.sleep(2000);
									n16.setIcon(Green);  
									String path1="Node16-> ";
									connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
															
						  }
											
							
					
					
							s2.setVisible(true);
							Thread.sleep(2000);
				
				
						
					
					}
					
						

//Distance of All 8 NODES in Cluster3
					
					
		String dis1="",dis2="",dis3="",dis4="",dis5="",dis6="",dis7="",dis8="",dis9="",dis10="";
		String dis11="",dis12="",dis13="",dis14="",dis15="",dis16="";
		
ResultSet r17=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node17+"'");
if(r17.next()==true){dis1=r17.getString("Energy"); System.out.println(dis1);}

ResultSet r18=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node18+"'");
if(r18.next()==true){dis2=r18.getString("Energy"); System.out.println(dis2);}

ResultSet r19=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node19+"'");
if(r19.next()==true){dis3=r19.getString("Energy"); System.out.println(dis3);}

ResultSet r20=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node20+"'");
if(r20.next()==true){dis4=r20.getString("Energy"); System.out.println(dis4);}

ResultSet r21=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node21+"'");
if(r21.next()==true){dis5=r21.getString("Energy"); System.out.println(dis5);}

ResultSet r22=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node22+"'");
if(r22.next()==true){dis6=r22.getString("Energy"); System.out.println(dis6);}

ResultSet r23=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node23+"'");
if(r23.next()==true){dis7=r23.getString("Energy"); System.out.println(dis7); }

ResultSet r24=connect.createStatement().executeQuery("select * from Cluster3 where Nname='"+node24+"'");
if(r24.next()==true){dis8=r24.getString("Energy"); System.out.println(dis8); }


System.out.println("dis18 "+dis2);
System.out.println("dis19 "+dis3);
System.out.println("dis20 "+dis4);
System.out.println("dis21 "+dis5);
System.out.println("dis22 "+dis6);
System.out.println("dis23 "+dis7);
System.out.println("dis24 "+dis8);

l1.setForeground(Color.black);
l2.setForeground(Color.black);
l3.setForeground(Color.black);
l4.setForeground(Color.black);
l5.setForeground(Color.black);
l6.setForeground(Color.black);
l7.setForeground(Color.black);
l8.setForeground(Color.black);
l9.setForeground(Color.black);

l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);
l4.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);


l1.setText("Cluster 3");
l1.setVisible(true);
Thread.sleep(1000);
l2.setText(nodec3111+"->"+dis1);
l2.setVisible(true);
Thread.sleep(1000);
l3.setText(nodec3222+"->"+dis2);
l3.setVisible(true);
Thread.sleep(1000);
l4.setText(nodec344+"->"+dis3);
l4.setVisible(true);
Thread.sleep(1000);
l5.setText(nodec355+"->"+dis4);
l5.setVisible(true);
Thread.sleep(1000);
l6.setText(nodec366+"->"+dis5);
l6.setVisible(true);
Thread.sleep(1000);
l7.setText(nodec366+"->"+dis6);
l7.setVisible(true);
Thread.sleep(1000);
l8.setText(nodec377+"->"+dis7);
l8.setVisible(true);
Thread.sleep(1000);
l9.setText(nodec388+"->"+dis8);
l9.setVisible(true);
Thread.sleep(1000);


//Beginning OF CLUSTER-1 TRAVERSING	

Statement hst=connect.createStatement();
String hs="select * from Cluster3 ORDER BY Energy DESC";
//String hs="select max(Energy) as Strength from Cluster3";
ResultSet rhs=hst.executeQuery(hs);
if(rhs.next()==true){Strength=rhs.getInt("Energy");}

System.out.println(Strength);

Statement hst2=connect.createStatement();
String hs2="select * from Cluster3 where Energy="+Strength+"";


ResultSet hrs1=hst2.executeQuery(hs2);
if(hrs1.next()==true)                                
{
	CH=hrs1.getString("Nname");
	value=hrs1.getString("Energy");
	
	System.out.println("Node: " +CH);
	System.out.println("Energy: " +value);
	System.out.println("Distance: " +hrs1.getString(4));
	System.out.println("CH IS " +CH);
	System.out.println("VALUE IS " +value);
	
	 CHead3=CH;
	
	 
	 String From="Cluster3";
	 String to="Cluster4";
	 
	 
	 
	 
	 if(CH.equalsIgnoreCase("Node17"))     
		{
			l2.setVisible(false);
			l2.setForeground(Color.green);
			l2.setText(node17+"->"+dis1);
			l2.setVisible(true);
			Thread.sleep(1000);
			
			EnergyUpdate(fsize,"Cluster3",CH);
			
				Thread.sleep(2000);
				n17.setIcon(Green);  
				String path1="Node17-> ";
				connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
										
	  }
		
		if(CH.equalsIgnoreCase("Node18"))     
		{
			l3.setVisible(false);
			l3.setForeground(Color.green);
			l3.setText(node18+"->"+dis2);
			l3.setVisible(true);
			Thread.sleep(1000);
			
			EnergyUpdate(fsize,"Cluster3",CH);
			
				Thread.sleep(2000);
				n18.setIcon(Green);  
				String path1="Node18-> ";
				connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
										
	  }
		
		if(CH.equalsIgnoreCase("Node19"))     
		{
			l4.setVisible(false);
			l4.setForeground(Color.green);
			l4.setText(node19+"->"+dis3);
			l4.setVisible(true);
			Thread.sleep(1000);
			
			EnergyUpdate(fsize,"Cluster3",CH);
			
				Thread.sleep(2000);
				n19.setIcon(Green);  
				String path1="Node19-> ";
				connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
										
	  }
		if(CH.equalsIgnoreCase("Node20"))     
		{
			l5.setVisible(false);
			l5.setForeground(Color.green);
			l5.setText(node20+"->"+dis4);
			l5.setVisible(true);
			Thread.sleep(1000);
			
			EnergyUpdate(fsize,"Cluster3",CH);
			
				Thread.sleep(2000);
				n20.setIcon(Green);  
				String path1="Node20-> ";
				connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
										
	  }
		if(CH.equalsIgnoreCase("Node21"))     
		{
			l6.setVisible(false);
			l6.setForeground(Color.green);
			l6.setText(node21+"->"+dis5);
			l6.setVisible(true);
			Thread.sleep(1000);
			
			EnergyUpdate(fsize,"Cluster3",CH);
			
				Thread.sleep(2000);
				n21.setIcon(Green);  
				String path1="Node21-> ";
				connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
										
	  }
		if(CH.equalsIgnoreCase("Node22"))     
		{
			l7.setVisible(false);
			l7.setForeground(Color.green);
			l7.setText(node222+"->"+dis6);
			l7.setVisible(true);
			Thread.sleep(1000);
			
			EnergyUpdate(fsize,"Cluster3",CH);
			
				Thread.sleep(2000);
				n22.setIcon(Green);  
				String path1="Node22-> ";
				connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
										
	  }
		
		if(CH.equalsIgnoreCase("Node23"))     
		{
			l8.setVisible(false);
			l8.setForeground(Color.green);
			l8.setText(node23+"->"+dis7);
			l8.setVisible(true);
			Thread.sleep(1000);
			
			EnergyUpdate(fsize,"Cluster3",CH);
			
				Thread.sleep(2000);
				n23.setIcon(Green);  
				String path1="Node23-> ";
				connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
										
	  }
		
		if(CH.equalsIgnoreCase("Node24"))     
		{
			l9.setVisible(false);
			l9.setForeground(Color.green);
			l9.setText(node24+"->"+dis8);
			l9.setVisible(true);
			Thread.sleep(1000);
			
			EnergyUpdate(fsize,"Cluster3",CH);
			
				Thread.sleep(2000);
				n24.setIcon(Green);  
				String path1="Node24-> ";
				connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
										
	  }
						
		


		s3.setVisible(true);
		Thread.sleep(2000);
	
	
}
//Distance of All 8 NODES in Cluster4

ResultSet r25=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node25+"'");
if(r25.next()==true){dis9=r25.getString("Energy"); System.out.println(dis9);}

ResultSet r26=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node26+"'");
if(r26.next()==true){dis10=r26.getString("Energy"); System.out.println(dis10);}

ResultSet r27=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node27+"'");
if(r27.next()==true){dis11=r27.getString("Energy"); System.out.println(dis11);}

ResultSet r28=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node28+"'");
if(r28.next()==true){dis12=r28.getString("Energy"); System.out.println(dis12);}

ResultSet r29=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node29+"'");
if(r29.next()==true){dis13=r29.getString("Energy"); System.out.println(dis13);}

ResultSet r30=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node30+"'");
if(r30.next()==true){dis14=r30.getString("Energy"); System.out.println(dis14);}

ResultSet r31=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node31+"'");
if(r31.next()==true){dis15=r31.getString("Energy"); System.out.println(dis15); }

ResultSet r32=connect.createStatement().executeQuery("select * from Cluster4 where Nname='"+node32+"'");
if(r32.next()==true){dis16=r32.getString("Energy"); System.out.println(dis16); }

System.out.println("dis26 "+dis10);
System.out.println("dis27 "+dis11);
System.out.println("dis28 "+dis12);
System.out.println("dis29 "+dis13);
System.out.println("dis30 "+dis14);
System.out.println("dis31 "+dis15);
System.out.println("dis32 "+dis16);


l1.setForeground(Color.black);
l2.setForeground(Color.black);
l3.setForeground(Color.black);
l4.setForeground(Color.black);
l5.setForeground(Color.black);
l6.setForeground(Color.black);
l7.setForeground(Color.black);
l8.setForeground(Color.black);
l9.setForeground(Color.black);

l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);
l4.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);


l1.setText("Cluster 4");
l1.setVisible(true);
Thread.sleep(1000);
l2.setText(nodec4111+"->"+dis9);
l2.setVisible(true);
Thread.sleep(1000);
l3.setText(nodec4222+"->"+dis10);
l3.setVisible(true);
Thread.sleep(1000);
l4.setText(nodec433+"->"+dis11);
l4.setVisible(true);
Thread.sleep(1000);
l5.setText(nodec444+"->"+dis12);
l5.setVisible(true);
Thread.sleep(1000);
l6.setText(nodec455+"->"+dis13);
l6.setVisible(true);
Thread.sleep(1000);
l7.setText(nodec466+"->"+dis14);
l7.setVisible(true);
Thread.sleep(1000);
l8.setText(nodec477+"->"+dis15);
l8.setVisible(true);
Thread.sleep(1000);
l9.setText(nodec488+"->"+dis16);
l9.setVisible(true);
Thread.sleep(1000);


//BEGINNING OF cLUSTER2 tRAVERSING

Statement y1=connect.createStatement();
String sy1="select * from Cluster4 ORDER BY Energy DESC";
//String sy1="select max(Energy) as Strength from Cluster4";
ResultSet yrs=y1.executeQuery(sy1);
if(yrs.next()==true){Strength=yrs.getInt("Energy");}

System.out.println(Strength);

Statement y2=connect.createStatement();
String sy2="select * from Cluster4 where Energy="+Strength+"";


ResultSet yrs2=y2.executeQuery(sy2);
if(yrs2.next()==true)                                
{
	CH=yrs2.getString("Nname");
	value=yrs2.getString("Energy");
	
	System.out.println("Node: " +CH);
	System.out.println("Energy: " +value);
	System.out.println("Distance: " +yrs2.getString(4));
	System.out.println("CH IS " +CH);
	System.out.println("VALUE IS " +value);
	
	 CHead4=CH;
		
		
		 
		 String From="Cluster4";
			String to="Destination";
			
			
			
			if(CH.equalsIgnoreCase("Node25"))     
			{
				l2.setVisible(false);
				l2.setForeground(Color.green);
				l2.setText(node25+"->"+dis9);
				l2.setVisible(true);
				Thread.sleep(1000);
				
				EnergyUpdate(fsize,"Cluster4",CH);
				
					Thread.sleep(2000);
					n25.setIcon(Green);  
					String path1="Node25-> ";
					connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
											
		  }
			
			if(CH.equalsIgnoreCase("Node26"))     
			{
				l3.setVisible(false);
				l3.setForeground(Color.green);
				l3.setText(node26+"->"+dis10);
				l3.setVisible(true);
				Thread.sleep(1000);
				
				EnergyUpdate(fsize,"Cluster4",CH);
				
					Thread.sleep(2000);
					n26.setIcon(Green);  
					String path1="Node26-> ";
					connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
											
		  }
			
			if(CH.equalsIgnoreCase("Node27"))     
			{
				l4.setVisible(false);
				l4.setForeground(Color.green);
				l4.setText(node27+"->"+dis11);
				l4.setVisible(true);
				Thread.sleep(1000);
				
				EnergyUpdate(fsize,"Cluster4",CH);
				
					Thread.sleep(2000);
					n27.setIcon(Green);  
					String path1="Node27-> ";
					connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
											
		  }
			if(CH.equalsIgnoreCase("Node28"))     
			{
				l5.setVisible(false);
				l5.setForeground(Color.green);
				l5.setText(node28+"->"+dis12);
				l5.setVisible(true);
				Thread.sleep(1000);
				
				EnergyUpdate(fsize,"Cluster4",CH);
				
					Thread.sleep(2000);
					n28.setIcon(Green);  
					String path1="Node28-> ";
					connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
											
		  }
			if(CH.equalsIgnoreCase("Node29"))     
			{
				l6.setVisible(false);
				l6.setForeground(Color.green);
				l6.setText(node29+"->"+dis13);
				l6.setVisible(true);
				Thread.sleep(1000);
				
				EnergyUpdate(fsize,"Cluster4",CH);
				
					Thread.sleep(2000);
					n29.setIcon(Green);  
					String path1="Node29-> ";
					connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
											
		  }
			if(CH.equalsIgnoreCase("Node30"))     
			{
				l7.setVisible(false);
				l7.setForeground(Color.green);
				l7.setText(node30+"->"+dis14);
				l7.setVisible(true);
				Thread.sleep(1000);
				
				EnergyUpdate(fsize,"Cluster4",CH);
				
					Thread.sleep(2000);
					n30.setIcon(Green);  
					String path1="Node30-> ";
					connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
											
		  }
			
			if(CH.equalsIgnoreCase("Node31"))     
			{
				l8.setVisible(false);
				l8.setForeground(Color.green);
				l8.setText(node31+"->"+dis15);
				l8.setVisible(true);
				Thread.sleep(1000);
				
				EnergyUpdate(fsize,"Cluster4",CH);
				
					Thread.sleep(2000);
					n31.setIcon(Green);  
					String path1="Node31-> ";
					connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
											
		  }
			
			if(CH.equalsIgnoreCase("Node32"))     
			{
				l9.setVisible(false);
				l9.setForeground(Color.green);
				l9.setText(node32+"->"+dis16);
				l9.setVisible(true);
				Thread.sleep(1000);
				
				EnergyUpdate(fsize,"Cluster4",CH);
				
					Thread.sleep(2000);
					n32.setIcon(Green);  
					String path1="Node32-> ";
					connect.createStatement().executeUpdate("insert into RoutingPath values('"+From+"','"+to+"','"+path1+"')");
											
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

long  end = threadBean.getCurrentThreadCpuTime();
System.out.println("The Ending Time "+end);


String timeDelay = Long.toString(end-start);

System.out.println("Total Time Delay "+timeDelay);

double th=((Double.valueOf(timeDelay)/ct.length())*1024);

SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
SimpleDateFormat stf = new SimpleDateFormat("HH:mm:ss");

Date d = new Date();

String b = stf.format(d);
String dt = sdf.format(d);

String date = dt + " " + b;

   
   Statement fin2=connect.createStatement();
   String sin2="insert into TDelay (Fname,Destination,Utime,Delay,th) values('"+fname+"','"+dest+"','"+date+"','"+timeDelay+"','"+String.valueOf(th)+"')";
  fin2.executeUpdate(sin2);
   System.out.println("Table Delay Updated");
   
   
   DataOutputStream dosy=new DataOutputStream(cn.getOutputStream());
	dosy.writeUTF("success");
   
	String Ec1="Node8",Ec2="Node16",Ec3="Node24",Ec4="Node32";

   System.out.println("Corelation Updated");
   


Thread.sleep(4000);
n1.setIcon(Black);
n2.setIcon(Black);
n3.setIcon(Black);
n4.setIcon(Black);
n5.setIcon(Black);
n6.setIcon(Black);
n7.setIcon(Black);
n8.setIcon(Black);
n9.setIcon(Black);
n10.setIcon(Black);

n11.setIcon(Black);
n12.setIcon(Black);
n13.setIcon(Black);
n14.setIcon(Black);
n15.setIcon(Black);

n16.setIcon(Black);
n17.setIcon(Black);
n18.setIcon(Black);
n19.setIcon(Black);
n20.setIcon(Black);
n21.setIcon(Black);
n22.setIcon(Black);
n23.setIcon(Black);
n24.setIcon(Black);
n25.setIcon(Black);
n26.setIcon(Black);
n27.setIcon(Black);
n28.setIcon(Black);
n29.setIcon(Black);
n30.setIcon(Black);
n31.setIcon(Black);
n32.setIcon(Black);
l1.setVisible(false);
l2.setVisible(false);
l3.setVisible(false);
l4.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);

s1.setVisible(false);
s2.setVisible(false);
s3.setVisible(false);
					
	}
					
}catch(Exception es){System.out.println(es);}
			
}//Port 8989 End
		}//Run Method
	}//Port listener


	public void EnergyUpdate(int fsize,String Cname,String nname) 
	{
		Dbcon db=new Dbcon();
		Connection connect=db.getConnection();

		try
		{

			Statement st=connect.createStatement();
			String s1="select * from "+Cname+" where Nname='"+nname+"'";
			ResultSet rs1=st.executeQuery(s1);
			if(rs1.next()==true)
			{
				String Energy2=rs1.getString("Energy");
				
				int en=Integer.parseInt(Energy2);
				int power1=en-fsize;
				String pw1=Integer.toString(power1);
				
				connect.createStatement().executeUpdate("update "+Cname+" set Energy='"+pw1+"' where Nname='"+nname+"'");
				
			}
			
		
			
		}catch(Exception es){System.out.println(es);}
		
	}
}//class
