import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class mousedemo extends JFrame implements MouseListener,MouseMotionListener
{
	String msg1="",msg2="",msg3="";
	int x1=0,y1=0,x2=0,y2=0;
	JLabel jl1,jl2,jl3;
	public mousedemo(String msg)
	{
		super(msg);
		jl1=new JLabel();
		jl2=new JLabel();
		jl3=new JLabel();
		setLayout(new GridLayout(3,1));
		add(jl1);
		add(jl2);
		add(jl3);
		addMouseListener(this);
		addMouseMotionListener(this);
		addWindowListener(new WindowAdapter()
				 {
					public void windowClosing(WindowEvent we)
					{
						System.exit(0);
					}
				 });
	}
	public void mouseClicked(MouseEvent me)
	{
		msg1="Mouse Clicked";
		jl1.setText(msg1);
	}
	public void mouseEntered(MouseEvent me)
	{
		int x=me.getX();
		int y=me.getY();
		msg2="Mouse Entered at ("+x+","+y+")";
		jl2.setText(msg2);
	}
	public void mouseExited(MouseEvent me)
	{
		msg2="Mouse Exited";
		jl2.setText(msg2);
	}
	public void mousePressed(MouseEvent me)
	{
		x1=me.getX();
		y1=me.getY();
		msg2="Mouse Pressed at ("+x1+","+y1+")";
		jl2.setText(msg2);
	}
	public void mouseReleased(MouseEvent me)
	{
		x2=me.getX();
		y2=me.getY();
		msg2="Mouse Released at ("+x2+","+y2+")";
		jl2.setText(msg2);
	}
	public void mouseDragged(MouseEvent me)
	{
		x1=me.getX();
		y1=me.getY();
		msg3="Mouse Dragged at ("+x1+","+y1+")";
		jl3.setText(msg3);
	}	
	public void mouseMoved(MouseEvent me)
	{
		x1=me.getX();
		y1=me.getY();
		msg3="Mouse Moved at ("+x1+","+y1+")";
		jl3.setText(msg3);
	}	
	public static void main(String args[])
	{
		JFrame f = new mousedemo("Mouse Demo");
		f.setSize(500,500);
		f.setVisible(true);
	}
}