package FilePackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 使用 PrintStream 处理流来包装 OutputStream
 * 将 println 中的内容写入文件
 */
public class PrintStreamTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("F:\\java\\JavaCopy.txt");
             PrintStream ps = new PrintStream(fos))
        {
            //使用 PrintStream 执行输出
            ps.println("普通字符串");
            //直接使用 PrintStream 输出对象
            ps.println(new PrintStreamTest());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}