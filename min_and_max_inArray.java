import java.util.Scanner;
import java.lang.Math;
public class min_and_max_inArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n=sc.nextInt();
        int ar[]=new int[n];
        System.out.print("Enter array elements: ");
        for(int i=0;i<ar.length;i++)
            ar[i]=sc.nextInt();
        int min=ar[0],max=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            min=Math.min(min,ar[i]);
            max=Math.max(max,ar[i]);
        }
        System.out.println("Minimum element is : "+min);
        System.out.println("Maximum element is : "+max);
        sc.close();
    }
}