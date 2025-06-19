package org.code.develop.Modifier;

public class MyFinal {
  final String name = "MuGay";
  final int x = 91;

  public static void main(String[] args) {
    MyFinal MF = new MyFinal();

    // 如果尝试重新定义一个本来就是final类型的变量，编译器会报错
    //MF.x =50;
    System.out.println(MF.name);
    System.out.println(MF.x);
  }
}
