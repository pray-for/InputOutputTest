package FilePackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 输出流-字节流 读取文件，并实现文件内容的复制
 */
public class OutputStreamTest {
    public static void main(String[] args) {
        try(
            //创建字节输入流
            FileInputStream fis = new FileInputStream("F:\\java\\JavaTest.txt");
            //创建字节输出流
            FileOutputStream fos = new FileOutputStream("F:\\java\\JavaCopy.txt"))
        {
            byte[] bbuf = new byte[128];
            int hasRead = 0;
            //循环从输入流中取出数据
            while ((hasRead = fis.read(bbuf)) > 0){
                //每读取一次，即写入文件输出流，读多少写多少
                fos.write(bbuf, 0, hasRead);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
