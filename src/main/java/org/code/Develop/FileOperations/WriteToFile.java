package org.code.Develop.FileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("Text1.txt");
      myWriter.write("我是木棍");
      myWriter.close();
    }catch(IOException exception){
      System.out.println("Error!");
      exception.printStackTrace();
    }
  }
}
