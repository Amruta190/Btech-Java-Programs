import java.util.Scanner;
public class perfect_no_or_not {
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1)
            System.out.println("Invalid input");
        else
        {
            int sum=0;
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                    sum+=i;
            }
            if(sum==n)
                System.out.println(n+" is a perfect number");
            else
                System.out.println(n+" is not a perfect number");
        }
        sc.close();
    }
}
