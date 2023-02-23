package myIOTXT;


import java.io.*;
/*创建时间：2023-02-23
/修改：
 */
public class TextSetting {
    public static void textChangeEncoding(File f1,String charsetName1,File f2,String charsetName2){
        /*传入待修改文本，文本编码，指定修改后文本文件，编码*/
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bfr = new BufferedReader(new InputStreamReader(new FileInputStream(f1),charsetName1));
            String st;
            while ((st=bfr.readLine())!=null){
                sb.append(st+"\r\n");
            }
            bfr.close();
            BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2),charsetName2));
            bfw.write(sb.toString());
            bfw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
