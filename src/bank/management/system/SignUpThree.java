package bank.management.system;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Hridoy
 */
public class SignUpThree extends JFrame {
    
    JRadioButton savingsAccount,fdAccount,currentAccount,reDepositAccount;
    
    SignUpThree(){
        
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        
        JLabel head = new JLabel("Page 3: ACCOUNT DETAILS");
        head.setFont(new Font("Raleway",Font.BOLD,22));
        head.setBounds(280,40,400,40);
        add(head);
        
        JLabel accountType = new JLabel("Account Type:");
        accountType.setFont(new Font("Raleway",Font.BOLD,20));
        accountType.setBounds(100,140,200,40);
        add(accountType);
        
        
        savingsAccount = new JRadioButton("Savings Account");
        savingsAccount.setFont(new Font("Raleway",Font.BOLD,16));
        savingsAccount.setBackground(Color.white);
        savingsAccount.setBounds(100,180,200,30);
        add(savingsAccount);
        
        fdAccount = new JRadioButton("Fixed Deposit Account");
        fdAccount.setFont(new Font("Raleway",Font.BOLD,16));
        fdAccount.setBackground(Color.white);
        fdAccount.setBounds(350,180,200,30);
        add(fdAccount);
        
        currentAccount = new JRadioButton("Current Account");
        currentAccount.setFont(new Font("Raleway",Font.BOLD,16));
        currentAccount.setBackground(Color.white);
        currentAccount.setBounds(100,220,200,30);
        add(currentAccount);
        
        
        reDepositAccount = new JRadioButton("Recurring Deposit Account");
        reDepositAccount.setFont(new Font("Raleway",Font.BOLD,16));
        reDepositAccount.setBackground(Color.white);
        reDepositAccount.setBounds(350,220,250,30);
        add(reDepositAccount);
        
        ButtonGroup accountTypeGroup = new ButtonGroup();
        accountTypeGroup.add(savingsAccount);
        accountTypeGroup.add(fdAccount);
        accountTypeGroup.add(currentAccount);
        accountTypeGroup.add(reDepositAccount);
        
        
        getContentPane().setBackground(Color.white);
        setSize(850,820);
        setLocation(350,120);
        setVisible(true);
        
    }
    
    public static void main(String args[]) {
        
        new SignUpThree();
    }
}
