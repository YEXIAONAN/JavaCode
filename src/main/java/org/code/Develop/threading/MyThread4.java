package org.code.Develop.threading;

public class MyThread4 implements Runnable{
  public static void main(String[] args) {
    MyThread4 obj = new MyThread4();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }

  public void run () {
    System.out.println("This code is outside of the thread");
  }

}
