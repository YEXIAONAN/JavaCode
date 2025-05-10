package org.yexiaonan;

public class EmployeeTest {
    public static void main(String[] args) {
        // 使用构造器创建两个对象
        Employee empOne = new Employee("RUNOOB1");
        Employee empTwo = new Employee("RUNOOB2");

        // 调用这两个对象的成员方法
        empOne.setAge(26);
        empOne.setDesignation("高级程序员");
        empOne.setSalary(1000);
        empOne.printEmployee();

        empTwo.setAge(21);
        empTwo.setDesignation("菜鸟程序员");
        empTwo.setSalary(500);
        empTwo.printEmployee();
    }
}
