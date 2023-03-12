package com.atguigu.java1;

import org.junit.Test;

public class LambdaTest {
    @Test
    public void test1() {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("123");
            }
        };
        r1.run();
        System.out.println("=========================");
        Runnable r2 = () -> System.out.println("abc");
        r2.run();
//111
//tst st
    }
}
