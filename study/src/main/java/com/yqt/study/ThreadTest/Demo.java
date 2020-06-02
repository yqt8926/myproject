package com.yqt.study.ThreadTest;

/**
 * @description: 测试类
 * @packagename: com.yqt.study.ThreadTest
 * @author: yuanqingtao
 * @date: 2020-05-18 12:45
 **/
public class Demo {

    public static void main(String[] args) {
//        new Thread(()->{
//            ThreadTestDemo01.methodA();
//        },"线程1").start();
//
//        new Thread(()->{
//            ThreadTestDemo01.methodB();
//        },"线程2").start();
        ThreadTestDemo01 threadTestDemo01 = new ThreadTestDemo01();
        ThreadTestDemo01 threadTestDemo02 = new ThreadTestDemo01();
        new Thread(()->{
            threadTestDemo01.methodC();
        },"线程3").start();
        new Thread(()->{
            threadTestDemo01.methodD();
        },"线程3").start();
    }
}
