
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
    
    public Dashboard() {

        super("HOTEL MANAGEMENT SYSTEM");
	
        setForeground(Color.CYAN);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/wp8521497.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	    JLabel NewLabel = new JLabel(i3);
	    NewLabel.setBounds(0, 0, 1950, 1000);
        add(NewLabel);
        
        JLabel hms = new JLabel("THE ALANKAR HOTEL WELCOMES YOU");
        hms.setForeground(Color.WHITE);
        hms.setFont(new Font("Tahoma", Font.PLAIN, 46));
        hms.setBounds(550, 60, 1000, 85);
	    NewLabel.add(hms);
		
		
        JMenuBar menuBar = new JMenuBar();
	    setJMenuBar(menuBar);
        JMenu hm = new JMenu("HOTEL MANAGEMENT");
        hm.setForeground(Color.BLUE);
	    menuBar.add(hm);

        JMenuItem rs = new JMenuItem("RECEPTION");
        hm.add(rs);
		
	    JMenu ad = new JMenu("ADMIN");
        ad.setForeground(Color.RED);
	    menuBar.add(ad);
        
        JMenuItem ad1 = new JMenuItem("ADD EMPLOYEE");
	    ad.add(ad1);
        
        ad1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddEmployee().setVisible(true);
                }catch(Exception e ){}
            }
	    });
        

        JMenuItem ad2 = new JMenuItem("ADD ROOMS");
	    ad.add(ad2);
        
        ad2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                try{
                    new AddRoom().setVisible(true);
                }catch(Exception e ){}
            }
	    });
        

        rs.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Reception().setVisible(true);
            }
        });
        
        
        JMenuItem ad3 = new JMenuItem("ADD DRIVERS");
	    ad.add(ad3);
        
	    ad3.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent ae){
                try{
                    new AddDrivers().setVisible(true);
                }catch(Exception e ){}
            }
	    });
        
		
        setSize(1950,1090);
	    setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
