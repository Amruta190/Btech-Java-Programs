import java.io.*;
import java.util.*;

public class _9c {
    public static void main(String args[]) {
        String temp1 = null, temp2 = null;
        HashSet<String> hs = new HashSet<String>();
        int exists = 0;
        BufferedReader brw = null;
        try {
            BufferedReader brt = new BufferedReader(new FileReader("technical.txt"));
            while ((temp1 = brt.readLine()) != null) {
                String line[] = temp1.split(" ");
                for (int i = 0; i < line.length; i++) {
                    exists = 0;
                    brw = new BufferedReader(new FileReader("stopwords.txt"));
                    while ((temp2 = brw.readLine()) != null) {
                        if ((temp2.trim()).equalsIgnoreCase(line[i].trim()))
                            hs.add(line[i]);
                    }
                    brw.close();
                }
            }
            brt.close();
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println("Index");
        System.out.println(hs);
        Iterator<String> it = hs.iterator();
        int i = 1;
        while (it.hasNext()) {
            System.out.print(i + ". ");
            System.out.println(it.next());
            i = i + 1;
        }
    }
}