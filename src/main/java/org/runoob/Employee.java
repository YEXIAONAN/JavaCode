package org.runoob;

import java.io.*;

public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;

    // Employee 类的构造器
    public Employee(String name) {
        this.name = name;
    }

    // 设置 age 的值
    public void setAge(int age) {
        this.age = age;
    }

    // 获取 age 的值
    public int getAge() {
        return age;
    }

    // 设置 designation 的值
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // 获取 designation 的值
    public String getDesignation() {
        return designation;
    }

    // 设置 salary 的值
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 获取 salary 的值
    public double getSalary() {
        return salary;
    }

    // 打印信息
    public void printEmployee() {
        System.out.println(this);
    }

    // 重写 toString 方法
    @Override
    public String toString() {
        return "名字: " + name + "\n" +
                "年龄: " + age + "\n" +
                "职位: " + designation + "\n" +
                "薪水: " + salary;
    }
}