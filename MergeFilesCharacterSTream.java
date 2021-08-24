import java.io.*;

public class MergeFilesCharacterSTream {
    public static void main(String args[]) throws IOException {
        try {
            File f1 = new File("Hi.txt");
            File f2 = new File("GM.txt");
            FileReader fr = new FileReader(f1);
            FileReader fr2 = new FileReader(f2);
            int c;
            FileWriter fw = new FileWriter("Merge.txt");
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
                fw.append((char) c);
            }
            fw.append(" ");
            System.out.print(" ");
            while ((c = fr2.read()) != -1) {
                System.out.print((char) c);
                fw.append((char) c);
            }
            fr.close();
            fr2.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}