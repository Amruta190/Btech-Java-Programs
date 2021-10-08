import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class _9b {
    public static void main(String args[]) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader("superMarket.csv"));
        fr.readLine();
        String k = "";
        ArrayList<Integer> quantity = new ArrayList<>();
        int total_revenue = 0;
        while ((k = fr.readLine()) != null) {
            String ar[] = k.split(",");
            System.out.println("\nID : " + ar[0] + "\nName : " + ar[1] + "\nPrice : " + ar[2] + "\nQuantity : " + ar[3]);
            total_revenue += Integer.parseInt(ar[2]) * Integer.parseInt(ar[3]);
            quantity.add(Integer.parseInt(ar[3]));
        }
        System.out.println("\n--------------------------\nTotal revenue = " + total_revenue + "\n");
        Collections.sort(quantity);
        System.out.println("---------After sorting---------");

        for (int i : quantity) {
            fr = new BufferedReader(new FileReader("superMarket.csv"));
            fr.readLine();
            while ((k = fr.readLine()) != null) {
                String ar[] = k.split(",");
                if (Integer.toString(i).equals(ar[3])) {
                    System.out.println("\nID : " + ar[0] + " \tName : " + ar[1] + " \tPrice : " + ar[2] + " \tQuantity : " + ar[3]);
                }
            }
        }
        fr.close();
    }
}