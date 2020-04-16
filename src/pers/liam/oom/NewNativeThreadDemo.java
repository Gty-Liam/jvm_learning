package pers.liam.oom;

public class NewNativeThreadDemo {
    public static void main(String[] args) {
        int count = 0;
        while (true){
            System.out.println("count: " + ++count);
            new Thread(()->{
                try {
                    Thread.sleep(Integer.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
