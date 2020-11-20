package MultiThreadPackage;

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin s1 = new ThreadJoin();
        ThreadJoin s2 = new ThreadJoin();
        ThreadJoin s3 = new ThreadJoin();

        s1.setName("康熙");
        s2.setName("四阿哥");
        s3.setName("八阿哥");

        s1.start();
        try {
            s1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        s2.start();
        s3.start();
    }
}
