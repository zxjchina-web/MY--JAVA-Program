package ThreadBaoZi;

public class BaoZiPu extends Thread{
    private Baozi baozi;
    //为包子变量赋值
    public BaoZiPu(Baozi baozi){
        //创建对象时将对象传递进来
        this.baozi=baozi;
    }

    @Override
    public void run() {
        int count=0;
        //让包子铺一直生产包子
        while(true){
            synchronized (baozi){
                //有包子则等待顾客吃掉包子
                if (baozi.flag==true){
                    try {
                        //必须要使用锁对象来调用wait使锁对象进入等待唤醒状态
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //交替生产两种包子
                if(count%2==0) {
                    baozi.pi = "薄皮";
                    baozi.xian = "三鲜";
                }else{
                    baozi.xian="肉";
                    baozi.pi="冰皮";
                }
                count++;
                System.out.println("正在生产"+baozi.pi+baozi.xian+"包子");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                baozi.flag=true;
                baozi.notify();
                System.out.println(baozi.pi+baozi.xian+"的包子生产好了");
            }
        }
    }
}
