package pers.liam.oom;

public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        stackOverflow();
    }

    private static void stackOverflow(){
        stackOverflow();
    }
}
