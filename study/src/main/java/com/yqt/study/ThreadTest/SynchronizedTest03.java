package com.yqt.study.ThreadTest;

/**
 * @description: 线程锁测试
 * @packagename: com.yqt.study.ThreadTest
 * @author: yuanqingtao
 * @date: 2020-05-18 20:50
 **/
public class SynchronizedTest03 implements Runnable {
    static int i =0;
    @Override
    public void run() {
        for (int i = 0 ;i<10000;i++){
            increase();
        }
    }

    private static synchronized void increase() {
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest03 synchronizedTest = new SynchronizedTest03();
//        SynchronizedTest03 synchronizedTest1 = new SynchronizedTest03();
        Thread thread1 = new Thread(synchronizedTest, "线程1");
        Thread thread2 = new Thread(synchronizedTest, "线程2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(i);
    }
}
