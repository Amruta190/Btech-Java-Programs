import javax.swing.*;
import java.awt.*;
public class _12bdemo extends JFrame
{
	public _12bdemo(String msg)
	{
		super(msg);
		ImageIcon ic = new ImageIcon("jsym.jpg");
		setIconImage(ic.getImage());
		setLayout(new FlowLayout());
		
		JLabel jl1 = new JLabel("Enter your Name:");
		add(jl1);
		JTextField jt = new JTextField(10);
		add(jt);
		JLabel jl2 = new JLabel("Enter your Address:");
		add(jl2);
		JTextArea jta = new JTextArea("Address goes here",10,20);
		add(jta);
		JLabel jl3 = new JLabel("Enter Password:");
		add(jl3);
		JPasswordField jpf = new JPasswordField(10);
		add(jpf);
		
		JCheckBox jch1 = new JCheckBox("Hobby1");
		add(jch1);
		JCheckBox jch2 = new JCheckBox("Hobby2");
		add(jch2);
		
		ButtonGroup radio = new ButtonGroup();
		JRadioButton jr1 = new JRadioButton("Male",true);
		JRadioButton jr2 = new JRadioButton("Female");
		radio.add(jr1);
		radio.add(jr2);
		add(jr1);
		add(jr2);
		
		JLabel jl4 = new JLabel("Enter your City:");
		add(jl4);
		String citylist[]={"Mumbai","London","New York","Sydney","Tokyo"};
		JComboBox jb = new JComboBox(citylist);
		add(jb);
		
		DefaultListModel dlm = new DefaultListModel();
		dlm.addElement("Mumbai");
		dlm.addElement("London");
		dlm.addElement("New York");
		dlm.addElement("Sydney");
		dlm.addElement("Tokyo");
		JList jls = new JList(dlm);
		add(jls);
		
		JFileChooser jfch = new JFileChooser();
		add(jfch);

		JSlider volumeslider = new JSlider();
		add(volumeslider);

		String rows[][]={{"101","Amit","670000"},
				 {"102","Jos","780000"},
				 {"103","Ram","579000"},
				 {"104","Rahim","610000"}};
		String cols[] = {"ID","NAME","SALARY"};
		JTable jtab = new JTable(rows,cols);
		JScrollPane js = new JScrollPane(jtab);
		add(js);
	}	
	public static void main(String args[])
	{
		JFrame jf = new _12bdemo("Swing Tools Demo..");
		jf.setSize(500,500);
		jf.setVisible(true);
	}
}