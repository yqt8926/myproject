package com.yqt.study.ThreadTest;

/**
 * @description: 同步锁测试
 * @packagename: com.yqt.study.ThreadTest
 * @author: yuanqingtao
 * @date: 2020-05-18 21:08
 **/
public class SynchronizedTest02 {
    public synchronized void method1() {
        System.out.println("Method 1 start");
        try {
            System.out.println("Method 1 execute");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 1 end");
    }

    public synchronized void method2() {
        System.out.println("Method 2 start");
        try {
            System.out.println("Method 2 execute");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Method 2 end");
    }

    public static void main(String[] args) {
        final SynchronizedTest02 test = new SynchronizedTest02();
        final SynchronizedTest02 test1 = new SynchronizedTest02();
        new Thread(test::method1).start();

        new Thread(test1::method2).start();
    }
}
