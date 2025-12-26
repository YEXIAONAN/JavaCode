package org.code.Develop.threading;

public class MyThread5 extends Thread{
  public static int amount = 0;

  public static void main(String[] args) {
    MyThread5 thread  = new MyThread5();

    thread.start();

    System.out.println(amount);

    amount++;

    System.out.println(amount);
  }

  public void run() {
    amount++;
  }
}
