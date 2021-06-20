import java.util.Scanner;
public class pattern_2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        if(n<0)
            System.out.println("Invalid input");
        else
        {
            int arr[][]=new int[n][n];
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    arr[i][j]=i+1;
                }
            }
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}