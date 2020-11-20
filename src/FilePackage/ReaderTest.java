package FilePackage;

import java.io.FileReader;
import java.io.IOException;

/**
 * 输入流-字符流 读取文件
 */
public class ReaderTest {
    public static void main(String[] args) throws IOException {
        try (
                //创建字符输入流
                FileReader fr = new FileReader("F:\\java\\JavaTest.txt"))
        {
            //创建一个长度为32的“竹筒”
            char[] cbuf = new char[128];
            //用于保存实际读取的字符数
            int hasRead = 0;
            //使用循环重复“取水”过程
            while ((hasRead = fr.read(cbuf)) > 0){
                //将字符数组转换成字符串输入
                System.out.println(new String(cbuf, 0, hasRead));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
