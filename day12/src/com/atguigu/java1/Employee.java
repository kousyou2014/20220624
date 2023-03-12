package com.atguigu.java1;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    String name;
    int age;
    double salary;
    String a;

    public Employee() {
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public static List<Employee> getEmployees(){
     List<Employee> list = new ArrayList<>();
        list.add(new Employee(1001,"a",20,5000));
        list.add(new Employee(1002,"b",21,6000));
        list.add(new Employee(1003,"c",22,7000));
        list.add(new Employee(1004,"d",23,8000));
        list.add(new Employee(1005,"e",24,9000));


        return list;
    }
}
