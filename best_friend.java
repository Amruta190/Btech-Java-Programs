
import java.util.*;

public class best_friend {

	
	public static void main(String[] args) {
		/* Your class should be named Main.
 			* Read input as specified in the question.
 			* Print output as specified in the question.
		*/

		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String ar[]=new String[n];
        for(int i=0;i<n;i++)
        	ar[i]=sc.next();
    	sc.close();
        int cnt=0;
		for(int i=0;i<n;i++)
        {
            for(int j=1;j<=k;j++)
            {
                if((i+j)<ar.length)
                {
                 	if(ar[i].length()==ar[i+j].length())
                    	cnt+=1;   
                }
            }
        }
        for(int i=ar.length-1;i>=0;i--)
        {
            for(int j=1;j<=k;j++)
            {
                if((i-j)>=0)
                {
                 	if(ar[i].length()==ar[i-j].length())
                    	cnt+=1;   
                }
            }
        }
        System.out.println(cnt/2);
	}

}