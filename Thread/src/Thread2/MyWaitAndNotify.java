package Thread2;

public class MyWaitAndNotify {
    public static void main(String[] args) {
        Object obj=new Object();

        Thread custermers1=new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("start1");
                    try{
                        //开始等待 知道出现唤醒方法
                        obj.wait();
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("begin1");
                }
            }
        };
        Thread custermers2=new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("start2");
                    try{
                        //开始等待 知道出现唤醒方法
                        obj.wait();
                    }catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("begin2");
                }
            }
        };
        Thread boss=new Thread(){
            @Override
            public void run() {
                synchronized (obj) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("wait");
                    //唤醒
                    //obj.notify(); 随机唤醒一个
                    obj.notifyAll(); // 两个全都唤醒
                }
            }
        };
        custermers1.start();
        custermers2.start();
        boss.start();
    }
}
