package pers.liam.reference;

import java.lang.ref.SoftReference;

public class SoftReferenceDemo {
    public static void main(String[] args) {
        Object obj1 = new Object();
        SoftReference<Object> srObj = new SoftReference<>(obj1);
        System.out.println("obj1 = " + obj1);
        System.out.println("srObj = " + srObj.get());
        obj1 = null;
        try {
            byte[] bigObj = new byte[30 * 1024 * 1024]; // 创建30M的大对象
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("obj1 = " + obj1);
            System.out.println("srObj = " + srObj.get());
        }
    }
}
