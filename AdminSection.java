
package Cab_Booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;


public class AdminSection extends JFrame implements ActionListener {
    
    JLabel l1, l2;
    JButton bt1, bt2, bt3, bt4;
    JPanel p1, p2;
    Font f, f1;
    
    AdminSection(){
        
        super("Admin Section");
        setLocation(450, 250);
        setSize(600, 300);
        
        f=new Font("Arial", Font.BOLD, 40);
        f1=new Font("Arial", Font.BOLD, 20);
        
        l1=new JLabel("  Admin Section");
        bt1=new JButton("Intercity Driver");
        bt2=new JButton("Intracity Driver");
        bt3=new JButton("Transport Driver");
        bt4=new JButton("SignUp Driver");
        
        l1.setHorizontalAlignment(JLabel.CENTER);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        
        l1.setFont(f);
        bt1.setFont(f1);
        bt2.setFont(f1);
        bt3.setFont(f1);
        bt4.setFont(f1);
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(5,1,10,10));
        p1.add(l1);
        p1.add(bt1);
        p1.add(bt2);
        p1.add(bt3);
        p1.add(bt4);
        
        ImageIcon ic= new ImageIcon(ClassLoader.getSystemResource("Cab_Booking/Icons/admin1.png"));
        Image img=ic.getImage().getScaledInstance(400, 380, Image.SCALE_DEFAULT);
        ImageIcon ic1 =new ImageIcon(img);
        l2=new JLabel(ic1);
        l2.setBounds(350, 70, 150,150);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(1,1,10,10));
        p2.add(l2);
        
        setLayout(new BorderLayout(10, 10));
        add(p1, "West");
        add(p2, "Center");
        
        
        
        
        
        
    }
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==bt1){
            new Add_Intercity_Driver().setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==bt2){
            new Add_Intracity_Driver().setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==bt3){
            new Add_Transport_Driver().setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==bt4){
            new SignUp().setVisible(true);
            this.setVisible(false);
            
        }
        
    }
    public static void main(String[] args){
        
        new AdminSection().setVisible(true);
    }
}
