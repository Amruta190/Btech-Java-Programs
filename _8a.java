import java.util.*;

public class _8a {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1 and x2 : ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int min = Math.min(x1, x2);
        int max = Math.max(x1, x2);
        for (int i = 0; i <= 10; i++)
            System.out.print(r.nextInt(max - min + 1) + min + "\t");
        sc.close();

        /*
         * System.out.println(Math.random()); System.out.println(max-min+1);
         * System.out.println(Math.random()*(max-min+1)); for(int i=0;i<10;i++)
         * System.out.print((int)((Math.random()*(max-min+1))+min)+"  ");
         */
    }
}