package myIOTXT;

import java.io.*;

public class text {
    public static void main(String[] args) {
        getTxt();
    }
    public static void getTxt(){
        try {
            File f=new File("a.txt");
            f.createNewFile();
            BufferedReader bfr=new BufferedReader(new FileReader(f));
            System.out.println(bfr.readLine());
            System.out.println(bfr.readLine());
            bfr.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
