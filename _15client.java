import java.io.*;
import java.net.*;
import java.util.Scanner;
public class _15client 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            Socket s=new Socket("localhost",8000);
            DataOutputStream ds=new DataOutputStream(s.getOutputStream());
            System.out.println("Enter radius : ");
            int r=sc.nextInt();
            ds.writeUTF(Integer.toString(r));
            DataInputStream is=new DataInputStream(s.getInputStream());
            String st=is.readUTF();
            System.out.println("Area of circle = "+st);
            ds.flush();
            ds.close();
            s.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        sc.close();
    }
}
