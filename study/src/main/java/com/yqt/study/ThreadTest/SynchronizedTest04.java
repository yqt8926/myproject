package com.yqt.study.ThreadTest;

/**
 * @description: 线程锁测试
 * @packagename: com.yqt.study.ThreadTest
 * @author: yuanqingtao
 * @date: 2020-05-18 20:50
 **/
public class SynchronizedTest04 implements Runnable {
    static SynchronizedTest04 instance=new SynchronizedTest04();
    static int i=0;
    @Override
    public void run() {
        synchronized (instance) {
            for (int j = 0; j < 10000; j++) {
                i++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new SynchronizedTest04(), "线程1");
        Thread thread2 = new Thread(new SynchronizedTest04(), "线程2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(i);
    }
}
