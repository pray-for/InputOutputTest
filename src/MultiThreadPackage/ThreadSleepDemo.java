package MultiThreadPackage;

/**
 * sleep 使当前正在执行的线程停留（暂停执行）指定的毫秒级
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep s1 = new ThreadSleep();
        ThreadSleep s2 = new ThreadSleep();
        ThreadSleep s3 = new ThreadSleep();

        s1.setName("曹操");
        s2.setName("刘备");
        s3.setName("孙权");

        s1.start();
        s2.start();
        s3.start();
    }
}
