package org.code.develop.threading;

public class MyThread3 extends Thread{ 
  public static void main(String[] args) {
    MyThread3 thread = new MyThread3();

    thread.start();
    System.out.println("This code is outside of the thread");
  }

  public void run () {
    System.out.println("This code is outside of the thread");
  }

}
