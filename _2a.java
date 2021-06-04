import java.util.Scanner;
public class _2a {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of integer values: ");
        int p=sc.nextInt();
        for(int i=0;i<p;i++)
        {
            System.out.print("Enter "+(i+1)+"th value :");  
            long n=sc.nextLong();
            System.out.println("It fits in ");  
            if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE) 
                System.out.println("Byte Data type");
            if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE) 
                System.out.println("Short Data type");
            if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE) 
                System.out.println("Integer Data type");
            if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE) 
                System.out.println("Long Data type");
            System.out.println();
        }
        sc.close();
    }
}