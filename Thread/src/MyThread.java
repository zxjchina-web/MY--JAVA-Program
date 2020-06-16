public class MyThread extends Thread {
    public  MyThread(){
    }
    public MyThread(String name){
        //把线程名称传递给父类
        super(name);
    }
    @Override
    //新线程执行的方法
    public void run() {
        //获取线程名称
        System.out.println(Thread.currentThread().getName());
        System.out.println("run");
        for(int i=0;i<60;i++){
            System.out.println(i);
            try {
                //让程序睡眠一秒钟 sleep方法本身具有异常
                this.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
