package pers.liam.jvm_learning;

import com.sun.org.apache.bcel.internal.classfile.Code;

class Code01{
    public Code01(){
        System.out.println("Code01's constructor 111");
    }
    static {
        System.out.println("Code01's static block 222");
    }

    {
        System.out.println("Code01's building block 333");
    }

    static void staticMethod(){
        System.out.println("Code01's static method 888");
    }
}
public class T06 {
    {
        System.out.println("T06's building block 444");
    }
    static {
        System.out.println("T06's static block 555");
    }
    public T06(){
        System.out.println("T06's constructor 666 ");
    }

    public static void main(String[] args) {
        System.out.println("main first code  777");
        Code01.staticMethod();
        System.out.println("-------------");
        new Code01().staticMethod();
        System.out.println("-------------");
        new Code01();
        System.out.println("-------------");
        new T06();
    }
}
//5728-318-31-46