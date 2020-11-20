package MultiThreadPackage;

/**
 * 通过继承 Thread 类来创建线程类
 */
public class FirstThread extends Thread {
    private int i;
    //重写 run() 方法，run() 方法的执行体就是线程的执行体
    public void run(){
        for ( ; i < 100; i++){
            //当线程类继承 Thread 类时，直接使用 this 即可获取当前线程；
            //Thread 对象的 getName() 返回当前线程的名字；
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20){
                //创建并启动第一个线程
                new FirstThread().start();
                //创建并启动第二个线程
                new FirstThread().start();
            }
        }
    }
}
