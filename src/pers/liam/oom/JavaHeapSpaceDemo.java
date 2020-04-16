package pers.liam.oom;

//-Xms10m -Xmx10m
public class JavaHeapSpaceDemo {
    public static void main(String[] args) {
        byte[] bytes = new byte[80*1024*1024];
    }
}
