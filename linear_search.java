import java.util.Scanner;
public class linear_search {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        System.out.print("Enter key element: ");
        int key=sc.nextInt();
        sc.close();
        int flag=0,i;
        for(i=0;i<ar.length;i++)
        {
            if(ar[i]==key)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Element found at index: "+i);
        else if(flag==0)
            System.out.println("Element not found");
    }
}
