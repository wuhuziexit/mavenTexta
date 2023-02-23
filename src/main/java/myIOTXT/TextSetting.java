package myIOTXT;


import java.io.*;
/*����ʱ�䣺2023-02-23
/�޸ģ�
 */
public class TextSetting {
    public static void textChangeEncoding(File f1,String charsetName1,File f2,String charsetName2){
        /*������޸��ı����ı����룬ָ���޸ĺ��ı��ļ�������*/
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
