import java.util.Scanner;
public class prime_or_not {
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1)
            System.out.println(n+" is neither prime nor consonant");
        if(n<1)
            System.out.println("Invalid input");
        else
        {
            int cnt=0;
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                    cnt+=1;
            }
            if(cnt==1)
                System.out.println(n+" is Prime");
            else
                System.out.println(n+" is not Prime");
        }
        sc.close();
    }
}
