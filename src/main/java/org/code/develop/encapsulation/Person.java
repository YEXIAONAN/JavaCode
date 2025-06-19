package org.code.develop.encapsulation;

// Person类，用于表示一个人的信息
// 这里体现了封装的概念，将数据（如name）隐藏起来，通过公共的方法（getter和setter）来访问和修改
public class Person {
    // 私有属性name，用于存储人的名字
    // 使用private修饰符，将其封装起来，外部类不能直接访问
    private String name;

    // Getter方法，用于获取name属性的值
    // 外部类可以通过调用这个方法来获取name的值，而不是直接访问私有属性
    public String getName() {
        return name;
    }

    // Setter方法，用于设置name属性的值
    // 外部类可以通过调用这个方法来设置name的值，并且可以在方法内部添加一些逻辑来验证或处理新的值
    // 例如，可以在这里添加对新名字的长度限制等验证逻辑
    public void setName(String newName) {
        this.name = newName;
    }
}