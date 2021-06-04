import java.util.Scanner;
public class _3a {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter matrix order: ");
        int n=sc.nextInt();
        System.out.println("Enter "+n*n+" elements :");
        int ar[]=new int[n*n];
        for(int i=0;i<n*n;i++)
            ar[i]=sc.nextInt();
        int k=-1;
        System.out.println("The diagonal elements are :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                k++;
                if(i==j)
                    System.out.print(ar[k]+" ");
            }
        }
        sc.close();
    }
}