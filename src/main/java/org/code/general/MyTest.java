package org.code.general;

public class MyTest {

    public class myNewClass{
        private static String print(){
            return "Output text";
        }
    }

    public static void main(String[] args) {
        System.out.println(myNewClass.print());
    }
}
