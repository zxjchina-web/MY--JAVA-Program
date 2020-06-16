package 匿名内部类;

import java.sql.SQLOutput;

public class Demomain {
    public static void main(String[] args) {
        Myinterface obj=new Myinterface() {
            @Override
            public void method() {
                System.out.println("abc");
            }
            public void method2() {
            }
        };
        obj.method();
        Myinterface obj2=new Myinterface() {
            @Override
            public void method() {
                System.out.println("bcd");
            }
            public void method2() {
            }
        };
        obj2.method();
 //匿名对象无法调用第二次方法
        new Myinterface(){
            @Override
            public void method() {
                System.out.println("bcd");
            }
            public void method2() {
            }
        }.method();
    }
}
