
import javax.swing.*;
import java.awt.event.*;
public class registeration_form extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t;
    JRadioButton r1,r2;
    JComboBox<String []> c1;
    JTextArea a;
    JButton b;
    registeration_form()
    {
        l1=new JLabel("Enter your name : ");
        l1.setBounds(20, 50, 200, 50);
        l2=new JLabel("Gender : ");
        l2.setBounds(20, 120, 200, 50);
        l3=new JLabel("Year of birth : ");
        l3.setBounds(20, 190, 200, 50);
        t=new JTextField();
        t.setBounds(240, 50, 150, 50);
        r1=new JRadioButton("Male");
        r1.setBounds(240, 120, 150, 50);
        r2=new JRadioButton("Female");
        r2.setBounds(400, 120, 150, 50);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        String year[]={"1995","1996","1997","1998","1999","2000","2001"};
        c1=new JComboBox(year);
        c1.setBounds(240, 190, 100, 50);
        b=new JButton("Submit");
        b.setBounds(150, 250, 150, 50);
        add(l1);
        add(t);
        add(l2);
        add(r1);
        add(r2);
        add(l3);
        add(c1);
        add(b);
        b.addActionListener(this);
        a=new JTextArea("Details\n");
        a.setBounds(300,300,200, 200);
        add(a);
        setLayout(null);
        setSize(700,700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String st,str;
        if(e.getSource()==b)
        {
            if(r1.isSelected())
                st ="Male";
            else
                st="Female";
            str="Name : "+t.getText()+"\nGender : "+st+"\nYear of Birth : "+c1.getSelectedItem();
            a.setText(str);
        }
    }
    public static void main(String[] args)
    {
        new registeration_form();
    }
}