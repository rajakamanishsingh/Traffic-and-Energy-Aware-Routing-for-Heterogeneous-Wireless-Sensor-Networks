import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;

import javax.swing.*;

public class DestinationA extends JFrame implements ActionListener
{
	JPanel p1;
	JLabel l1,l2;
	JTextField t1,t2;
	JTextArea ta;
	JScrollPane pane;
	JButton b1,b2;
	String keyWord = "ef50a0ef2c3e3a5fdf803ae9752c8c66";
	
	public Font f = new Font("Times new roman", Font.BOLD, 25);
	public Font f1 = new Font("Times new roman", Font.BOLD, 18);
	public Font f2 = new Font("Times new roman", Font.BOLD, 16);
	public Font f3 = new Font("Times new roman", Font.BOLD, 23);
	public Font f4 = new Font("Times new roman", Font.BOLD, 15);
	
	String fname,ct;
	
	
	
	DestinationA()
	{
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(new Color(127,92,100));
		setTitle("Destination A ::Traffic and Energy Aware Routing for Heterogeneous Wireless Sensor Networks");
		
		l1=new JLabel("File Name :");
		l1.setFont(f2);
		l1.setForeground(Color.white);
		l1.setBounds(70,100,100,30);
		l2=new JLabel("Keyword");
		
		 ImageIcon banner = new ImageIcon(this.getClass().getResource("EndUser.png"));
		 JLabel title = new JLabel();
		 title.setIcon(banner);
		 title.setBounds(0, 50, 430,500);
		
		
		t1=new JTextField();
		t1.setBounds(170,100,100,25);
		t2=new JTextField();
		
		b1=new JButton("save");
		b1.setBounds(150,500,100,25);
		b1.setFont(f4);
		b1.setBackground(Color.WHITE);
		b1.setForeground(new Color(27,92,0));
		
		
		
		ta=new JTextArea();
		pane=new JScrollPane();
		pane.setViewportView(ta);
		ta.setRows(50);
		ta.setColumns(50);
		ta.setForeground(new Color(27,92,0));
		pane.setBounds(70,150,300,300);
		
		b1.addActionListener(this);
		
		p1.add(pane);
		p1.add(l1);p1.add(l2);p1.add(t1);p1.add(t2);p1.add(b1);
		p1.add(title);
		add(p1);
		setSize(450,600);
		setVisible(true);
		
		int[] ports = new int[]
			              		{9991};

			              		for (int i = 0; i < 1; i++)
			              		{
			              			Thread t = new Thread(new PortListener(ports[i]));
			              			t.setName("Listener-" + ports[i]);
			              			t.start();

			              		}
		
	}
	
	public static void main(String[] args) 
	{
		new DestinationA();
		
		try
		{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch(Exception es){System.out.println(es);}
		
		
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
			
			if(this.port==9991)
			{
				try
				{
					
				
					ServerSocket sst = new ServerSocket(9991);
					Socket cn;
					while (true) 
					{
					cn = sst.accept();
					
					DataInputStream in3=new DataInputStream(cn.getInputStream());
					 fname=in3.readUTF();
					 ct=in3.readUTF();
					
					t1.setText(fname);
					ta.setText(ct);
					
					DataOutputStream dos9=new DataOutputStream(cn.getOutputStream());
					dos9.writeUTF("success");
					}
				}catch(Exception es){System.out.println(es);}
			}
		}
	}
	
	public void actionPerformed(ActionEvent a1) 
	{
		if(a1.getSource()==b1)
		{
			
			try
			{
				PrintStream out1 = null;
				try {
				    out1= new PrintStream(new FileOutputStream("DestinationA\\"+fname));
				    out1.print(ct);
				}
				finally {
				    if (out1 != null) out1.close();
				}
				
				JOptionPane.showMessageDialog(null,"File Stored Successfully");
			}catch(Exception es){System.out.println(es);}
		}
		
		
		
		
	}
	

}
