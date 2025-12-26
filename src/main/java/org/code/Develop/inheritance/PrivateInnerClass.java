package org.code.Develop.inheritance;

class OutClass {
    int x = 9;
    private class InnerClass {
        int y = 1;
    }
}

public class PrivateInnerClass {
    public static void main(String[] args) {
        OutClass out = new OutClass();

        // 将上方的内部类修改为`private`编译器会立即报错，因为无法访问到
//        OutClass.InnerClass outInner = out.new InnerClass();

//        System.out.println(out.x + outInner.y);
    }
}
