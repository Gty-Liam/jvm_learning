package pers.liam.jvm_learning;

public class T04 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors()); // 查询核数

        long maxMemory = Runtime.getRuntime().maxMemory();
        long totalMemory = Runtime.getRuntime().totalMemory();

        System.out.println("-Xmx: maxMemory: " + (maxMemory / 1024 / 1024) + " MB");
        System.out.println("-Xms: totalMemory: " + (totalMemory / 1024 / 1024) + " MB");
    }
}
