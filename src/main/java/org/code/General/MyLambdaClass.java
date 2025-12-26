package org.code.General;

interface StringFunction {
  String run(String str);
  
}

public class MyLambdaClass {
  public static void main(String[] args) {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
  }

  public static void printFormatted(String str,StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }
}
