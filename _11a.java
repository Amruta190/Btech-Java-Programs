class One extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Good Morning");
        }
    }
}

class Two extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Hello");
        }
    }
}

class Three extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}

public class _11a {
    public static void main(String args[]) {
        One a = new One();
        Two b = new Two();
        Three c = new Three();
        a.start();
        b.start();
        c.start();
    }
}
