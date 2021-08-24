/*<applet code="_12a.class" width="300" height="300"></applet>*/
import javax.swing.*;
import java.awt.*;
import java.applet.*;
public class _12a extends JApplet implements Runnable
{
	String msg="Welcome to Applets";
	int x=0,y=200;
	Thread t = null;
	public void init()
	{
		setBackground(Color.RED);
		setForeground(Color.GREEN);
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			if(x<500)
				x=x+1;				
			repaint();
			try{
				Thread.sleep(200);
			}catch(Exception e)
			{}
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}	
}