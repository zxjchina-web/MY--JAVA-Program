import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunable implements Runnable {
    private static int ticket=100;
    //创建一个锁对象
    //Object obj=new Object();
    @Override
    public void run() {
      /*  while (true){
            //同步代码块，只让一个线程在代码中执行
            synchronized (obj){
                if(ticket>0){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+ticket+"piao");
                    ticket--;
                }
            }
        }*/

      while (true)
      {
        pay();
      }
    }
    //定义了一个同步方法
    //实现类的对象 new MyRunable()
    public synchronized void pay(){
        if (ticket > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ticket + "piao");
            ticket--;
        }
    }
}
//Runable接口避免了单继承的局限性