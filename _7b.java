import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class _7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Object> v1 = new Vector<>();
        System.out.println("Enter byte type value : ");
        byte b1 = sc.nextByte();
        v1.add(Integer.valueOf(b1));
        System.out.println("Enter boolean type value : ");
        boolean b2 = sc.nextBoolean();
        v1.add(Boolean.valueOf(b2));
        System.out.println("Enter char type value : ");
        char b3 = sc.next().charAt(0);
        v1.add(Character.valueOf(b3));
        System.out.println("Enter short type value : ");
        short b4 = sc.nextShort();
        v1.add(Short.valueOf(b4));
        System.out.println("Enter int type value : ");
        int b5 = sc.nextInt();
        v1.add(Integer.valueOf(b5));
        System.out.println("Enter long type value : ");
        long b6 = sc.nextLong();
        v1.add(Long.valueOf(b6));
        System.out.println("Enter float type value : ");
        float b7 = sc.nextFloat();
        v1.add(Float.valueOf(b7));
        System.out.println("Enter double type value : ");
        double b8 = sc.nextDouble();
        v1.add(Double.valueOf(b8));
        System.out.println("---Corresponding Wrapper classes---");
        Iterator<Object> it = v1.iterator();
        System.out.println(it.next());
        while (it.hasNext())
            System.out.println(it.next());
        sc.close();
    }
}