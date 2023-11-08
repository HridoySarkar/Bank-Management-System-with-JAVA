package bank.management.system;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Hridoy
 */
public class Transactions extends JFrame{

    Transactions(){
        
        ImageIcon icon1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image icon2 = icon1.getImage().getScaledInstance(850, 850, WIDTH);
        ImageIcon icon = new ImageIcon(icon2);
        
        JLabel image = new JLabel(icon);
        
        add(image);
        
        
        
        setSize(850,750);
        setLocation(300,20);
        setVisible(true);
        setTitle("Transactions");
    }
    
    public static void main(String args[]) {
        new Transactions();
    }
}
