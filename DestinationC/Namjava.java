import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.*;

public class ServiceProvider extends JFrame implements ActionListener
{

		JPanel p1;
		JTextArea ta;
		JScrollPane pane;
		
		
		String path1;
		
		
		public Font f = new Font("Times new roman", Font.BOLD, 25);
		public Font f1 = new Font("Times new roman", Font.BOLD, 18);
		public Font f2 = new Font("Times new roman", Font.BOLD, 16);
		public Font f3 = new Font("Times new roman", Font.BOLD, 23);
		public Font f4 = new Font("Times new roman", Font.BOLD, 15);
		
		JButton b1,b2;
		
		ServiceProvider()
		{
			p1=new JPanel();
			p1.setLayout(null);
			p1.setBackground(new Color(12,102,102));
		
			b1=new JButton("Browse");
			b2=new JButton("Upload");
			b1.setBounds(50,420,150,30);
			b2.setBounds(250,420,150,30);
			b1.addActionListener(this);
			b2.addActionListener(this);
			
			b1.setFont(f4);
			b1.setBackground(Color.WHITE);
			b1.setForeground(new Color(0, 0, 0));

			b2.setFont(f4);
			b2.setBackground(Color.WHITE);
			b2.setForeground(new Color(0,0,0));

			
			ta=new JTextArea();
			pane=new JScrollPane();
			pane.setViewportView(ta);
			ta.setRows(100);
			ta.setColumns(100);
			pane.setBounds(50,100,350,300);
			
			
		
			p1.add(pane);p1.add(b1);p1.add(b2);
			add(p1);
			setSize(500,500);
			setVisible(true);
		}
	
	@Override
	public void actionPerformed(ActionEvent a1) 
	{
		String strLine = null;
		String newline = "\n";
		
		if(a1.getSource()==b2)
		{
			
			String clist[]={"Dest A","Dest B","Dest C"};
			JComboBox cb=new JComboBox(clist);
			String fname=JOptionPane.showInputDialog(null,"Enter the File Name");
			JOptionPane.showMessageDialog(null,cb,"Select Destination",JOptionPane.QUESTION_MESSAGE);
			try
			{
				String data=ta.getText();
				String dest=cb.getSelectedItem().toString();
				
				Socket up=new Socket("localhost",8989);
				DataOutputStream dos3=new DataOutputStream(up.getOutputStream());
				dos3.writeUTF(fname);
				dos3.writeUTF(data);
				dos3.writeUTF(dest);
				
				
				DataInputStream ins=new DataInputStream(up.getInputStream());
				String msg=ins.readUTF();
				
				if(msg.equalsIgnoreCase("success"))
				{
					JOptionPane.showMessageDialog(null,"File Successfully Uploaded");
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Uploading Failed");
				}
			
			
				
			}catch(Exception es){System.out.println(es);}
		}

		if(a1.getSource()==b1)
		{
			JFileChooser chooser = new JFileChooser();

			try {

				File f = new File(new File("filename.txt").getCanonicalPath());

				chooser.setSelectedFile(f);
			} catch (IOException e1) {
			}

			
			int retval = chooser.showOpenDialog(b1);
			if (retval == JFileChooser.APPROVE_OPTION) {
				File field = chooser.getSelectedFile();
				 path1=field.getAbsolutePath();
			}

			File curFile = chooser.getSelectedFile();

			try {

				FileInputStream fstream = new FileInputStream(curFile);

				DataInputStream ins = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(
						ins));

				StringBuffer buffer = new StringBuffer();
				while ((strLine = br.readLine()) != null) {

					System.out.println(strLine);
					buffer.append(strLine + "\n");

				}
				ta.setText(buffer.toString());

			} catch (Exception e1) {
				System.err.println("Error: " + e1.getMessage());
			}
		}
		
	}
	public static void main(String[] args) 
	{
		new ServiceProvider();
		
		try
		{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch(Exception es){System.out.println(es);}
	}

}
