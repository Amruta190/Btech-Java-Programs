import java.util.Scanner;
public class palindrome {
    public static void main(String args[])
    {
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int p=n.length();
        int flag=0;
        for(int i=0;i<p;i++)
        {
            if(n.charAt(i)!=n.charAt(p-i-1))
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println(n+" is Palindrome");
        else if(flag==1)
            System.out.println(n+" is not Palindrome");
        sc.close();
    }
}
