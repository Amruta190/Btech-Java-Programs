import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class _14b extends JFrame implements ChangeListener
{
    JLabel l1,l2,l3;
    JPanel p;
    JSlider s1,s2,s3;
    _14b()
    {
        p=new JPanel();
        l1=new JLabel("RED");
        l1.setBounds(50, 100, 50, 50);
        l2=new JLabel("GREEN");
        l2.setBounds(50, 200, 50, 50);
        l3=new JLabel("BLUE");
        l3.setBounds(50, 300, 50, 50);
        s1=new JSlider(0,255);
        s2=new JSlider(0,255);
        s3=new JSlider(0,255);
        s1.setMajorTickSpacing(50);
        s2.setMajorTickSpacing(50);
        s3.setMajorTickSpacing(50);
        s1.setPaintTicks(true);
        s1.setPaintLabels(true);
        s1.setBounds(100,100,300,50);
        s2.setPaintTicks(true);
        s2.setPaintLabels(true);
        s2.setBounds(100, 200, 300, 50);
        s3.setPaintTicks(true);
        s3.setPaintLabels(true);
        s3.setBounds(100, 300, 300, 50);
        p.add(l1);
        p.add(s1);
        p.add(l2);
        p.add(s2);
        p.add(l3);
        p.add(s3);
        add(p);
        s1.addChangeListener(this);
        s2.addChangeListener(this);
        s3.addChangeListener(this);
        p.setSize(550, 500);
        p.setLayout(null);
        setSize(550, 500);
        setVisible(true);
        setTitle("Colors");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void stateChanged(ChangeEvent e)
    {
        Color c=new Color(s1.getValue(),s2.getValue(),s3.getValue());
        p.setBackground(c);
    }
    public static void main(String args[])
    {
        new _14b();
    }
}
