import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* applet code=buttondemo height=300 width=400>
</applet>
*/
public class buttondemo extends Applet implements ActionListener
{
public void init()
{
Button b1=new Button("red");
Button b2=new Button("green");
Button b3=new Button("blue");
add(b1);
add(b2);
add(b3);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
String s=ae.getActionCommand();
if(s.equals("red"))
setBackground(Color.red);
if(s.equals("green"))
setBackground(Color.green);
if(s.equals("blue"))
setBackground(Color.blue);
}
}