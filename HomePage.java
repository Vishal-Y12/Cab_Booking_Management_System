
package Cab_Booking;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class HomePage extends JFrame implements ActionListener {
    
    JLabel l1;
    Font f, f1, f2;
    JPanel p1, p2;
    
    
    HomePage(){
        super("Cab Booking Home Page");
        setLocation(0,0);
        setSize(1550, 800);
        
        ImageIcon ic= new ImageIcon(ClassLoader.getSystemResource("Cab_Booking/Icons/homepage12.jpg"));
        Image img=ic.getImage().getScaledInstance(1400, 800, Image.SCALE_DEFAULT);
        ImageIcon ic1 =new ImageIcon(img);
        l1=new JLabel(ic1);
        
        
        
        
        f=new Font("Lucida Fax", Font.BOLD, 20);
        f2=new Font("Gadugi", Font.BOLD, 35);
        f1=new Font("MS UI Gothic", Font.BOLD, 18);
        
        
        JMenuBar m1=new JMenuBar();
        
        
        JMenu men1=new JMenu("Customer Profile");
        JMenuItem ment1=new JMenuItem("Add Customer Profile");
        JMenuItem ment2=new JMenuItem("View Customer Profile");
        
        
        JMenu men2=new JMenu("Manage Customer ");
        JMenuItem ment3=new JMenuItem("Update Customer Details");
        
        
        JMenu men3=new JMenu("Book Intracity Cab");
        JMenuItem ment5=new JMenuItem("Book Cab");
        JMenuItem ment6=new JMenuItem("View Booked Cab");
        
        
        JMenu men4=new JMenu("Book Intercity Cab");
        JMenuItem ment7=new JMenuItem("Book Intercity Cab");
        JMenuItem ment8=new JMenuItem("View Intercity Booked Cab");
        
        
        JMenu men5=new JMenu("Transport");
        JMenuItem ment9=new JMenuItem("Book Package");
        JMenuItem ment10=new JMenuItem("View Booked Package");
        
        JMenu men6=new JMenu("Bill");
        JMenuItem ment11=new JMenuItem("Check Bill");
        
        JMenu men7=new JMenu("Delete");
        JMenuItem ment12=new JMenuItem("Delete Customer");
        
        JMenu men8=new JMenu("Exit");
//        JMenuItem ment13=new JMenuItem("About");
//        JMenuItem ment14=new JMenuItem("Exit");
        
        
        men1.add(ment1);
        men1.add(ment2);
        men2.add(ment3);
        men3.add(ment5);
        men3.add(ment6);
        men4.add(ment7);
        men4.add(ment8);
        men5.add(ment9);
        men5.add(ment10);
        men6.add(ment11);
        men7.add(ment12);
//        men8.add(mentl3);
//        men8.add(mentl4);
        
        
        m1.add(men1);
        m1.add(men2);
        m1.add(men3);
        m1.add(men4);
        m1.add(men5);
        m1.add(men6);
        m1.add(men7);
        m1.add(men8);
        
        
        m1.setBackground(Color.BLACK);
        
        men1.setForeground(Color.WHITE);
        men2.setForeground(Color.WHITE);
        men3.setForeground(Color.WHITE);
        men4.setForeground(Color.WHITE);
        men5.setForeground(Color.WHITE);
        men6.setForeground(Color.WHITE);
        men7.setForeground(Color.WHITE);
        men8.setForeground(Color.RED);
       
        
        ment1.setBackground(Color.BLACK);
        ment2.setBackground(Color.BLACK);
        ment3.setBackground(Color.BLACK);
        ment5.setBackground(Color.BLACK);
        ment6.setBackground(Color.BLACK);
        ment7.setBackground(Color.BLACK);
        ment8.setBackground(Color.BLACK);
        ment9.setBackground(Color.BLACK);
        ment10.setBackground(Color.BLACK);
        ment11.setBackground(Color.BLACK);
        ment12.setBackground(Color.BLACK);
//        ment13.setBackground(Color.BLACK);
//        ment14.setBackground(Color.BLACK);
        
        ment1.setForeground(Color.YELLOW);
        ment2.setForeground(Color.YELLOW);
        ment3.setForeground(Color.YELLOW); 
        ment5.setForeground(Color.YELLOW);
        ment6.setForeground(Color.YELLOW);
        ment7.setForeground(Color.YELLOW);
        ment8.setForeground(Color.YELLOW);
        ment9.setForeground(Color.YELLOW);
        ment10.setForeground(Color.YELLOW);
        ment11.setForeground(Color.YELLOW);
        ment12.setForeground(Color.YELLOW);
//        ment13.setForeground(Color.RED);
//        ment14.setForeground(Color.RED);
//        
        
        ment1.addActionListener(this);
        ment2.addActionListener(this);
        ment3.addActionListener(this);
        ment5.addActionListener(this);
        ment6.addActionListener(this);
        ment7.addActionListener(this);
        ment8.addActionListener(this);
        ment9.addActionListener(this);
        ment10.addActionListener(this);
        ment11.addActionListener(this);
        ment12.addActionListener(this);



    
        
        setJMenuBar(m1);
        add(l1);
        
//        UIManager.put("MenuBar.font", f);
//        UIManager.put("MenuItem.font", f);
        
        
        
        
       
    }
    
    public void actionPerformed(ActionEvent e){
        
        String comnd =e.getActionCommand();
        if(comnd.equals("Add Customer Profile"))
        {
            new Add_Customer();
        }
        else if(comnd.equals("View Customer Profile")){
            
            new View_Customer().setVisible(true);
        }
        else if(comnd.equals("Update Customer Details")){
            
            new Update_Customer().setVisible(true);
        }
        else if(comnd.equals("Book Cab")){
            new Book_Cab().setVisible(true);
        }
        else if(comnd.equals("View Booked Cab")){
            
            new View_BookedCab().setVisible(true);
            
        }
        else if(comnd.equals("Book Intercity Cab")){
            
            new Book_Intercity_Cab().setVisible(true);
            
        }
        else if(comnd.equals("View Intercity Booked Cab")){
            new View_Intercity_Booked_Cab().setVisible(true);
            
        }
        else if(comnd.equals("Book Package")){
            new Book_Package().setVisible(true);
            
        }
        else if(comnd.equals("View Booked Package")){
            new View_Booked_Package().setVisible(true);
            
        }
         else if(comnd.equals("Check Bill")){
            new CheckBill().setVisible(true);
            
        }
        else if(comnd.equals("Delete Customer")){
            new Delete_Customer().setVisible(true);
            
        }
//        else if(comnd.equals("About")){
//            new About().setVisible(true);
//            
//        }
        else if(comnd.equals("Exit")){
            System.exit(0);
            
        }
    }
    
    public static void main(String[] args){
        
        new HomePage().setVisible(true);
    }
    
    
}
