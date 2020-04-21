package pers.liam.gc;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        System.out.println("....");
        String str = new String("");
        Random r = new Random();
        while(true){
            str = str + str + r.nextInt(101806400) + "123dfss";
        }
//        try{
//            Thread.sleep(Integer.MAX_VALUE);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
    }
}
