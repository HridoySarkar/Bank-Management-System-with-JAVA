package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

/**
 *
 * @author Hridoy
 */
public class SignUpOne extends JFrame{
    
    JPasswordField pinCodeField;
    
    SignUpOne(){
        setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000l) + 1000);
        JLabel formNo = new JLabel("APPLICATION FORM NO: "+ random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140,20,600,40);
        add(formNo);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290,70,400,40);
        add(personalDetails);
        
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,200,30);
        add(name);
        
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fName = new JLabel("Father's Name:");
        fName.setFont(new Font("Raleway", Font.BOLD, 20));
        fName.setBounds(100,190,400,30);
        add(fName);
        
        JTextField fNameTextField = new JTextField();
        fNameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        fNameTextField.setBounds(300,190,400,30);
        add(fNameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,400,30);
        add(dob);
        
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,220,30);
        dateChooser.setForeground(Color.black);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,400,30);
        add(gender);
        
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setBackground(Color.white);
        add(male);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(420,290,100,30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,400,30);
        add(email);
        
        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,400,30);
        add(marital);
        
        
        JRadioButton married = new JRadioButton("Married");
        married.setBounds(300,390,80,30);
        married.setBackground(Color.white);
        add(married);
        JRadioButton single = new JRadioButton("Single");
        single.setBounds(400,390,80,30);
        single.setBackground(Color.white);
        add(single);
        JRadioButton other = new JRadioButton("Other");
        other.setBounds(500,390,80,30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(single);
        maritalGroup.add(other);
        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,400,30);
        add(address);
        
        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,400,30);
        add(city);
        
        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,400,30);
        add(state);
        
        JTextField stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100,590,400,30);
        add(pinCode);
        
        pinCodeField = new JPasswordField();
        pinCodeField.setFont(new Font("Raleway", Font.BOLD, 18));
        pinCodeField.setBounds(300,590,400,30);
        add(pinCodeField);
        
        
        //Next Button
        JButton next = new JButton("NEXT");
        next.setBounds(600,650,100,40);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Ralwaye",Font.PLAIN,18));
        add(next);
        
    //for the background color
        getContentPane().setBackground(Color.white);
        setTitle("SIGN UP FORM");
        setSize(850,800);
        setVisible(true);
        setLocation(350,100);
    
    
    }
    
    public static void main(String args[]) {
        new SignUpOne();
    }
}
