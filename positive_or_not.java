import java.util.Scanner;
public class positive_or_not {
    public static void main(String args[])
    {
        System.out.println("Enter a number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        if(n==0)
            System.out.println(n+" is neither positive nor negative");
        else
            c=(n>0)?1:-1;
        if(c==1)
            System.out.println("Positive");
        else if(c==-1)
            System.out.println("Negative");
        sc.close();
    }
}
