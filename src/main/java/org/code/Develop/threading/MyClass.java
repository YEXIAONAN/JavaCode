package org.code.Develop.threading;

public class MyClass extends Thread {
  public static int amount = 0;

  public static void main(String[] args) {
    MyClass thread = new MyClass();
    thread.start();
    // 等待线程完成
    while(thread.isAlive()) {
    System.out.println("Waiting...");
  }
  // 更新 amount 并打印其值
  System.out.println("Main: " + amount);
  amount++;
  System.out.println("Main: " + amount);
  }
  public void run() {
    amount++;
  }
}