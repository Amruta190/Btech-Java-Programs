import java.util.Scanner;
class _1biii {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int i,n=s.nextInt();
        s.close();
        for(i=0;i<n;i++)
            System.out.println(fib(i));
    }
    static int fib(int n)
    {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else    
            return fib(n-1)+fib(n-2);
    }
}
