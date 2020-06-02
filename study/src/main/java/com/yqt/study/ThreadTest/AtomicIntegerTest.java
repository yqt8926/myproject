package com.yqt.study.ThreadTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description: 原子类测试
 * @packagename: com.yqt.study.ThreadTest
 * @author: yuanqingtao
 * @date: 2020-05-19 21:59
 **/
public class AtomicIntegerTest {
    static AtomicInteger atomicInteger = new AtomicInteger();

    public static void main(String[] args) {
//        atomicInteger.addAndGet(1);
        System.out.println(atomicInteger.get());
        System.out.println(atomicInteger.addAndGet(1));
        System.out.println(atomicInteger.get());
    }
}
