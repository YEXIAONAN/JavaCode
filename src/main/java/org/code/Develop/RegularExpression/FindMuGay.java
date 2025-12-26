// 声明包名，表示该类属于 org.code.develop.RegularExpression 包
package org.code.Develop.RegularExpression;

// 导入 Java 正则表达式相关的类
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * FindMuGay 类用于演示如何使用 Java 正则表达式
 * 来在字符串中查找是否存在指定的模式。
 */
public class FindMuGay {

  // 主方法：程序入口点
  public static void main(String[] args) {
    
    // 创建一个正则表达式模式对象，匹配字符串 "MuGay"，忽略大小写
    Pattern pattern = Pattern.compile("MuGay", Pattern.CASE_INSENSITIVE);

    // 创建一个匹配器对象，用于在指定字符串中搜索 pattern 所定义的正则表达式
    Matcher matcher = pattern.matcher("I am MuGay!");

    // 尝试在字符串中查找是否存在匹配项
    boolean matchFound = matcher.find();

    // 根据查找结果输出匹配是否成功的信息
    if (matchFound) {
      System.out.println("Match Found!");  // 如果找到了匹配项，输出此信息
    } else {
      System.out.println("Match not Found!");  // 如果没有找到匹配项，输出此信息
    }
  }
}
