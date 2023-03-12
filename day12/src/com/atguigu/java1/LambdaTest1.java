package com.atguigu.java1;

import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest1 {
    @Test
    public void test1() {

        happyTime(111, new Consumer<Integer>() {
            @Override
            public void accept(Integer a) {
                System.out.println("abc"+ a);
            }
        });

    }
    @Test
    public void test2() {

        happyTime(123, money-> System.out.println("abc"+ money));

    }

    public void happyTime(Integer money, Consumer<Integer> con) {
        con.accept(money);
    }

    @Test
    public  void test3(){
        List<Employee> employees = Employee.getEmployees();
        Stream<Employee> employeeStream = employees.stream().filter(e -> e.getSalary() > 6000);
        employeeStream.forEach(System.out::println);
        List<Employee> collect = employees.stream().filter(e -> e.getSalary() > 6000).collect(Collectors.toList());
        System.out.println();
        System.out.println(collect);
        collect.forEach(System.out::println);

    }
//    @Test
//    public　 void test4(){
//        String testurl = System.getenv("LambdaTest1");
//        System.out.println(testurl);
//    }

    public static void main (String []agrs){
        String testurl = System.getenv("Test123");
        System.out.println(testurl);

    }
}

