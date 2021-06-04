import java.util.Scanner;
public class matrix_add {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t--1st matrix--\t");
        System.out.print("Enter m and n values of matrix : ");
        int m1=sc.nextInt();
        int n1=sc.nextInt();
        int matrix1[][]=new int[m1][n1];
        System.out.println("Enter matrix elements : ");
        for(int i=0;i<m1;i++)
            for(int j=0;j<n1;j++)
                matrix1[i][j]=sc.nextInt();
        System.out.println("\t--2nd matrix--\t");
        System.out.print("Enter m and n values of matrix : ");
        int m2=sc.nextInt();
        int n2=sc.nextInt();
        int matrix2[][]=new int[m2][n2];
        System.out.println("Enter matrix elements : ");
        for(int i=0;i<m2;i++)
            for(int j=0;j<n2;j++)
                matrix2[i][j]=sc.nextInt();
        if(m1==m2 && n1==n2)
        {
            System.out.println("Matrix after addition is:");
            for(int i=0;i<m1;i++)
            {
                for(int j=0;j<n1;j++)
                    System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
                System.out.println();
            }
        }
        else
            System.out.println("Addition not possible!!!");
        sc.close();
    }
}