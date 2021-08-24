import java.io.*;

public class MergeFilesByteStream {
    public static void main(String[] args) throws IOException {
        try {
            File f1 = new File("Hi.txt");
            File f2 = new File("GM.txt");
            FileInputStream fi = new FileInputStream(f1);
            FileInputStream fi2 = new FileInputStream(f2);
            int c;
            FileOutputStream fo = new FileOutputStream("Merge2.txt");
            while ((c = fi.read()) != -1) {
                System.out.print((char) c);
                fo.write((char) c);
            }
            while ((c = fi2.read()) != -1) {
                System.out.print((char) c);
                fo.write((char) c);
            }
            fi.close();
            fi2.close();
            fo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}