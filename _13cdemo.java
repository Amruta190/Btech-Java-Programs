import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
public class _13cdemo extends JFrame implements ActionListener,ItemListener
{
	JButton jb1,jb2,jb3;
	JTextField jt;
	JComboBox jc;
	JTable jtab;
	JScrollPane js;
	JDialog jd;
	JLabel jl;
	String disp="";
	HashSet hs;
	JTextArea jres;
	static JFrame frame;
	public _13cdemo(String msg)
	{
		super(msg);
		setLayout(new FlowLayout());
		hs=new HashSet();
		jt = new JTextField(30);
		jb1 = new JButton("Browse");
		jb2 = new JButton("Upload");
		jc=new JComboBox();
		jb3 = new JButton("Submit");
		add(jt);
		jb1.addActionListener(this);
		add(jb1);
		jb2.addActionListener(this);
		add(jb2);
		jc.addItemListener(this);
		add(jc);
		jb3.addActionListener(this);
		add(jb3);
		jres=new JTextArea(10,50);
		add(jres);
		addWindowListener(new WindowAdapter()
				 {
					public void windowClosing(WindowEvent we)
					{
						System.exit(0);
					}
				 });
	}
	public void itemStateChanged(ItemEvent ie)
	{
		jres.setText("");
	}
	public void actionPerformed(ActionEvent ae)
	{
		String path="";
		if(ae.getSource()==jb1)
		{
			JFileChooser fch = new JFileChooser();
			int retval = fch.showOpenDialog(frame);
			if(retval==JFileChooser.APPROVE_OPTION)
			{
				String file = fch.getSelectedFile().getAbsolutePath();
				jt.setText(file);
			}
		}
		if(ae.getSource()==jb2)
		{
			String file = jt.getText();
			if(file.equals(""))
			{
				jd = new JDialog(frame,"Week13c");
				jl = new JLabel("Select a valid file");
				jd.add(jl);
				jd.setSize(100,100);
				jd.setVisible(true);
			}
			else
			{
				path = jt.getText().replace("\\","\\\\");
				try{
					//System.out.println(path);
					FileReader fr = new FileReader(path);
					BufferedReader br = new BufferedReader(fr);
					String temp=null;
					while((temp=br.readLine())!=null)
					{
						String row[] = temp.split(",");
						hs.add(row[2]);
					}
					fr.close();
					br.close();
					Iterator it = hs.iterator();
					while(it.hasNext())
					{
						jc.addItem(String.valueOf(it.next()));
					}	
				}catch(Exception e)
				{
					jd = new JDialog(frame,"Exception");
					jl = new JLabel("Some thing went wrong");
					jd.add(jl);	
					jd.setSize(100,100);
					jd.setVisible(true);	
				}
			}
		}
		if(ae.getSource()==jb3)
		{
			String query = String.valueOf(jc.getSelectedItem());
			System.out.println("query:"+query);
			path = jt.getText().replace("\\","\\\\");
			try{
					FileReader fr = new FileReader(path);
					BufferedReader br = new BufferedReader(fr);
					String temp=null;
					while((temp=br.readLine())!=null)
					{
						String row[] = temp.split(",");
						if(query.equals(row[2]))
						{
							temp = temp.replace(",","  ");
							jres.setText(jres.getText()+"\n"+temp);
						}
					}
					fr.close();
					br.close();	
				}catch(Exception e)
				{
					disp=e.getMessage();
					jres.setText(disp);	
				}		
		}
	}
	public static void main(String args[])
	{
		frame = new _13cdemo("Week13c");
		frame.setSize(500,500);
		frame.setVisible(true);
	}
}