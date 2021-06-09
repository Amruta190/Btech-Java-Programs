import java.util.Scanner;
public class _5a {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String word=sc.nextLine();
        System.out.print("Enter a size of substring : ");
        int n=sc.nextInt();
        int part=word.length()/n;
        if(word.length()%n!=0)
            System.out.println("String "+word+" can not be divided into "+n+" equal parts!!!");
        else
        {
            int k=0;
            String s[]=new String[part];
            for(int i=0;i<word.length();i+=n)
            {
                String s1=word.substring(i,i+n);
                s[k++]=s1;
            }
            System.out.println("Equal parts of string : ");
            for(int i=0;i<k;i++)
                System.out.println(s[i]);
            System.out.println("Strings in lexicographical order :");
            for(int i = 0; i < k; i++) 
            {
                for (int j = i + 1; j < k; j++) 
                { 
                    if (s[i].compareTo(s[j]) > 0) 
                    {
                        String temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }
            for(int i=0;i<k;i++)
                System.out.println(s[i]);
        }
        sc.close();
    }
}