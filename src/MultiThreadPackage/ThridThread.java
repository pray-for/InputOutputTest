package MultiThreadPackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 通过实现 Callable 接口来实现线程类
 */
public class ThridThread {
    public static void main(String[] args) {
        //创建 Callable 对象
        ThridThread rt = new ThridThread();
        //使用 FutureTask 来包装 Callable 对象
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) ()->{
           int i = 0;
           for ( ; i < 100; i++){
               System.out.println(Thread.currentThread().getName() + " " + i);
           }
           //call() 方法可以有返回值
           return i;
        });
        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20){
                //实质还是以 Callable 对象来创建并启动线程的
                new Thread(task, "有返回值的线程").start();
            }
        }
        try {
            //获取线程的返回值
            System.out.println("子线程的返回值：" + task.get());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
