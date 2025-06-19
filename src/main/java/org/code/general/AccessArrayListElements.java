package org.code.general;

import java.util.ArrayList;

public class AccessArrayListElements {
    public static void main(String[] args) {
        ArrayList<String> i = new ArrayList<String >();

        // 添加元素
        i.add("MUMu");
        i.add("MUGAY");

        // 删除元素
        i.remove(0);
        System.out.println(i);
    }
}
