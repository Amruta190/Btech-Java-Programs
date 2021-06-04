import java.util.Scanner;
import java.util.Arrays;
public class _2c {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        int arr[][]=new int[2][n];
        System.out.println("Enter array values :");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int cnt=0;
        Arrays.sort(ar);
        int j=-1;
        for(int i=1;i<ar.length;i++)
        {
            cnt=1;
            while(i!=ar.length && ar[i-1]==ar[i])
            {
                cnt+=1;
                ++i;
            }
            arr[0][++j]=ar[i-1];
            arr[1][j]=cnt;
        }
        int k=ar.length;
        if(ar[k-2]!=ar[k-1])
        {
            arr[0][++j]=ar[k-1];
            arr[1][j]=1;
        }
        for(int i=0;i<=j;i++)
        {
            for(k=0;k<j-i;k++)
            {
                if(arr[1][k] > arr[1][k+1])
                {
                    int temp=arr[1][k];
                    arr[1][k]=arr[1][k+1];
                    arr[1][k+1]=temp;
                    temp=arr[0][k];
                    arr[0][k]=arr[0][k+1];
                    arr[0][k+1]=temp;
                }
            }
        }
        System.out.println("Element : Frequency");
        for(int i=0;i<=j;i++)
            System.out.println(" "+arr[0][i]+"\t:\t"+arr[1][i]);
        sc.close();
    }
}
