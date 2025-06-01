package org.code.general;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOperator {
    public static void main(String[] args) {

        // 创建一个集合
        ArrayList<String> cars = new ArrayList<String>();

        // 向集合中添加数据
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // 获取迭代器
        Iterator<String> it = cars.iterator();

        // 打印第一项
        System.out.println(it.next());
    }
}
