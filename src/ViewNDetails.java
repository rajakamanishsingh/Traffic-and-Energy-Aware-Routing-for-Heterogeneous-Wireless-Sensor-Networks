import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import java.io.*;
import java.util.*;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;



import java.net.*;

public class ViewNDetails extends JFrame implements ActionListener
{
 JButton property,Reset;
 JPanel panel;
 JLabel label1;
  JTextField  text1;
  Vector data;
Vector heading;

JButton view;
JScrollPane pane;
JTable table;
int v,h;
String s,d,call,dt;
Container c;

JLabel imglabel;
ViewNDetails() 
 {

setTitle("Node Details::Traffic and Energy Aware Routing for Heterogeneous Wireless Sensor Networks");
c= getContentPane();
c.setLayout (null);


label1 = new JLabel();
label1.setText("Enter Username");

 text1 = new JTextField(20);
   property=new JButton("View Property");

   property.addActionListener(this);

   String clist[]={"cluster1","cluster2","cluster3","cluster4"};
	JComboBox cb=new JComboBox(clist);
	JOptionPane.showMessageDialog(null,cb,"Select Destination",JOptionPane.QUESTION_MESSAGE);



try {
	String cname=cb.getSelectedItem().toString();
	
	 Vector heading = new Vector();
	 
	 heading.addElement("SI-Number");
	 heading.addElement("Channel-Name");
	 heading.addElement("Energy ");
	 heading.addElement("Link wieght");
	 
	 System.out.println(cname);
	
	 
	 if(cname.equalsIgnoreCase("cluster1"))
	 {
			Dbcon db=new Dbcon();
		 	Connection connect=db.getConnection();
             Statement stmt = connect.createStatement();
             
             
             String query = "SELECT * From Cluster1";
             ResultSet rs = stmt.executeQuery(query);

             ResultSetMetaData rsm=rs.getMetaData();
             int col=rsm.getColumnCount();


             data=new Vector();
             while(rs.next())
             {
            	 Vector row = new Vector();
            	 for(int i = 1; i <=col; i++){
                 row.addElement(rs.getObject(i));

             }

            	 data.addElement(row);
             }
	 	}

	 if(cname.equalsIgnoreCase("cluster2"))
	 {
			Dbcon db=new Dbcon();
		 	Connection connect=db.getConnection();
             Statement stmt = connect.createStatement();
             
             
             String query = "SELECT * From Cluster2";
             ResultSet rs = stmt.executeQuery(query);

             ResultSetMetaData rsm=rs.getMetaData();
             int col=rsm.getColumnCount();


             data=new Vector();
             while(rs.next())
             {
            	 Vector row = new Vector();
            	 for(int i = 1; i <=col; i++){
                 row.addElement(rs.getObject(i));

             }

            	 data.addElement(row);
             }
	 	} 
	 if(cname.equalsIgnoreCase("cluster3"))
	 {
			Dbcon db=new Dbcon();
		 	Connection connect=db.getConnection();
             Statement stmt = connect.createStatement();
             
             
             String query = "SELECT * From Cluster3";
             ResultSet rs = stmt.executeQuery(query);

             ResultSetMetaData rsm=rs.getMetaData();
             int col=rsm.getColumnCount();


             data=new Vector();
             while(rs.next())
             {
            	 Vector row = new Vector();
            	 for(int i = 1; i <=col; i++){
                 row.addElement(rs.getObject(i));

             }

            	 data.addElement(row);
             }
	 	}
	 if(cname.equalsIgnoreCase("cluster4"))
	 {
			Dbcon db=new Dbcon();
		 	Connection connect=db.getConnection();
             Statement stmt = connect.createStatement();
             
             
             String query = "SELECT * From Cluster4";
             ResultSet rs = stmt.executeQuery(query);

             ResultSetMetaData rsm=rs.getMetaData();
             int col=rsm.getColumnCount();


             data=new Vector();
             while(rs.next())
             {
            	 Vector row = new Vector();
            	 for(int i = 1; i <=col; i++){
                 row.addElement(rs.getObject(i));

             }

            	 data.addElement(row);
             }
	 	}
			  
			JTable table = new JTable(data,heading);
			  
			  pane = new JScrollPane(table);
			 
			  pane.setBounds(20,50,600,280);
			  c.add(pane);
			 // c.add(image);
	 } 
	 catch(Exception ex) {
		 ex.printStackTrace();
		 } 


c.setBackground(Color.ORANGE);
setSize(650,390);
setVisible(true);



  }


public void actionPerformed(ActionEvent ae)
{

Object o=ae.getSource();

if(o==property)
{
		
}

}

}