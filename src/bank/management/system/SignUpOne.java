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
public class SignUpOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTextField,fNameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinCodeField;
    JButton next;
    JRadioButton male,female,married,single,other;
    JDateChooser dateChooser;
    JLabel formNo;
    
    SignUpOne(){
        setLayout(null);
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000l) + 1000);
        formNo = new JLabel("APPLICATION FORM NO: "+ random);
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
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fName = new JLabel("Father's Name:");
        fName.setFont(new Font("Raleway", Font.BOLD, 20));
        fName.setBounds(100,190,400,30);
        add(fName);
        
        fNameTextField = new JTextField();
        fNameTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        fNameTextField.setBounds(300,190,400,30);
        add(fNameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,400,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,220,30);
        dateChooser.setForeground(Color.black);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,400,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setBackground(Color.white);
        add(male);
        female = new JRadioButton("Female");
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
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,400,30);
        add(marital);
        
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,80,30);
        married.setBackground(Color.white);
        add(married);
        single = new JRadioButton("Single");
        single.setBounds(400,390,80,30);
        single.setBackground(Color.white);
        add(single);
        other = new JRadioButton("Other");
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
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,400,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,400,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100,590,400,30);
        add(pinCode);
        
        pinCodeField = new JTextField();
        pinCodeField.setFont(new Font("Raleway", Font.BOLD, 18));
        pinCodeField.setBounds(300,590,400,30);
        add(pinCodeField);
        
        
        //Next Button
        next = new JButton("NEXT");
        next.setBounds(600,650,100,40);
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        next.setFont(new Font("Ralwaye",Font.PLAIN,18));
        add(next);
        
    //for the background color
        getContentPane().setBackground(Color.white);
        setTitle("SIGN UP FORM");
        setSize(850,800);
        setVisible(true);
        setLocation(350,100);
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        String formNo = ""+random;
        String name = nameTextField.getText();
        String fname = fNameTextField.getText();
        String address = addressTextField.getText();
        String email = emailTextField.getText();
        String pin = pinCodeField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        
        if(male.isSelected()){
            gender = "male";
        }else if(female.isSelected()){
            gender = "famale";
        }
        
        String marital = null;
        
        if(married.isSelected()){
            marital = "Married";
        }else if(single.isSelected()){
            marital = "Single";
        }else if(other.isSelected()){
            marital = "Other";
        }
        
        //database
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required","Please Fill the form",2);
            }
            else if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father's Name is Required","Please Fill the form",2);
            }
            else if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is Required","Please Fill the form",2);
            }
            else if(state.equals("")){
                JOptionPane.showMessageDialog(null, "State is Required","Please Fill the form",2);
            }
            else if(city.equals("")){
                JOptionPane.showMessageDialog(null, "City is Required","Please Fill the form",2);
            }else{
                Conn c = new Conn();
                String query = "INSERT INTO signup values ('"+formNo+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                c.s.executeUpdate(query);
                System.out.print("Saved");
                setVisible(false);
                new SignUpTwo(formNo).setVisible(true);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    public static void main(String args[]) {
        new SignUpOne();
    }

}
