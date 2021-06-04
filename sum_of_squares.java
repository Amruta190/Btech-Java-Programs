import java.util.Scanner;
public class sum_of_squares {
    public static void main(String args[])
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1)
            System.out.println("Invaliid input");
        else
            System.out.println("The sum of squares of first "+n+" natural numbers is :"+(n*(n+1)*((2*n)+1))/6);
        sc.close();
    }
}
