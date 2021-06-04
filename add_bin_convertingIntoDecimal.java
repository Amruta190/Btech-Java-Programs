import java.util.Scanner;
import java.lang.Math;
public class add_bin_convertingIntoDecimal {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two binary numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        double a1=decimal(a);
        double b1=decimal(b);
        int k=(int)(a1+b1);
        String c=bin(k);
        System.out.println("The sum is : "+Integer.parseInt(c));
    }
    static double decimal(int a)
    {
        double i,sum=0,b;
        int count=String.valueOf(a).length();
        for(i=0;i<count;i++)
        {
            b=a%10;
            sum=sum+b*Math.pow(2,i);
            a=a/10;
        }
        return sum;
    }
    static String bin(int c)
    {
        String sum="0";
        while(c>0)
        {
            int r=c%2;
            sum=sum + Integer.toString(r);
            c=c/2;
        }
        int n=sum.length(),i;
        String s="0";
        for(i=n-1;i>0;i--)
            s=s+sum.charAt(i);
        return s;
    }
}