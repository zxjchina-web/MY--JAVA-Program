import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunable_Lock implements Runnable {
    Lock l=new ReentrantLock();
    static int ticket=100;
    @Override
    public void run() {
        while(true) {
            //获取锁
            l.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(1000);
                    System.out.println(Thread.currentThread().getName() + ticket + "piao");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //无论代码是否出现异常都会释放锁
                    l.unlock();
                }
                ticket--;
            }
        }

    }
}

