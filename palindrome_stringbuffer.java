import java.util.Scanner;
public class palindrome_stringbuffer {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr a string : ");
        String s=sc.nextLine();
        StringBuffer s1=new StringBuffer(s);
        s1.reverse();
        String s2=s1.toString();
        if(s2.equals(s))
            System.out.println(s+" is Palindrome");
        else
            System.out.println(s+" is not Palindrome");
        sc.close();
    }
}