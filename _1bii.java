import java.util.*;
public class _1bii {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        String time[]=a.split(":");
        String hour=time[0];
        String min=time[1];
        String sec=time[2].substring(0,2);
        String caser=time[2].substring(2,4);
        int n;
        if(caser.equals("AM"))
        {
            if(hour.equals("12"))
                hour="00";  
            System.out.println(hour+":"+min+":"+sec);
        }
        else if(caser.equals("PM"))
        {
            if(!hour.equals("12"))
            {
                n=Integer.parseInt(hour)+12;
                hour=""+n;
            }
            System.out.println(hour+":"+min+":"+sec);
        }
        s.close();
    }
}