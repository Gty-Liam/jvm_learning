package pers.liam.oom;

import java.nio.ByteBuffer;

//-XX:MaxDirectMemorySize=5m
public class DirectBufferMemoryDemo {
    public static void main(String[] args) {
        System.out.println("最大堆外内存：" + (sun.misc.VM.maxDirectMemory() / 1024.0 / 1024.0));
        try {
            Thread.sleep(1000);
            System.out.println("====== sleep 1000ms =====");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(10 * 1024 * 1024);
    }
}
