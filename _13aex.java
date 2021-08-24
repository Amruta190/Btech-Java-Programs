/*<applet code="_13aex.class" width="500" height="500"></applet>*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class _13aex extends JApplet implements ActionListener, MouseMotionListener
{
    JRadioButton r1,r2,r3;
    int flag,x,y;
    JLabel l1;
    public void init()
    {
        l1=new JLabel();
        add(l1);
        r1=new JRadioButton("Line");
        r1.setBounds(50, 20, 100, 25);
        r2=new JRadioButton("Rectangle");
        r2.setBounds(180, 20, 100, 25);
        r3=new JRadioButton("Oval");
        r3.setBounds(310, 20, 100, 25);
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        addMouseMotionListener(this);
        add(r1);
        add(r2);
        add(r3);
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
    }    
    public void paint(Graphics g)
    {
        if(flag==1)
            g.drawLine(x,y,100,100);
        if(flag==2)
            g.drawRect(x,y,50,25);
        if(flag==3)
            g.drawOval(x, y, 20, 30);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(r1.isSelected())
            flag=1;
        if(r2.isSelected())
            flag=2;
        if(r3.isSelected())
            flag=3;
        repaint();
    }
    public void mouseMoved(MouseEvent e)
    {
        x=e.getX();
        y=e.getY();
    }
    public void mouseDragged(MouseEvent e)
    {
        repaint();
    }
}
