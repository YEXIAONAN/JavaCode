package org.code.Develop.inheritance;

class OClass {
    int x = 10;
    class IClass {
        public int myInnerMethod(){
            return x;
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        // 创建外部类的访问对象
        OClass OC = new OClass();

        OClass.IClass OI = OC.new IClass();

        System.out.println(OI.myInnerMethod());
    }
}
