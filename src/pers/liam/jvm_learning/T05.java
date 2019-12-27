package pers.liam.jvm_learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 制造OutOfMemoryError
 */
public class T05 {
    public static void main(String[] args) {
        String s = "abd";
        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();
//        List strList = new ArrayList();  //jvm竟然不爆  //**
        System.out.println("-Xmx: maxMemory: " + (maxMemory / 1024 / 1024) + " MB");
        System.out.println("-Xms: totalMemory: " + (totalMemory / 1024 / 1024) + " MB");

        String str = "Be Thou My Vision";
        Random r = new Random();
        while(true){
//            str += str + r.nextInt(10000000); //*
//            strList.add(new String(str + r.nextInt(10000000)));  // **
            new String(str + r.nextInt(10000000));
        }
    }
}
