package com.zyk.lianXuZiShuZuZuiDaHe;

import java.util.Date;
import java.util.HashMap;

public class SuperTest extends Date {
    private static final long serialVersionUID = 1L;
    private void test(){
        System.out.println(super.getClass().getName());
    }

    public static void main(String[]args){
        HashMap map = new HashMap();
        System.out.println(map.containsKey("dasd"));
        new SuperTest().test();
        A.method2();
        A a = new A();
        a.method1();
    }
}
class A{
    int  i;

    static  String  s;

    void  method1() {   }

    static  void  method2()  {   }

}