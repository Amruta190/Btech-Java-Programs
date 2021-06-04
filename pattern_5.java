import java.util.Scanner;
public class pattern_5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n<0)
            System.out.println("Invalid input");
        else
        {
            for(int i=0;i<n;i++)
            {
                for(int j=n;j>i;j--)
                    System.out.print(j+" ");
                System.out.println();
            }
        }
        sc.close();
    }
}
