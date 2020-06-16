package 内部类;

public class Test {
    public static void main(String[] args) {
        //第一种应用内部类对象
        Sample sample=new Sample();
        Sample.Inner inner=sample.new Inner();
        //第二种
        Sample.Inner inner2=new Sample().new Inner();
        System.out.println(inner2.print);
        inner2.print();
    }
}
