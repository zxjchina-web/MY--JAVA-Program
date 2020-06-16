public class TestThread {
    public static void main(String[] args) {
    //开启多线程
/*        MyThread mt =new MyThread();
        mt.setName("a");
        mt.start();//使此线程开始执行
        mt.run();
        new MyThread("b").start();//匿名了对象，只使用一次
        MyThread mt1=new MyThread("c");
        mt1.start();

        MyRunable run=new MyRunable();
        //构造方法中传递Runable接口实现对象
        Thread mt3=new Thread(run);
        mt3.start();
        for (int i=0;i<=20;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }*/
        //匿名内部类

       /* new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"zxj");
            }
        }.start();

       Runnable run = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"zxj1");
            }
        };
       new Thread(run).start();

       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println(Thread.currentThread().getName()+"zxj2");
           }
       }).start();*/
       //创建对象
       MyRunable run =new MyRunable();
       //将一个方法同时由四个线程执行
       //将重写的run方法传递到线程中
       Thread thread1=new Thread(run);
       Thread thread2=new Thread(run);
       Thread thread3=new Thread(run);
       Thread thread4=new Thread(run);
       //调用多线程开启
       thread1.start();
       thread2.start();
       thread3.start();
       thread4.start();
    }
}
