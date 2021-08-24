import java.io.*;
import java.net.*;
public class _15server 
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss=new ServerSocket(8000);
            Socket s=ss.accept();
            DataInputStream ds=new DataInputStream(s.getInputStream());
            String str=(String)ds.readUTF();
            int r=Integer.parseInt(str);
            double area=3.14*r*r;
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF(Double.toString(area));
            ss.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }   
}