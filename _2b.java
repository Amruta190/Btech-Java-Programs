import java.util.Scanner;
public class _2b {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size :");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int flag=0;
        System.out.println("Enter array values :");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Elements that are both odd and prime are:");
        for(int i=0;i<n;i++)
        {
            int cnt=0;
            if(ar[i]%2==1)
            {
                for(int j=1;j<ar[i];j++)
                {
                    if(ar[i]%j==0)
                        cnt++;
                }
            }
            if(cnt==1)
            {
                flag=1;
                System.out.print(ar[i]+" ");
            }
        }
        if(flag==0)
            System.out.println("Not Found");
        sc.close();
    }
}
