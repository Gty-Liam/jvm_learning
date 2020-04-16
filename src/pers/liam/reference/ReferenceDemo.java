package pers.liam.reference;

import java.lang.ref.SoftReference;

/**
 * 强引用测试
 **/
public class ReferenceDemo {
    public static void main(String[] args) {
        Object obj1 = new Object();  //强引用
        Object obj2 = obj1;  //强引用
        System.out.println("obj1 = " + obj1);
        System.out.println("obj2 = " + obj2);
        obj1 = null;
        try {
            byte[] bigObj = new byte[30 * 1024 * 1024]; // 创建30M的大对象
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("obj1 = " + obj1);
            System.out.println("obj2 = " + obj2);
        }
    }
}
