import java.util.Scanner;
public class _3c {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter order of matrix : ");
        int n=sc.nextInt();
        int mat[][]=new int[n][n];
        System.out.println("Enter matrix elements : ");
        for(int i=0;i<mat.length;i++)
            for(int j=0;j<mat.length;j++)
                mat[i][j]=sc.nextInt();
        int sum=0,sum1=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length;j++)
            {
                if(i==j)
                    sum+=mat[i][j];
                if(i+j==n-1)
                    sum1+=mat[i][j];
            }
        }
        System.out.println("Absolute difference is : "+Math.abs(sum-sum1));
        sc.close();
    }
}