package FilePackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 将普通的 Reader 再次包装成 BufferReader，
 * 用 readLine() 方法可以一次读取一行内容
 */
public class KeyinTest {
    public static void main(String[] args) {
        try (
            //将 System.in 对象转换成 Reader 对象
            InputStreamReader reader = new InputStreamReader(System.in);
            //将普通的 Reader 包装成 BufferedReader
            BufferedReader br = new BufferedReader(reader))
        {
            String line = null;
            //用循环逐行读取
            while ((line = br.readLine()) != null){
                //如果读取的字符串为“exit”，则程序退出
                if (line.equals("exit")){
                    System.exit(1);
                }
                //打印读取的内容
                System.out.println("输入内容为：" + line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
