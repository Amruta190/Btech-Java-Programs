import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class _12c extends JFrame implements MouseListener, MouseMotionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    _12c()
    {
        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();
        l4=new JLabel();
        l5=new JLabel();
        l6=new JLabel();
        l7=new JLabel();
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        addMouseListener(this);
        addMouseMotionListener(this);
        setTitle("Mouse Events");
        setLayout(new GridLayout(7,1));
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void mouseClicked(MouseEvent e)
    {
        l1.setText("Mouse is clicked");
    }
    public void mouseEntered(MouseEvent e)
    {
        int x=e.getX();
        int y=e.getY();
        l2.setText("Mouse entered at the position : x="+x+" and y="+y);
    }
    public void mouseExited(MouseEvent e)
    {
        l3.setText("Mouse exited");
    }
    public void mousePressed(MouseEvent e)
    {
        int x=e.getX();
        int y=e.getY();
        l4.setText("Mouse pressed at the position : x="+x+" and y="+y);
    }
    public void mouseReleased(MouseEvent e)
    {
        int x=e.getX();
        int y=e.getY();
        l5.setText("Mouse released at the position : x="+x+" and y="+y);
    }
    public void mouseMoved(MouseEvent e)
    {
        int x=e.getX();
        int y=e.getY();
        l6.setText("Mouse moving at the position : x="+x+" and y="+y);
    }
    public void mouseDragged(MouseEvent e)
    {
        int x=e.getX();
        int y=e.getY();
        l7.setText("Mouse dragged at the position : x="+x+" and y="+y);
    }
    public static void main(String args[])
    {
        new _12c();
    }
}