package pers.liam.jvm_learning;

public class T03_StackError {
    public static void main(String[] args) {
        System.out.println("111");
        m1();
        System.out.println("222");
    }

    private static void m1() {
        m1();
    }
}
