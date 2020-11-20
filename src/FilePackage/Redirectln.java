package FilePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 通过重定向标准输入，
 * 将输入重定向到指定文件，而不是键盘输入；
 */
public class Redirectln {
    public static void main(String[] args) {
        try(
            FileInputStream fis = new FileInputStream("F:\\java\\JavaCopy.txt"))
        {
            //将标准输入重定向到 fis 输入流
            System.setIn(fis);
            //使用 System.in 创建 Scanner 对象，用于获取标准输入
            Scanner sc = new Scanner(System.in);
            //增加下一行只把回车作为分隔符
            sc.useDelimiter("\n");
            //判断是否还有下一个输入项
            while (sc.hasNext()){
                //输出输入项
                System.out.println("键盘输入的内容是：" + sc.next());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
