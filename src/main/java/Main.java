import java.io.*;

public class Main {

    public static void main(String[] args) {
        try (OutputStream osw = new BufferedOutputStream(new FileOutputStream(new File("converted.txt")))) {
            InputStream isr = new BufferedInputStream(new FileInputStream(new File("original.txt")));
            byte[] buf2 = new byte[50];
            int v;
            while ((v = isr.read()) != -1){
                isr.read(buf2);
            }
            String string = new String(buf2);
            byte[] buf1 = new byte[50];
            buf1 = string.getBytes("UTF-8");
            for(int i=0;i<buf1.length;i++) {
                osw.write(buf1[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
