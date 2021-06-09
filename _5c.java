import java.util.Arrays;
import java.util.Scanner;
public class _5c {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st string : ");
        String s1=sc.nextLine();
        System.out.print("Enter 2nd string : ");
        String s2=sc.nextLine();
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2))
            System.out.println(s1+" and "+s2+" are Anagrams");
        else
            System.out.println(s1+" and "+s2+" are not Anagrams");
        sc.close();
    }
}
