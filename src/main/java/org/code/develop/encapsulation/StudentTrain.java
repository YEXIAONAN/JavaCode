package org.code.develop.encapsulation;

public class StudentTrain {
    private int age;

    public int getAge(){ // Getter方法
        return age;
    }

    public void setAge(int newAge){
        if (age < 0){
            throw new IllegalArgumentException("年龄不能为负数！");
        }
        this.age = newAge;
    }

    public static void main(String[] args) {
        StudentTrain ST = new StudentTrain();

        // 设置结果为18
        ST.setAge(-1);
        // 从Getter获取结果
        System.out.println(ST.getAge());



    }
}
