package com.yqt.study.ThreadTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 原子类测试
 * @packagename: com.yqt.study.ThreadTest
 * @author: yuanqingtao
 * @date: 2020-05-19 21:59
 **/
public class AtomicIntegerTest01 implements Runnable {
    static AtomicInteger instance = new AtomicInteger();

    //    static int i=0;
    @Override
    public void run() {
        for (int j = 0; j < 10000; j++) {
            instance.addAndGet(1);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new AtomicIntegerTest01(), "线程1");
        Thread thread2 = new Thread(new AtomicIntegerTest01(), "线程2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(instance);
    }
}
