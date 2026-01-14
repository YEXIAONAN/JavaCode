package org.code.Object_Oriented;

public class Student {

    String name;

    void SetStudentName(String name) {
        this.name = name;
    }

    void PrintInformation() {
        // 输出 Waiting / 等价于 Student.name
//        System.out.println(name);

        //
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.SetStudentName("new Name!");
        s.PrintInformation();
    }
}