package FilePackage;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 输入流-字节流 读取文件
 */
public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        //创建字节输入流
        FileInputStream fis = new FileInputStream("F:\\java\\JavaTest.txt");
        //创建长度为1024的“竹筒”
        byte[] bbuf = new byte[1024];
        //用于保存实际读取的字节数
        int hasRead = 0;
        //使用循环来重复“取水”过程
        while ((hasRead = fis.read(bbuf)) > 0){
            //将字节数组转换成字符串输入
            System.out.println(new String(bbuf, 0, hasRead));
        }
        //关闭文件输入流
        fis.close();
    }
}
