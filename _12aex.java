/*<applet code="_12aex" width=1000 height=150></applet>*/
import java.applet.*;
import java.awt.*;
import java.awt.Graphics.*;
public class _12aex extends Applet
{
    public int x=50,i=1;
    public void init()
    {
        setBackground(Color.cyan);
        setForeground(Color.red);
    }   
    public void update(Graphics g)
    {
        if (i==300)
            i=0;
        else if(i>150 && i<300)
        {
            i+=1;
            x-=5;
        }
        else
        {
            i+=1;
            x+=5;
        }
        g.setColor(Color.black);
        paint(g);
    }
    public void paint(Graphics g)
    {
        g.drawString("Welcome", x, 100);
        try
        {
            new Thread().sleep(50);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        g.setColor(Color.white);
        g.drawString("Welcome", x, 100);
        repaint();
    }
}
