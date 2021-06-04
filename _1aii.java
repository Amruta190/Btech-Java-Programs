public class _1aii {
    public static void main(String[] args)
    {
        int n;
        if(args[3].charAt(0)=='P')
        {
            if(Integer.parseInt(args[0])==12)
                System.out.println(args[0]+":"+args[1]+":"+args[2]);
            else
            {
                n=Integer.parseInt(args[0])+12;
                System.out.println(n+":"+args[1]+":"+args[2]);
            }
        }
        else if(args[3].charAt(0)=='A')
        {
            if(Integer.parseInt(args[0])==12)
                System.out.println("00:"+args[1]+":"+args[2]);
            else
                System.out.println(args[0]+":"+args[1]+":"+args[2]);
        }
    }
}