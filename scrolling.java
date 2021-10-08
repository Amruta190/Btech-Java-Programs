import javax.swing.*;
import java.awt.*;
public class scrolling extends JApplet implements Runnable
{
    int x;
    public void init()
    {
        Thread t1=new Thread(this);
        t1.start();
    }
    public void run()
    {
        while(true){
            x=10;
            try{
                for(;x<=150;x+=10)
                {
                    repaint();
                    Thread.sleep(250);
                }
                for(;x>=10;x-=10)
                {
                    repaint();
                    Thread.sleep(250);
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    public void paint(Graphics g)
    {
        super.paint(g);
        g.drawString("Welcome", x, 50);
    }
}
