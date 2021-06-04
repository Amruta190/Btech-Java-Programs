import java.util.Scanner;
public class pattern_7 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n<0)
            System.out.println("Invalid input");
        else
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n-i;j++)
                    System.out.print(" ");
                for(int k=n;k>n-i;k--)
                    System.out.print(k+" ");
                System.out.println();
            }
        }
        sc.close();
    }
}
