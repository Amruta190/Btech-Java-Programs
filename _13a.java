import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class _13a extends JApplet implements ActionListener,MouseMotionListener
{
	ButtonGroup radio;
	JRadioButton jr1,jr2,jr3;
	JLabel jl;
	String msg="";
	int x,y,x1,y1;
	int flag=-1;
	public void init()
	{
		radio = new ButtonGroup();
		jr1 = new JRadioButton("Line");
		jr2 = new JRadioButton("Rectangle");
		jr3 = new JRadioButton("Oval");
		radio.add(jr1);
		radio.add(jr2);
		radio.add(jr3);
		jr1.addActionListener(this);
		jr2.addActionListener(this);
		jr3.addActionListener(this);
		add(jr1);
		add(jr2);
		add(jr3);
		jl=new JLabel();
		add(jl);
        setLayout(new FlowLayout());
        setVisible(true);
		// addMouseListener(this);
		// new MouseAdapter()
				//  {
					// public void mouseClicked(MouseEvent me)
					// {
					// 	x = me.getX();
					// 	y = me.getY();
					// }
				//  });
		addMouseMotionListener(this);
			// new MouseAdapter()
				//  {
					// public void mouseMoved(MouseEvent me)
					// {
					// 	x1 = me.getX();
					// 	y1 = me.getY();
					// 	msg="Mouse currently at: ("+x1+","+y1+")";
					// 	jl.setText(msg);
					// }
				//  });

	}
	public void mouseClicked(MouseEvent me)
					{
						x = me.getX();
						y = me.getY();
					}
	public void mouseMoved(MouseEvent me)
					{
						x1 = me.getX();
						y1 = me.getY();
						msg="Mouse currently at: ("+x1+","+y1+")";
						jl.setText(msg);
					}
	public void mouseDragged(MouseEvent e)
	{

	}
	public void actionPerformed(ActionEvent ie)
	{	
		// if(ie.getSource()==jr1)
        if(jr1.isSelected())
		{
			flag=0;
			repaint();			
		}
		// if(ie.getSource()==jr2)
        if(jr2.isSelected())
		{
			flag=1;
			repaint();			
		}
		// if(ie.getSource()==jr3)
        if(jr3.isSelected())
		{
			flag=2;
			repaint();			
		}
	}
	public void paint(Graphics g)
	{
		if(flag==0)
			g.drawLine(x,y,150,150);
		if(flag==1)
			g.drawRect(x,y,50,100);
		if(flag==2)
			g.drawOval(x,y,150,200);
	}
}