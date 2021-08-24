import javax.swing.*;
import java.awt.event.*;
public class swingComponents extends JFrame implements ActionListener{
    JLabel l,l1,l2;
    JTextField t;
    JPasswordField p;
    JCheckBox c;
    JButton b;
    swingComponents()
    {
        l=new JLabel("Sign Up");
        l.setBounds(100, 20, 50, 50);
        l1=new JLabel("UserName : ");
        l1.setBounds(20, 80, 150, 50);
        t=new JTextField();
        t.setBounds(100, 80, 150, 50);
        l2=new JLabel("PassWord : ");
        l2.setBounds(20, 140, 150, 50);
        p=new JPasswordField();
        p.setBounds(100, 140, 150, 50);
        c=new JCheckBox("Yes, I want to Sign Up");
        c.setBounds(40, 200, 150, 50);
        add(l);
        add(l1);
        add(t);
        add(l2);
        add(p);
        b=new JButton("Submit");
        b.setBounds(100, 270, 100, 30);
        b.setEnabled(false);
        c.addActionListener(this);
        b.addActionListener(this);
        add(c);
        add(b);
        setSize(350, 400);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        if(!c.isSelected())
        {
            b.setEnabled(false);
        }
        if(c.isSelected())
        {
            b.setEnabled(true);
        }
        if(e.getSource()==b)
        {
            if(t.getText().length()==0 && p.getPassword().length==0)
                JOptionPane.showMessageDialog(this,"Please fill the UserName and Password fields");
            else if(t.getText().length()==0)
                JOptionPane.showMessageDialog(this,"Please fill the UserName field");
            else if(p.getPassword().length==0)
                JOptionPane.showMessageDialog(this,"Please fill the password field");
            else if(p.getPassword().length<8)
                JOptionPane.showMessageDialog(this,"Password should contain minimum 8 characters");
            else
            {
                JOptionPane.showMessageDialog(this,"Signed Up Successfully");
                t.setText("");
                p.setText("");
                c.setSelected(false);
                b.setEnabled(false);
            }
        }
    }
    public static void main(String[] args) {
        new swingComponents();
    }
}
