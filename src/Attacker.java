import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import javax.swing.*;


public class Attacker extends JFrame implements ActionListener
{
	JPanel p1;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JTextArea ta;
	JScrollPane pane;
	JButton b1,b2;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	
	JComboBox c1,c2;
	
	public Font f1 = new Font("Times new roman", Font.BOLD, 25);
	public Font f2 = new Font("Times new roman", Font.BOLD, 15);
	
	Attacker()
	{
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.WHITE);
		setTitle("Attacker::Traffic and Energy Aware Routing for Heterogeneous Wireless Sensor Networks");
		
		 ImageIcon banner = new ImageIcon(this.getClass().getResource("Attacker.gif"));
		 JLabel title = new JLabel();
		 title.setIcon(banner);
		 title.setBounds(50,5, 262,200);
		
		
		l1=new JLabel("Select Cluster :");
		l1.setFont(f2);
		l1.setForeground(Color.RED);
		l1.setBounds(40,100,100,30);
		
		
		l2=new JLabel("Select Node");
		l2.setFont(f2);
		l2.setForeground(Color.RED);
		l2.setBounds(40,150,100,30);
		
		l3=new JLabel("Energy ");
		l3.setFont(f2);
		l3.setForeground(Color.RED);
		l3.setBounds(40,200,100,30);
		
		t1=new JTextField();
		t1.setBounds(160,200,100,25);
		//t2=new JTextField();
	//	t2.setBounds(160,150,100,25);
		
		c1=new JComboBox();
		c1.addItem("CHOOSE");
		c1.addItem("Cluster1");
		c1.addItem("Cluster2");
		c1.addItem("Cluster3");
		c1.addItem("Cluster4");
		c1.setBounds(160,100,100,25);
		
		c2=new JComboBox();
		
		c1.addActionListener(this);
		
		c2.setBounds(160,150,100,25);
		
		b1=new JButton("Get Energy");
		b1.setBounds(50,280,100,25);
		
		b2=new JButton("Modify");
		b2.setBounds(160,280,100,25);
		
		
	
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		
	
		p1.add(l1);p1.add(l2);p1.add(c1);p1.add(t1);p1.add(b1);p1.add(l3);p1.add(c2);
		p1.add(b2);
		p1.add(title);
		add(p1);
		setSize(350,400);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) 
	{
		new Attacker();
		
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch(Exception es){System.out.println(es);}
		
	}
	
	
	public void actionPerformed(ActionEvent a1) 
	{
		
		if(a1.getSource()==c1)
		{
			String clust=c1.getSelectedItem().toString();
			System.out.println(clust);
			
			if(clust.equalsIgnoreCase("Cluster1"))
			{
				c2.addItem("Node1");
				c2.addItem("Node2");
				c2.addItem("Node3");
				c2.addItem("Node4");
				c2.addItem("Node5");
				c2.addItem("Node6");
				c2.addItem("Node7");
				c2.addItem("Node8");
			}
			if(clust.equalsIgnoreCase("Cluster2"))
			{
				c2.addItem("Node9");
				c2.addItem("Node10");
				c2.addItem("Node11");
				c2.addItem("Node12");
				c2.addItem("Node13");
				c2.addItem("Node14");
				c2.addItem("Node15");
				c2.addItem("Node16");
			}
			if(clust.equalsIgnoreCase("Cluster3"))
			{
				c2.addItem("Node17");
				c2.addItem("Node18");
				c2.addItem("Node19");
				c2.addItem("Node20");
				c2.addItem("Node21");
				c2.addItem("Node22");
				c2.addItem("Node23");
				c2.addItem("Node24");
			}
			if(clust.equalsIgnoreCase("Cluster4"))
			{
				c2.addItem("Node25");
				c2.addItem("Node26");
				c2.addItem("Node27");
				c2.addItem("Node28");
				c2.addItem("Node29");
				c2.addItem("Node30");
				c2.addItem("Node31");
				c2.addItem("Node32");
			}
		
		}
		if(a1.getSource()==b1)
		{
			String cluster=(c1.getSelectedItem()).toString();
			String node=(c2.getSelectedItem()).toString();
		
			
			try
			{
				
					Socket s1=new Socket("localhost",4444);
					DataOutputStream dos5=new DataOutputStream(s1.getOutputStream());
					dos5.writeUTF(cluster);
					dos5.writeUTF(node);
				
					DataInputStream in5=new DataInputStream(s1.getInputStream());
					int msg=in5.readInt();
					t1.setText(Integer.toString(msg));
					
				
			}catch(Exception es){System.out.println(es);}
		}
		
		if(a1.getSource()==b2)
		{
			String cluster=(c1.getSelectedItem()).toString();
			String node=(c2.getSelectedItem()).toString();
			String men=t1.getText();
			
			
			try
			{
				
				InetAddress ia = InetAddress.getLocalHost();
				String ip1 = ia.getHostAddress();
				

					Socket s1=new Socket("localhost",5555);
					DataOutputStream dos5=new DataOutputStream(s1.getOutputStream());
					dos5.writeUTF(cluster);
					dos5.writeUTF(node);
					dos5.writeUTF(men);
					dos5.writeUTF(ip1);
					
					DataInputStream in5=new DataInputStream(s1.getInputStream());
					String msg=in5.readUTF();
					
				JOptionPane.showMessageDialog(null,"Successfully Attacked");
					
				
			}catch(Exception es){System.out.println(es);}
		}
		
		
	}
	

}
