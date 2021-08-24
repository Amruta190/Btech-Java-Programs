import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class _14a extends JFrame implements ActionListener
{
    JLabel l,l1,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    JTextField t1,t2,t3,t4,t5;
    JPasswordField p1,p2;
    ImageIcon eye,eye2;
    JButton b,image1,image2,image3,image4;
    JRadioButton r1,r2;
    JComboBox c1,c2,c3;
    JTextArea a;
    _14a()
    {
        l=new JLabel("<html><font color=black size=4>Registration Form</font></html>");
        l.setBounds(120, 20, 150, 25);;
        l1=new JLabel("<html><font color=black>Username</font> <font color=red>*</font></html>");
        l1.setBounds(20, 60, 100, 25);
        t1=new JTextField();
        t1.setBounds(150, 60, 150, 25);
        l3=new JLabel("<html><font color=black>First Name</font> <font color=red>*</font></html>");
        l3.setBounds(20, 95, 150, 25);
        t2=new JTextField();
        t2.setBounds(150, 95, 150, 25);
        l4=new JLabel("<html><font color=black>Last Name</font> <font color=red>*</font></html>");
        l4.setBounds(20, 130, 150, 25);
        t3=new JTextField();
        t3.setBounds(150, 130, 150, 25);
        l5=new JLabel("<html><font color=black>Password</font> <font color=red>*</font></html>");
        l5.setBounds(20, 400, 150, 25);
        l6=new JLabel("<html><font color=black>Confirm Password</font> <font color=red>*</font></html>");
        l6.setBounds(20, 435, 150, 25);
        p1=new JPasswordField();
        p1.setBounds(150, 400, 150, 25);
        p2=new JPasswordField();
        p2.setBounds(150, 435, 150, 25);
        eye=new ImageIcon("iconmonstr-eye-9.png");
        eye2=new ImageIcon("eye-icon-2.png");
        image1=new JButton(eye);
        image2=new JButton(eye2);
        image1.setBounds(310, 400, 20, 20);
        image2.setBounds(330, 400, 20, 20);
        image3=new JButton(eye);
        image4=new JButton(eye2);
        image3.setBounds(310, 435, 20, 20);
        image4.setBounds(330, 435, 20, 20);
        l7=new JLabel("Gender");
        l7.setBounds(20, 170, 150, 25);
        add(l);
        add(l1);
        add(t1);
        add(l3);
        add(t2);
        add(l4);
        add(t3);
        add(l7);
        r1=new JRadioButton("Male");
        r1.setBounds(150, 170, 100, 30);
        r2=new JRadioButton("Female");
        r2.setBounds(250, 170, 100, 30);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        l8=new JLabel("Phone No");
        l8.setBounds(20, 245, 150, 25);
        t4=new JTextField();
        t4.setBounds(150, 245, 150, 25);
        l9=new JLabel("<html><font color=black>Email</font> <font color=red>*</font></html>");
        l9.setBounds(20, 365, 150, 25);
        t5=new JTextField();
        t5.setBounds(150, 365, 150, 25);
        l10=new JLabel("Address");
        l10.setBounds(20, 280, 150, 25);
        a=new JTextArea();
        a.setBounds(150, 280, 150, 70);
        l11=new JLabel("<html><font color=black>DOB</font> <font color=red>*</font></html>");
        l11.setBounds(20, 210, 150, 25);
        String dates[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        String months[] = { "Jan", "feb", "Mar", "Apr", "May", "Jun", "July", "Aug", "Sup", "Oct", "Nov", "Dec" };
        String years[] = { "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" };
        c1=new JComboBox(dates);
        c2=new JComboBox(months);
        c3=new JComboBox(years);
        c1.setBounds(150, 210, 50, 25);
        c2.setBounds(210, 210, 50, 25);
        c3.setBounds(270, 210, 50, 25);
        add(r1);
        add(r2);
        add(l11);
        add(c1);
        add(c2);
        add(c3);
        add(l8);
        add(t4);
        add(l10);
        add(a);
        add(l9);
        add(t5);
        add(l5);
        add(p1);
        add(image1);
        add(image2);
        add(l6);
        add(p2);
        add(image3);
        add(image4);
        b=new JButton("Register");
        b.setBounds(120, 500, 100, 50);
        b.addActionListener(this);
        image1.addActionListener(this);
        image2.addActionListener(this);
        image3.addActionListener(this);
        image4.addActionListener(this);
        add(b);
        setSize(400, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Registration Form");
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b)
        {
            String st=new String(p1.getPassword());
            String str=new String(p2.getPassword());
            if(t1.getText().length()==0)
                JOptionPane.showMessageDialog(this,"<html><font color=red>*Required </font><font color=black>field UserName need to be filled</font><font color=red> !</font></html>");
            if(t2.getText().length()==0)
                JOptionPane.showMessageDialog(this,"<html><font color=red>*Required </font><font color=black>field First Name need to be filled</font><font color=red> !</font></html>");
            if(t3.getText().length()==0)
                JOptionPane.showMessageDialog(this,"<html><font color=red>*Required </font><font color=black>field Last Name need to be filled</font><font color=red> !</font></html>");
            if(t5.getText().length()==0)
                JOptionPane.showMessageDialog(this,"<html><font color=red>*Required </font><font color=black>field Email need to be filled</font><font color=red> !</font></html>");
            if(p1.getPassword().length==0)
                JOptionPane.showMessageDialog(this,"<html><font color=red>*Required </font><font color=black>field Password need to be filled</font><font color=red> !</font></html>");
            if(p2.getPassword().length==0)
                JOptionPane.showMessageDialog(this,"<html><font color=red>*Required </font><font color=black>field Confirm Password need to be filled</font><font color=red> !</font></html>");
            else if(p1.getPassword().length<8)
                JOptionPane.showMessageDialog(this,"<html><font color=black>Password should have minimum of 8 characters</font> <font color=red> !</font></html>");
            else if(!st.equals(str))
                JOptionPane.showMessageDialog(this, "<html><font color=black>Password and confirm password are not same</font> <font color=red> !</font></html>");
            else
            {
                JOptionPane.showMessageDialog(this,"Registration successful");
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");
                t5.setText("");
                p1.setText("");
                p2.setText("");
                a.setText("");
                c1.setSelectedItem(0);
                c2.setSelectedIndex(0);
                c3.setSelectedIndex(0);
            }
        }
        if(e.getSource()==image1)
            p1.setEchoChar((char)0);
        if(e.getSource()==image2)
            p1.setEchoChar('*');
        if(e.getSource()==image3)
            p2.setEchoChar((char)0);
        if(e.getSource()==image4)
            p2.setEchoChar('*');
    }
    public static void main(String args[])
    {
        new _14a();
    }   
}