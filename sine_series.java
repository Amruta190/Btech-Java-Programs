import java.util.Scanner;
import java.lang.Math;
public class sine_series {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x value :");
        int x1=sc.nextInt();
        System.out.println("Enter n value :");
        int n=sc.nextInt();
        sc.close();
        if(n<0 || x1<0)
            System.out.println("Invalid input");
        else
        {
            double x=(x1*3.14)/180;
            double sum=0;
            for(int i=0;i<=n;i++)
                sum+=Math.pow(-1,i)*(Math.pow(x,2*i+1))/fact(2*i+1);
            System.out.print("sin("+x1+") = "+String.format("%.4f",sum));
        }
    }
    static int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}