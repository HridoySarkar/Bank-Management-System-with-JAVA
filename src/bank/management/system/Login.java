package bank.management.system;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Hridoy
 */
public class Login extends JFrame{
    Login(){
        setTitle("Automated Teller Machine");
        setLayout(null);
        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image icon = icon1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon iconScale = new ImageIcon(icon);
        JLabel iconLable  = new JLabel(iconScale);
        iconLable.setBounds(150,20,50,50);
        add(iconLable);
        
        //welcome text
        JLabel textWelcome = new JLabel("Welcome To ATM");
        textWelcome.setFont(new Font("Osward", Font.BOLD,38));
        textWelcome.setBounds(220,25,550,40);
        add(textWelcome);
        
        //cardID text
        JLabel textcardID = new JLabel("CardID:");
        textcardID.setFont(new Font("Raleway", Font.BOLD,18));
        textcardID.setBounds(150,150,550,40);
        add(textcardID);
        
        JTextField cardIDTextField = new JTextField();
        cardIDTextField.setBounds(300,150,200,40);
        add(cardIDTextField);
        
        //Password text
        JLabel textPin = new JLabel("PIN:");
        textPin.setFont(new Font("Raleway", Font.BOLD,18));
        textPin.setBounds(150,200,550,40);
        add(textPin);
        
        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(300,200,200,40);
        add(pinTextField);
        
        
        //for the background color
        getContentPane().setBackground(Color.white);
        
        
        
        setSize(800,500);
        setVisible(true);
        setLocation(350,250);
        
    }
    public static void main(String args[]){
           new Login();
    }
    
}
