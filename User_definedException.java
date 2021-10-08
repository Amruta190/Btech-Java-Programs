import java.util.Scanner;

class definedException extends Exception {
    String st;

    definedException(String st1) {
        st = st1;
    }

    public String toString() {
        return st;
    }
}

public class User_definedException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        System.out.print("Enter withdrawal amount : ");
        int withdraw = sc.nextInt();
        try {
            if (balance < withdraw)
                throw new definedException("Can't withdraw");
            else {
                balance -= withdraw;
                System.out.println("Successfully withdrawed Rs" + withdraw);
                System.out.println("Remaining balance is Rs" + balance);
            }
        } catch (definedException e) {
            System.out.println(e);
        }
        // sc.close();
    }
}
