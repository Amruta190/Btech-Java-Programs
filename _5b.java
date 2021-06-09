import java.util.Scanner;
public class _5b {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n=sc.nextInt();
        if(n!=0)
        {
            String s[]=new String[n+1];
            System.out.println("Enter strings : ");
            for(int i=0;i<=n;i++)
                s[i]=sc.nextLine();
            System.out.println("String\tVowels\tConsonants");
            for(int i=1;i<=n;i++)
            {
                int cnt=0;
                String s1=s[i];
                for(int j=0;j<s1.length();j++)
                {
                    if(s1.charAt(j)=='a'||s1.charAt(j)=='e'||s1.charAt(j)=='i'||s1.charAt(j)=='o'||s1.charAt(j)=='u'||s1.charAt(j)=='A'||s1.charAt(j)=='E'||s1.charAt(j)=='I'||s1.charAt(j)=='O'||s1.charAt(j)=='U')
                        cnt+=1;
                }
                int con=s1.length()-cnt;
                System.out.println(s1+"\t"+cnt+"\t"+con);
            }
        }
        sc.close();
    }
}
