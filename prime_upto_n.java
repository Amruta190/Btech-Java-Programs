import java.util.Scanner;
public class prime_upto_n {
    public static void main(String args[])
    {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
            System.out.println(n+" is neither prime nor consonant");
        else if(n<1)
            System.out.println("Invalid input");
        else
        {
            System.out.println("The prime numbers are :");
            for(int i=2;i<n;i++)
            {
                int cnt=0;
                for(int j=1;j<=i;j++)
                    cnt+=(i%j==0)?1:0;
                if(cnt==2)
                    System.out.print(i+" ");
            }
        }
        sc.close();
    }
}