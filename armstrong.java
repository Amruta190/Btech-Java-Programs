import java.util.Scanner;
import java.lang.Math;
public class armstrong {
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
            System.out.println("Invalid input");
        else
        {
            int x=n,sum=0;
            int len=String.valueOf(n).length();
            while(n>0)
            {
                int r=n%10;
                sum+=Math.pow(r,len);
                n/=10;
            }
            if(x==sum)
                System.out.println(x+" is an Armstrong number");
            else
                System.out.println(x+" is not an Armstrong number");
        }
        sc.close();
    }
}
