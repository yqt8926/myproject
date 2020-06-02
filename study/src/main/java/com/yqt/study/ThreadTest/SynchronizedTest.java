package com.yqt.study.ThreadTest;

/**
 * @description: 线程锁测试
 * @packagename: com.yqt.study.ThreadTest
 * @author: yuanqingtao
 * @date: 2020-05-18 20:50
 **/
public class SynchronizedTest implements Runnable {
    static int i =0;
    @Override
    public void run() {
        for (int i = 0 ;i<10000;i++){
            increase();
        }
    }

    private synchronized void increase() {
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedTest synchronizedTest = new SynchronizedTest();
//        SynchronizedTest synchronizedTest1 = new SynchronizedTest();
        Thread thread1 = new Thread(synchronizedTest, "线程1");
        Thread thread2 = new Thread(synchronizedTest, "线程2");
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(i);
    }
}
