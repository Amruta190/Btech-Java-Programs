import java.util.Scanner;
public class fact_doWhile {
    public static void main(String args[])
    {
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1,p=n;
        do
        {
            fact*=n;
            n--;
        }while(n>0);
        System.out.println("The factorial of "+p+" is "+fact);
        sc.close();
    }
}
