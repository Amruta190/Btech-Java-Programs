import java.util.Scanner;
public class fib {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int m=sc.nextInt();
        String ar[]=new String[m+1];
        for(int i=0;i<=m;i++)
            ar[i]=sc.nextLine();
        String a="a";
        String b="b";
        String c="";
        for(int i=1;i<=k-2;i++)
        {
            c=b+a;
            a=b;
            b=c;
        }
        for(int i=1;i<=m;i++)
        {
            int p=c.split(ar[i], -1).length - 1;
            System.out.println(p);
        }
        sc.close();
    }
}
