package pers.liam.reference;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        Object key1 = new Object();  //强引用
        Object key2 = new Object();
        String value1 = "value1";
        String value2 = "value2";
        WeakHashMap weakMap = new WeakHashMap();
        weakMap.put(key1, value1);
        weakMap.put(key2, value2); //弱引用
        key2 = null; // 对于key2所指的对象来说，现在只有weakHashMap(弱引用)指向它了
        System.out.println("weakMap = " + weakMap);
        System.gc(); // 内存充足，但是只要GC，弱引用对象就会被回收
        System.out.println("After GC");
        System.out.println("weakMap = " + weakMap);
    }
}
