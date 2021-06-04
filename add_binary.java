import java.util.Scanner;
public class add_binary {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two binary numbers :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        String ans=add(a,b);
        System.out.println("The sum is : "+Integer.parseInt(ans));
    }
    static String add(int a,int b)
    {
        int c=0;
        String sum="0";
        int l1=String.valueOf(a).length();
        int l2=String.valueOf(b).length();
        int r=a%10,r1=b%10;
        if(r==1 && r1==1)
            c=1;
        sum=sum+Integer.toString(r^r1);
        a=a/10;b=b/10;
        l1--;l2--;
        while(l1!=0 && l2!=0)
        {
            r=a%10;r1=b%10;
            int p=r+r1+c;
            if(p==2)
                {c=1;p=0;}
            else if(p==3)
                {c=1;p=1;}
            else
                c=0;
            sum=sum+Integer.toString(p);
            a=a/10;b=b/10;
            l1--;l2--;
        }
        int l=(l1==0)?l2:l1;
        int x=(l==l1)?a:b;
        while(l!=0)
        {
            r=x%10;
            if(c==1)
            {
                int p=r+c;
                if(p==2)
                    {c=1;p=0;}
                else
                    c=0;
                sum=sum+Integer.toString(p);
            }
            else
                sum=sum+Integer.toString(r);
            x=x/10;
            l--;
        }
        if(c==1)
            sum=sum+Integer.toString(c);
        int n=sum.length(),i;
        String s="0";
        for(i=n-1;i>0;i--)
            s=s+sum.charAt(i);
        return s;
    }
}