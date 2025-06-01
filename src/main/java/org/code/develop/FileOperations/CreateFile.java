package org.code.develop.FileOperations; // 定义包名，用于组织类文件

import java.io.File;      // 导入 File 类，用于文件操作
import java.io.IOException; // 导入 IOException 异常类，用于处理文件操作可能抛出的异常

/**
 * CreateFile 类用于在当前工作目录下创建一个名为 test.txt 的文件
 */
public class CreateFile {
  public static void main(String[] args) {
    try {
      // 创建 File 对象，指定要创建的文件名（在当前工作目录下）
      File myObj = new File("test.txt");

      // 调用 createNewFile() 方法尝试创建文件
      // 如果文件不存在，将创建并返回 true；如果文件已存在，则返回 false
      if (myObj.createNewFile()) {
        System.out.println("文件创建成功：" + myObj.getName()); // 打印成功消息
      } else {
        System.out.println("文件创建失败，已存在"); // 打印文件已存在的提示
      }

    } catch (IOException e) {
      // 如果在创建文件过程中发生 I/O 异常，则输出错误信息并打印堆栈跟踪
      System.out.println("发生错误！");
      e.printStackTrace();
    }
  }
}
