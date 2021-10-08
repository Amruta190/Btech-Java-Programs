import javax.swing.*;
import java.awt.event.*;
public class simple_calci extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;
    simple_calci()
    {
        l1=new JLabel("Ist number : ");
        l1.setBounds(50, 50, 150, 25);
        l2=new JLabel("IInd number : ");
        l2.setBounds(50, 100, 150, 25);
        l3=new JLabel("Result : ");
        l3.setBounds(50, 150, 150, 25);
        t1=new JTextField();
        t1.setBounds(220, 50, 150, 25);
        t2=new JTextField();
        t2.setBounds(220, 100, 150, 25);
        t3=new JTextField();
        t3.setBounds(220, 150, 150, 25);
        t3.setEditable(false);
        b1=new JButton("+");
        b1.setBounds(50, 200, 50, 50);
        b2=new JButton("-");
        b2.setBounds(125, 200, 50, 50);
        b3=new JButton("*");
        b3.setBounds(200, 200, 50, 50);
        b4=new JButton("/");
        b4.setBounds(275, 200, 50, 50);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setLayout(null);
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int ans=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
            t3.setText(Integer.toString(ans));
        }
        if(e.getSource()==b2)
        {
            int ans=Integer.parseInt(t1.getText())-Integer.parseInt(t2.getText());
            t3.setText(Integer.toString(ans));
        }
        if(e.getSource()==b3)
        {
            int ans=Integer.parseInt(t1.getText())*Integer.parseInt(t2.getText());
            t3.setText(Integer.toString(ans));
        }
        if(e.getSource()==b4)
        {
            int ans=Integer.parseInt(t1.getText())/Integer.parseInt(t2.getText());
            t3.setText(Integer.toString(ans));
        }
    }
    public static void main(String[] args)
    {
        new simple_calci();
    }
}
