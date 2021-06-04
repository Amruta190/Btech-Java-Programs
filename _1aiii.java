public class _1aiii {
    public static void main(String[] args)
    {
        int i,n=Integer.parseInt(args[0]);
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
