import java.io.*;
import java.util.Scanner;

public class _9a {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name to read : ");
        String st = sc.next();
        File f1 = new File(st);
        System.out.println("Details of file are : ");
        System.out.println("File name : " + f1.getName());
        System.out.println(f1.exists() ? "Yes, file exists" : "No, file does not exist");
        System.out.println("Path of file : " + f1.getPath());
        System.out.println("Absolute Path of file : " + f1.getAbsolutePath());
        System.out.println("Length of file : " + f1.length());
        System.out.println("Parent of file : " + f1.getParent());
        System.out.println(f1.canRead() ? "Yes, readable" : "No, can't read the file");
        System.out.println(f1.canWrite() ? "Yes, writable" : "No, can't write the file");
        System.out.println(f1.canExecute() ? "Yes, executable" : "No, can't execute the file");
        System.out.println("This file was last modified at : " + f1.lastModified());
        FileInputStream fi = new FileInputStream(f1);
        int alphacnt = 0, numcnt = 0, symcnt = 0, ch = 0;
        try {
            while ((ch = fi.read()) != -1) {
                if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
                    alphacnt += 1;
                else if (ch >= 48 && ch <= 56)
                    numcnt += 1;
                else
                    symcnt += 1;
            }
            fi.close();
            FileOutputStream fo = new FileOutputStream("Result.txt");
            System.out.println();
            System.out.println("Number of alphabets:" + alphacnt);
            System.out.println("Number of Numerics:" + numcnt);
            System.out.println("Number of special symbols:" + symcnt);
            String str = "Number of alphabets = " + alphacnt;
            fo.write(str.getBytes());
            fo.write("\n".getBytes());
            str = "Number of Numerics = " + numcnt;
            fo.write(str.getBytes());
            fo.write("\n".getBytes());
            str = "Number of special symbols = " + symcnt;
            fo.write(str.getBytes());
            fo.write("\n".getBytes());
            fo.close();
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
        sc.close();
    }
}