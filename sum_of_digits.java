import java.util.Scanner;
public class sum_of_digits {
    public static void main(String args[])
    {
        System.out.println("Enter number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n,sum=0;
        while(n>0)
        {
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println("The sum of digits of "+x+" is "+sum);
        sc.close();
    }
}
