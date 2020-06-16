package 内部类;

import jdk.nashorn.internal.parser.JSONParser;

import java.sql.SQLOutput;

public class Sample {
    public int id;
    private String name;
    static String type;
    static final int PI=4;
    public Sample(){
        id=10;
        name="abc";
        type="submint";
    }
    //内部类
    class Inner{
        public int print=12;
        public void print(){
            System.out.println("id");
            System.out.println("PI");
            System.out.println("abc");
        }
    }

}
