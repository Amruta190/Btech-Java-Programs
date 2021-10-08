import java.util.Scanner;

public class _10a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int num1 = Integer.parseInt(sc.next());
            int num2 = Integer.parseInt(sc.next());
            int d = num1 / num2;
            System.out.println("Result = " + d);
        } catch (NumberFormatException ne) {
            System.out.println(ne);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        } finally {
            System.out.println("Program terminated");
        }
        sc.close();
    }
}
