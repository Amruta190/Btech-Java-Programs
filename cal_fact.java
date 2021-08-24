import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class cal_fact extends JApplet implements ActionListener
{

    JButton b1;
    JTextField j1;
    JLabel l1,l2;
    public void init()
    {
        b1=new JButton("Calculate");
        b1.setBounds(60, 100, 150, 20);
        j1=new JTextField();
        j1.setBounds(150, 50, 100, 20);
        l1=new JLabel("Enter a number : ");
        l1.setBounds(40, 50, 100, 20);
        l2=new JLabel();
        l2.setBounds(40, 150, 100, 20);
        add(l1);
        add(j1);
        add(b1);
        add(l2);
        setLayout(null);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            int n=Integer.parseInt(j1.getText());
            int fact=1;
            while(n>0)
            {
                fact*=n;
                n--;
            }
            l2.setText("Result : "+fact);
            // j2.setLabel(fact);
        }
    }
}