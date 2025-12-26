package org.code.General;

public class IfThrow {
  static void checkAge(int age) {
    if (age < 18) {
      throw new ArithmeticException("访问拒绝 - 未满18岁！");
    } else {
      System.out.println("访问允许！");
    }
  }

  public static void main(String[] args) {
    checkAge(1);
  }
}
