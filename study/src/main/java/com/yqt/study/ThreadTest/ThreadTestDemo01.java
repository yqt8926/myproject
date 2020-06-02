package com.yqt.study.ThreadTest;

/**
 * @description: 线程同步锁
 * @packagename: com.yqt.study.ThreadTest
 * @author: yuanqingtao
 * @date: 2020-05-18 12:40
 **/
public class ThreadTestDemo01 {

    synchronized static void methodA(){
        try {
            System.out.println("this is methodA");
            Thread.sleep(2000);
            System.out.println("this is methodA");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized static  void methodB(){
        try {
            System.out.println("this is methodB");
            Thread.sleep(2000);
            System.out.println("this is methodB");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodC() {
        try {
            synchronized (this) {
                System.out.println("this is methodC");
                Thread.sleep(1100);
                System.out.println("this is methodC");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodD() {
        try {
            synchronized (this) {
                System.out.println("this is methodD");
                Thread.sleep(1000);
                System.out.println("this is methodD");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
