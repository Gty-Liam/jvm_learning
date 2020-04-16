package pers.liam.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class PhantomReferenceDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();
        Integer int3 = new Integer(3);
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Object> phObj = new PhantomReference<>(obj, referenceQueue);
        PhantomReference<Object> phObj2 = new PhantomReference<>(obj2, referenceQueue);
        WeakReference<Integer> weakObj3 = new WeakReference<>(int3, referenceQueue);
        System.out.println("obj = " + obj);
        System.out.println("phObj = " + phObj.get());
        System.out.println("referenceQueue = " + referenceQueue.poll());

//        obj = null;
        int3 = null;
        System.gc();
        try {
            Thread.sleep(2000);
            System.out.println("===== sleep 2s ======");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("obj = " + obj);
        System.out.println("obj2 = " + obj2);
        System.out.println("obj3 = " + int3);
        System.out.println("phObj = " + phObj.get());
        System.out.println("referenceQueue.poll().get()1 = " + referenceQueue.poll());
//        System.out.println("referenceQueue.poll().get()2 = " + referenceQueue.poll().get());

        obj2 = null;
        System.gc();
        try {
            Thread.sleep(500);
            System.out.println("===== sleep 0.5s ======");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("obj = " + obj);
        System.out.println("obj2 = " + obj2);
        System.out.println("phObj = " + phObj);
        System.out.println("phObj.get() = " + phObj.get());
        System.out.println("referenceQueue = " + referenceQueue.poll());
    }
}
