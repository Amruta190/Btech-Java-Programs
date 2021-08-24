import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class traffic_lights extends JApplet implements ActionListener
{
    int choice;
    JRadioButton b1,b2,b3;
    JButton b;
    public void init()
    {
        b1=new JRadioButton("Red");
        b1.setBounds(50, 50, 75, 50);
        b2=new JRadioButton("Yellow");
        b2.setBounds(50, 120, 75, 50);
        b3=new JRadioButton("Green");
        b3.setBounds(50, 190, 75, 50);
        ButtonGroup bg=new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
        // b=new JButton("Ok");
        // b.setBounds(100, 300, 50, 50);
        // b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        add(b1);
        add(b2);
        add(b3);
        // add(b);
        setSize(300, 400);
        setLayout(null);
        setVisible(true);
    } 
    public void paint(Graphics g)
    {
        g.drawOval(150, 50, 50, 50);
        g.drawOval(150, 120, 50, 50);
        g.drawOval(150, 190, 50, 50);
        switch(choice)
        {
            case 1 : g.setColor(Color.red);
                     g.fillOval(151, 51, 49, 49);
                     g.setColor(Color.white);
                     g.fillOval(151, 121, 49, 49);
                     g.fillOval(151, 191, 49, 49);
                     break;
            case 2 : g.setColor(Color.yellow);
                     g.fillOval(151, 121, 49, 49);
                     g.setColor(Color.white);
                     g.fillOval(151, 51, 49, 49);
                     g.fillOval(151, 191, 49, 49);
                     break;
            case 3 : g.setColor(Color.green);
                     g.fillOval(151, 191, 49, 49);
                     g.setColor(Color.white);
                     g.fillOval(151, 51, 49, 49);
                     g.fillOval(151, 121, 49, 49);  
                     break;
        }
    }  
    public void actionPerformed(ActionEvent e)
    {
        if(b1.isSelected())
            choice=1;
        else if(b2.isSelected())
            choice=2;
        else if(b3.isSelected())
            choice=3;
        repaint();
    } 
}