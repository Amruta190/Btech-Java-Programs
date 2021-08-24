import javax.swing.*;
public class _13b  extends JFrame
{
    _13b()
    {
        JLabel l=new JLabel("Semester Marks");
        l.setBounds(250, 100, 100, 50);
        String headings[]={"Student_id","FLAT","AA","OOPJ","OS","NM","Total_marks"};
        String data[][]={{"19131A0501","98","94","95","96","100","483"},
                        {"19131A0502","88","90","96","95","97","466"},
                        {"19131A0503","91","86","94","84","95","450"},
                        {"19131A0504","87","88","97","92","98","462"},
                        {"19131A0505","89","84","92","90","93","448"}};
        JTable t=new JTable(data,headings);
        add(l);
        JScrollPane s=new JScrollPane(t);
        add(s);
        setTitle("Marks");
        setSize(620,200);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String args[])
    {
        new _13b();
    }
}
