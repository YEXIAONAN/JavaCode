package org.code.General;

import java.util.ArrayList;
import java.util.Iterator;

public class DeleteItemsFromSet {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // 向集合中添加数据
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        // 创建迭代器
        Iterator<Integer> it = numbers.iterator();

        // 使用while删除数据
        while (it.hasNext()){
            Integer i = it.next();
            if (i < 10) {
                it.remove();
            }
        }

        System.out.println(numbers);

    }
}
