package bank.management.system;

import jdk.jfr.Category;

import javax.lang.model.util.AbstractElementVisitor9;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2  extends JFrame implements ActionListener {

  JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;

  JTextField textPan, textAadhar;

  JButton next;

  JRadioButton r1, r2, r3, r4;

  String formno;

  Signup2(String formno){

    super("APPLICATION FORM");

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
    Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(150,5,100,100);
    add(image);

    this.formno = formno;

    JLabel l1 = new JLabel("Page 2 :- ");
    l1.setFont(new Font("Raleway", Font.BOLD, 22));
    l1.setBounds(300,30,600,40);
    add(l1);

    JLabel l2 = new JLabel("Additional Details ");
    l2.setFont(new Font("Raleway", Font.BOLD, 22));
    l2.setBounds(300,60,600,40);
    add(l2);

    JLabel l3 = new JLabel("Religion : ");
    l3.setFont(new Font("Raleway", Font.BOLD, 18));
    l3.setBounds(100,120,100,30);
    add(l3);

    String religion[] = {" Hindu", " Muslim"," Sikh " ," Christian", " Other"};
    comboBox = new JComboBox(religion);
    comboBox.setBackground(new Color(251, 251, 251));
    comboBox.setFont(new Font("Raleway", Font.BOLD, 18));
    comboBox.setBounds(350,120,320,30);
    add(comboBox);

    JLabel l4 = new JLabel("Category : ");
    l4.setFont(new Font("Raleway", Font.BOLD, 18));
    l4.setBounds(100,170,100,30);
    add(l4);

    String category[] = {" General ", " OBC "," SC " ," ST ", " Other"};
    comboBox2 = new JComboBox(category);
    comboBox2.setBackground(new Color(251, 251, 251));
    comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
    comboBox2.setBounds(350,170,320,30);
    add(comboBox2);

    JLabel l5 = new JLabel("Income : ");
    l5.setFont(new Font("Raleway", Font.BOLD, 18));
    l5.setBounds(100,220,100,30);
    add(l5);

    String income[] = {" Null "," Null - 1 lakh ", " 1 lakh - 2 lakh "," 2 lakh - 5 lakh " ," 5 lakh - 10 lakh ", " More than 10 lakh "};
    comboBox3 = new JComboBox(income);
    comboBox3.setBackground(new Color(251, 251, 251));
    comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
    comboBox3.setBounds(350,220,320,30);
    add(comboBox3);

    JLabel l6 = new JLabel("Educational Status : ");
    l6.setFont(new Font("Raleway", Font.BOLD, 18));
    l6.setBounds(100,270,200,30);
    add(l6);

    String educational[] = {" Non-Graduate ", " Under-Graduate "," Post-Graduate "," Doctrate ", " Others "};
    comboBox4 = new JComboBox(educational);
    comboBox4.setBackground(new Color(251, 251, 251));
    comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
    comboBox4.setBounds(350,270,320,30);
    add(comboBox4);

    JLabel l7 = new JLabel("Occupation : ");
    l7.setFont(new Font("Raleway", Font.BOLD, 18));
    l7.setBounds(100,340,150,30);
    add(l7);

    String occupation[] = {" Salaried ", " Self Employed "," Business "," Student ", " Retired "," Other "};
    comboBox5 = new JComboBox(occupation);
    comboBox5.setBackground(new Color(251, 251, 251));
    comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
    comboBox5.setBounds(350,340,320,30);
    add(comboBox5);

    JLabel l8 = new JLabel("PAN NUMBER : ");
    l8.setFont(new Font("Raleway", Font.BOLD, 18));
    l8.setBounds(100,390,150,30);
    add(l8);

    textPan = new JTextField();
    textPan.setFont(new Font("Raleway", Font.BOLD, 18));
    textPan.setBounds(350,390,320,30);
    add(textPan);

    JLabel l9 = new JLabel("Aadhar Number : ");
    l9.setFont(new Font("Raleway", Font.BOLD, 18));
    l9.setBounds(100,440,320,30);
    add(l9);

    textAadhar = new JTextField();
    textAadhar.setFont(new Font("Raleway", Font.BOLD, 18));
    textAadhar.setBounds(350,440,320,30);
    add(textAadhar);

    JLabel l10 = new JLabel("Senior Citizen : ");
    l10.setFont(new Font("Raleway", Font.BOLD, 18));
    l10.setBounds(100,490,180,30);
    add(l10);

    r1 = new JRadioButton("Yes");
    r1.setFont(new Font("Raleway", Font.BOLD, 14));
    r1.setBackground(new Color(251,251,251));
    r1.setBounds(350,490,100,30);
    add(r1);

    r2 = new JRadioButton("No");
    r2.setFont(new Font("Raleway", Font.BOLD, 14));
    r2.setBackground(new Color(251,251,251));
    r2.setBounds(500,490,100,30);
    add(r2);

    ButtonGroup  buttonGroupS = new ButtonGroup();
    buttonGroupS.add(r1);
    buttonGroupS.add(r2);

    JLabel l11 = new JLabel("Existing Account : ");
    l11.setFont(new Font("Raleway", Font.BOLD, 18));
    l11.setBounds(100,530,180,30);
    add(l11);

    r3 = new JRadioButton("Yes");
    r3.setFont(new Font("Raleway", Font.BOLD, 14));
    r3.setBackground(new Color(251,251,251));
    r3.setBounds(350,530,100,30);
    add(r3);

    r4 = new JRadioButton("No");
    r4.setFont(new Font("Raleway", Font.BOLD, 14));
    r4.setBackground(new Color(251,251,251));
    r4.setBounds(500,530,100,30);
    add(r4);

    ButtonGroup  buttonGroupE = new ButtonGroup();
    buttonGroupE.add(r3);
    buttonGroupE.add(r4);

    JLabel l12 = new JLabel("Form No : ");
    l12.setFont(new Font("Raleway", Font.BOLD, 14));
    l12.setBounds(650,10,100,30);
    add(l12);

    JLabel l13 = new JLabel(formno);
    l13.setFont(new Font("Raleway", Font.BOLD, 14));
    l13.setBounds(730,10,100,30);
    add(l13);

    next = new JButton("Next");
    next.setFont(new Font("Raleway", Font.BOLD,14));
    next.setBackground(Color.BLACK);
    next.setForeground(Color.WHITE);
    next.setBounds(370,640,100,30);
    next.addActionListener(this);
    add(next);

    setLayout(null);
    setSize(850,750);
    setLocation(450,80);
    getContentPane().setBackground(new Color(251, 251, 251, 251));
    setVisible(true);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    String rel = (String) comboBox.getSelectedItem();
    String cate = (String) comboBox2.getSelectedItem();
    String inc = (String) comboBox3.getSelectedItem();
    String edu = (String) comboBox4.getSelectedItem();
    String occ = (String) comboBox5.getSelectedItem();

    String pan = textPan.getText();
    String aadhar = textAadhar.getText();

    String scitizen = " ";
    if((r1.isSelected())){
      scitizen = "Yes";
    } else if (r2.isSelected()) {
      scitizen = "No";
    }
    String eaccount = " ";
    if((r3.isSelected())){
      eaccount = "Yes";
    } else if (r4.isSelected()) {
      eaccount = "No";
    }
    try{
      if(textPan.getText().equals("") || textAadhar.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Fill all the fields");
      } else {
        Con c1 = new Con();
        String q = "Insert into signuptwo values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
        c1.statement.executeUpdate(q);
        new Signup3(formno);
        setVisible(false);
      }
    }catch (Exception E){
      E.printStackTrace();
    }

  }
  public static void main(String[] args) {
    new Signup2("");
  }
}