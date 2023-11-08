package bank.management.system;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Hridoy
 */
public class Transactions extends JFrame{

    Transactions(){
        setLayout(null);
        
        ImageIcon icon1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image icon2 = icon1.getImage().getScaledInstance(850, 850, WIDTH);
        ImageIcon icon = new ImageIcon(icon2);
        
        JLabel image = new JLabel(icon);
        image.setBounds(0,0,850,700);
        add(image);
        
        JLabel headText = new JLabel("Please select your Transaction");
        headText.setBounds(200,200,500,40);
        headText.setFont(new Font("Raleway",Font.BOLD,16));
        headText.setForeground(Color.WHITE);
        image.add(headText);
        
        
        //buttons left side
        JButton deposit = new JButton("Deposit");
        deposit.setBounds(150,318,130,30);
        deposit.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(deposit);
        
        JButton withdral = new JButton("Cash Withdral");
        withdral.setBounds(150,350,130,30);
        withdral.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(withdral);
        
        JButton mCash = new JButton("M-Cash");
        mCash.setBounds(150,382,130,30);
        mCash.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(mCash);
        
        JButton remittance = new JButton("Remittance");
        remittance.setBounds(150,414,130,30);
        remittance.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(remittance);
        
        
        //buttons right side
        JButton balance = new JButton("Balance Check");
        balance.setBounds(355,318,130,30);
        balance.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(balance);
        
        JButton statement = new JButton("Statement");
        statement.setBounds(355,350,130,30);
        statement.setFont(new Font("Raleway",Font.BOLD,12));
        image.add(statement);
        
        
        
        
        
        
        setSize(850,750);
        setLocation(300,20);
        setVisible(true);
        setTitle("Transactions");
    }
    
    public static void main(String args[]) {
        new Transactions();
    }
}
