import java.util.Scanner;
public class matrix_trace {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter m and n values of matrix : ");
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        int A[][]=new int[m1][n1];
        System.out.println("Enter matrix elements : ");
        for(int i=0;i<m1;i++)
            for(int j=0;j<n1;j++)
                A[i][j]=sc.nextInt();
        System.out.print("Trace is : ");
        int sum=0;
        for(int i=0;i<m1;i++)
        {
            for(int j=0;j<n1;j++)
            {
                if(i==j)
                    sum+=A[i][j];
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
