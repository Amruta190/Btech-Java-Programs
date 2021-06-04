import java.util.Scanner;
public class _3b {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.of financial years : ");
        int m=sc.nextInt();
        System.out.print("Enter no.of item id's : ");
        int n=sc.nextInt();
        int sales[][]=new int[m+1][n+1];
        System.out.println("Enter financial years : ");
        for(int i=1;i<m+1;i++)
            sales[i][0]=sc.nextInt();
        System.out.println("Enter item id's : ");
        for(int i=1;i<n+1;i++)
            sales[0][i]=sc.nextInt();
        System.out.println("Enter sales values : ");
        for(int i=1;i<m+1;i++)
            for(int j=1;j<n+1;j++)
                sales[i][j]=sc.nextInt();
        System.out.println("Sales table is : ");
        for(int i=0;i<m+1;i++)
        {
            for(int j=0;j<n+1;j++)
                System.out.print(sales[i][j]+"   ");
            System.out.println();
        }       
        System.out.println("Item(s) with more demand :");
        System.out.println("Year  Id");
        int max=0;
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(sales[i][j]>=max)
                    max=sales[i][j];
            }
        }
        for(int i=1;i<m+1;i++)
        {
            for(int j=1;j<n+1;j++)
            {
                if(sales[i][j]==max)
                {
                    max=sales[i][j];
                    System.out.println(sales[i][0]+"  "+sales[0][j]);
                }
            }
        }
        sc.close();
    }
}
