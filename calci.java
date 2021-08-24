import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calci extends JFrame implements ActionListener
{
    JTextField t1;
    String s1,s2,s3,s4;
    calci()
    {
        s1=s2=s3="";
        JFrame f=new JFrame();
        JPanel f1=new JPanel();
        t1=new JTextField(15);
        t1.setEditable(false);
        JButton b0=new JButton("0");
        JButton b1=new JButton();
        JButton b2=new JButton("1");
        JButton b3=new JButton("2");
        JButton b4=new JButton("3");
        JButton b5=new JButton("4");
        JButton b6=new JButton("5");
        JButton b7=new JButton("6");
        JButton b8=new JButton("7");
        JButton b9=new JButton("8");
        JButton b10=new JButton("9");
        JButton b11=new JButton("=");
        JButton b12=new JButton("+");
        JButton b13=new JButton("-");
        JButton b14=new JButton("x");
        JButton b15=new JButton("/");
        JButton b16=new JButton("C");
        JButton b17=new JButton(".");
        JButton b18=new JButton("%");
        JButton b19=new JButton();
        f1.add(t1);
        f1.add(b16);
        f1.add(b17);
        f1.add(b18);
        f1.add(b15);
        f1.add(b8);
        f1.add(b9);
        f1.add(b10);
        f1.add(b14);
        f1.add(b5);
        f1.add(b6);
        f1.add(b7);
        f1.add(b13);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b12);
        f1.add(b1);
        f1.add(b0);
        f1.add(b11);
        f1.add(b19);
        f.add(f1);
        f.setSize(230, 230);
        f.setVisible(true);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        if(s.charAt(0)>='0' && s.charAt(0)<='9' || s.equals("."))
        {
            if(s2!="")
                s3=s3+s;
            else
                s1=s1+s;
            t1.setText(s1+s2+s3);
        }
        else if(s.equals("C"))
        {
            s1=s2=s3="";
            t1.setText(s1+s2+s3);
        }
        // else if(s.equals("D"))
        // {
        //     s4=t1.getText();
        //     t1.sett
        // }
        else if(s.equals("=")) 
        {
            double val;
            if (s2.equals("+"))
                val=(Double.parseDouble(s1) + Double.parseDouble(s3));
            else if (s2.equals("-"))
                val = (Double.parseDouble(s1) - Double.parseDouble(s3));
            else if (s2.equals("/"))
                val = (Double.parseDouble(s1) / Double.parseDouble(s3));
            else if(s2.equals("x"))
                val = (Double.parseDouble(s1) * Double.parseDouble(s3));
            else
                val=(Double.parseDouble(s1)%Double.parseDouble(s3));
            t1.setText(s1 + s2 + s3 + "=" + val);
            s1 = Double.toString(val);
            s2 = s3 = "";
        }
        else {
            if (s2.equals("") || s3.equals(""))
                s2 = s;
            else
            {
                double val;
                if (s2.equals("+"))
                    val=(Double.parseDouble(s1) + Double.parseDouble(s3));
                else if (s2.equals("-"))
                    val = (Double.parseDouble(s1) - Double.parseDouble(s3));
                else if (s2.equals("/"))
                    val = (Double.parseDouble(s1) / Double.parseDouble(s3));
                else if(s2.equals("x"))
                    val = (Double.parseDouble(s1) * Double.parseDouble(s3));
                else
                    val=(Double.parseDouble(s1)%Double.parseDouble(s3));
                t1.setText(s1 + s2 + s3 + "=" + val);
                s1 = Double.toString(val);
                s2 =s;
                s3="";
            }
            t1.setText(s1+s2+s3);
        }
    }
    public static void main(String args[])
    {
        new calci();
    }
}