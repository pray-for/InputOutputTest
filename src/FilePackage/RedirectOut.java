package FilePackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 通过重定向标准输出流，
 * 将输出重定向到文件输出，而不是在屏幕上输出
 */
public class RedirectOut {
    public static void main(String[] args) {
        try(
            //一次性创建 PrintStream 输出流
            PrintStream ps = new PrintStream(new FileOutputStream("F:\\java\\JavaCopy.txt")))
        {
            //将标准输出重定向到 ps 输出流
            System.setOut(ps);
            //向标准输出 输出一个字符串
            System.out.println("普通字符串");
            //向标准输出 输出一个对象
            System.out.println(new RedirectOut());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
