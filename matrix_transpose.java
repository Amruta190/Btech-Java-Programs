import java.util.Scanner;
public class matrix_transpose {
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
        int B[][]=new int[n1][m1];
        transpose(A,B,m1,n1);
        System.out.println("Transpose is :");
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
                System.out.print(B[i][j]+" ");
            System.out.println();
        }
        sc.close();
    }
    static void transpose(int A[][], int B[][],int M, int N)
    {
        int i, j;
        for (i = 0; i < N; i++)
            for (j = 0; j < M; j++)
                B[i][j] = A[j][i];
    }
}