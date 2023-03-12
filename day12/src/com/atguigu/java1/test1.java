package com.atguigu.java1;
import java.lang.*;

import static java.lang.System.getenv;

public class test1 {
    public static void main (String []agrs){
        String test123 ="USERNAME";
        String testurl = getenv(test123);
        System.out.println(testurl);

    }

}
