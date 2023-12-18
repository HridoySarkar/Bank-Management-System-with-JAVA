package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Hridoy
 */
public class Transactions extends JFrame implements ActionListener{
    
    String formNo;
    JButton deposit,balance,pinChange,statement,mCash,withdrawl,remittance,exit;
    JLabel image;
    
    Transactions(){
        //set null
        setLayout(null);
        
        ImageIcon icon1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image icon2 = icon1.getImage().getScaledInstance(850, 850, WIDTH);
        ImageIcon icon = new ImageIcon(icon2);
        
        image = new JLabel(icon);
        image.setBounds(0,0,850,700);
        add(image);
        
        JLabel headText = new JLabel("Please select your Transaction");
        headText.setBounds(200,200,500,40);
        headText.setFont(new Font("Raleway",Font.BOLD,16));
        headText.setForeground(Color.WHITE);
        image.add(headText);
        
        
        //buttons left side
        deposit = new JButton("Deposit");
        deposit.setBounds(150,318,130,30);
        deposit.addActionListener(this);
        deposit.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(deposit);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(150,350,130,30);
        withdrawl.addActionListener(this);
        withdrawl.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(withdrawl);
        
        mCash = new JButton("M-Cash");
        mCash.setBounds(150,382,130,30);
        mCash.addActionListener(this);
        mCash.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(mCash);
        
        remittance = new JButton("Remittance");
        remittance.setBounds(150,414,130,30);
        remittance.addActionListener(this);
        remittance.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(remittance);
        
        
        //buttons right side
        balance = new JButton("Balance Check");
        balance.setBounds(355,318,130,30);
        balance.addActionListener(this);
        balance.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(balance);
        
        statement = new JButton("Statement");
        statement.setBounds(355,350,130,30);
        statement.addActionListener(this);
        statement.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(statement);
        
        pinChange = new JButton("PIN Change");
        pinChange.setBounds(355,382,130,30);
        pinChange.addActionListener(this);
        pinChange.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(pinChange);
        
        exit = new JButton("Exit");
        exit.setBounds(355,414,130,30);
        exit.addActionListener(this);
        exit.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(exit);
        
        
        
        
        setSize(850,750);
        setLocation(300,20);
        setVisible(true);
        setTitle("Transactions");
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == exit){
            System.exit(0);
        }
    }
    
    public static void main(String args[]) {
        new Transactions();
    }
}
