package test;

import com.sun.xml.internal.ws.util.CompletedFuture;

import java.util.concurrent.CompletableFuture;

/**
 * @date 2022年03月21日15:23
 */
public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "执行");
        }, "t1");
        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "执行");
        }, "t2");
        Thread t3 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "执行");
        }, "t3");
        CompletableFuture.runAsync(()->t3.start()).thenRun(()->t2.start()).thenRun(()->t1.start());
    }
}
