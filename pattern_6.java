import java.util.Scanner;
public class pattern_6 {
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
                for(int j=1;j<=i;j++)
                {
                    System.out.print((char)(j+64)+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
