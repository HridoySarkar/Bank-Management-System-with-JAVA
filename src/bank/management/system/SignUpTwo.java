package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Hridoy
 */
public class SignUpTwo extends JFrame implements ActionListener{
    JTextField nidNumberTextField;
    JButton next;
    JRadioButton citizenYes,citizenNo,exYes,exNo;
    JComboBox religionData,categoryData,occupationData,incomeData,educationalData;
    String formNo;
    
    SignUpTwo(String formNo){
        this.formNo = formNo;
        setLayout(null);
        
        
        JLabel additinalDetails = new JLabel("Page 2: Additinal Details");
        additinalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additinalDetails.setBounds(290,70,400,40);
        add(additinalDetails);
        
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100,140,200,30);
        add(religion);
        
        
        String valReligion [] = {"Muslim","Hindo","Buddha","Christian","Other"};
        religionData = new JComboBox(valReligion);
        religionData.setBackground(Color.white);
        religionData.setFont(new Font("Raleway",Font.PLAIN, 16));
        religionData.setBounds(300,140,400,30);
        add(religionData);
        
       
        JLabel categorys = new JLabel("Categorys:");
        categorys.setFont(new Font("Raleway", Font.BOLD, 20));
        categorys.setBounds(100,190,400,30);
        add(categorys);
        
        String valCategory[]={"General","FDR","Savings","CDA","School Savers Account","ESA","Foreign"};
        categoryData = new JComboBox(valCategory);
        categoryData.setFont(new Font("Raleway", Font.PLAIN, 16));
        categoryData.setBackground(Color.white);
        categoryData.setBounds(300,190,400,30);
        add(categoryData);
        
        
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100,240,400,30);
        add(income);
        
        
        String valIncome[] = {"Null","< 50,000 TK","< 1,00,000 TK","< 5,00,000 TK","< 10,00,000 TK","< 50,00,000 TK","< 1,00,00,000 TK"};
        incomeData = new JComboBox(valIncome);
        incomeData.setBackground(Color.white);
        incomeData.setFont(new Font("Raleway", Font.PLAIN, 16));
        incomeData.setBounds(300,240,400,30);
        add(incomeData);
        
        
        JLabel educational = new JLabel("Education");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100,290,400,30);
        add(educational);
        
        String valEducational[] = {"Non-Graduation","Graduation","Post-Graduation","Others"};
        educationalData = new JComboBox(valEducational);
        educationalData.setBackground(Color.white);
        educationalData.setFont(new Font("Raleway", Font.PLAIN, 16));
        educationalData.setBounds(300,290,400,30);
        add(educationalData);
        
        
        
        
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100,390,400,30);
        add(occupation);
        
        
        String valOccupation[] = {"Student","Salaried","Self-Employed","Business","Retired","Others"};
        occupationData = new JComboBox(valOccupation);
        occupationData.setBackground(Color.white);
        occupationData.setFont(new Font("Raleway", Font.PLAIN, 16));
        occupationData.setBounds(300,390,400,30);
        add(occupationData);
        
        
        
        
        JLabel nidNumber = new JLabel("NID Number:");
        nidNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        nidNumber.setBounds(100,440,400,30);
        add(nidNumber);
        
        nidNumberTextField = new JTextField();
        nidNumberTextField.setFont(new Font("Raleway", Font.BOLD, 18));
        nidNumberTextField.setBounds(300,440,400,30);
        add(nidNumberTextField);
        
        
        
        JLabel citizen = new JLabel("Senior Citizen:");
        citizen.setFont(new Font("Raleway", Font.BOLD, 20));
        citizen.setBounds(100,490,400,30);
        add(citizen);
        
        
        citizenYes = new JRadioButton("Yes");
        citizenYes.setFont(new Font("Raleway", Font.BOLD, 18));
        citizenYes.setBackground(Color.white);
        citizenYes.setBounds(300,490,80,30);
        add(citizenYes);
        
        citizenNo = new JRadioButton("No");
        citizenNo.setFont(new Font("Raleway", Font.BOLD, 18));
        citizenNo.setBackground(Color.white);
        citizenNo.setBounds(500,490,80,30);
        add(citizenNo);
        
        ButtonGroup citixenGroup = new ButtonGroup();
        citixenGroup.add(citizenYes);
        citixenGroup.add(citizenNo);
        
        
        
        JLabel exAccount = new JLabel("Existing Account:");
        exAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        exAccount.setBounds(100,540,400,30);
        add(exAccount);
        
        
        exYes = new JRadioButton("Yes");
        exYes.setFont(new Font("Raleway", Font.BOLD, 18));
        exYes.setBackground(Color.white);
        exYes.setBounds(300,540,80,30);
        add(exYes);
        
        exNo = new JRadioButton("No");
        exNo.setFont(new Font("Raleway", Font.BOLD, 18));
        exNo.setBackground(Color.white);
        exNo.setBounds(500,540,80,30);
        add(exNo);
        
        ButtonGroup exsitAccount = new ButtonGroup();
        exsitAccount.add(exYes);
        exsitAccount.add(exNo);
        
        
        
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
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        setSize(850,800);
        setVisible(true);
        setLocation(350,100);
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
        String NID = nidNumberTextField.getText();
        String religion = religionData.getSelectedItem().toString();
        String category = categoryData.getSelectedItem().toString();
        String occupation = occupationData.getSelectedItem().toString();
        String income = incomeData.getSelectedItem().toString();
        String education = educationalData.getSelectedItem().toString();
        String citizen = null;
        if(citizenYes.isSelected()){
            citizen = "Yes";
        }else if(citizenNo.isSelected()){
            citizen = "No";
        }
        
        String existingAccount = null;
        if(exYes.isSelected()){
            citizen = "Yes";
        }else if(exNo.isSelected()){
            citizen = "No";
        }
        
        
        
        //datebase
        try{
            if(NID.equals("")){
                JOptionPane.showMessageDialog(null, "NID Required");
            }else{
                Conn c = new Conn();
                String query = "INSERT INTO signuptwo values ('"+formNo+"','"+NID+"','"+religion+"','"+category+"','"+occupation+"','"+income+"','"+education+"','"+citizen+"','"+existingAccount+"')";
                c.s.executeUpdate(query);
                System.out.print("2nd Form Added");
            }
        
        }catch(Exception ea){
            System.out.print(ea);
        }
        
        
        
        
    }
    
    public static void main(String args[]) {
        new SignUpTwo("");
        
    }

}
