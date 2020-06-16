package ThreadBaoZi;

public class Test {
    public static void main(String[] args) {
        Baozi baozi=new Baozi();
        //创建包子铺线程
        new BaoZiPu(baozi).start();
        //创建顾客线程
        new ChiHuo(baozi).start();
    }
}
