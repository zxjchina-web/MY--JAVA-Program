package ThreadBaoZi;

public class ChiHuo extends Thread {
    private Baozi baozi;
    //为包子变量赋值
    public ChiHuo(Baozi baozi){
        this.baozi=baozi;
    }
    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if(baozi.flag==false){
                    try {
                        //如果没有包子则开始等待不执行下列代码
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒后开始吃包子
                System.out.println("正在吃"+baozi.pi+baozi.xian+"包子");
                baozi.flag=false;
                //唤醒包子铺开始做包子
                baozi.notify();
                System.out.println("吃完了"+baozi.pi+baozi.xian+"的包子");
                System.out.println("=====================================");
            }
        }
    }
}
