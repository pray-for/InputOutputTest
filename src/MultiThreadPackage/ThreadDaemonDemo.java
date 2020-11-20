package MultiThreadPackage;

/**
 * setDaemon() 方法
 * 将此线程标记为守护线程，
 * 当运行的线程都是守护线程时，Java虚拟机将退出
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon s1 = new ThreadDaemon();
        ThreadDaemon s2 = new ThreadDaemon();

        s1.setName("关羽");
        s2.setName("张飞");

        //设置主线程为 刘备
        Thread.currentThread().setName("刘备");

        //设置守护线程
        s1.setDaemon(true);
        s1.setDaemon(true);

        s1.start();
        s2.start();

        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

    }
}
