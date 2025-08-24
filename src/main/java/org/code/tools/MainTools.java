package org.code.tools;

public class MainTools {

    // Debug Mode
    private static boolean debug = true;

    public static void setDebug(boolean flag){
        debug = flag;
    }

    // Tools 字符拼接操作
    public static String TextContext(String input_1, String input_2){
        if(debug){
            System.out.println("【小楠Tools】你调用了 字符拼接 方法.");
        }
        return input_1 + input_2;
    }

    // Tools 输出作者信息
    public static class XNInfomation {
        public static void printAuthor(){
            System.out.println("【小楠Tools - 作者信息】");
            System.out.println("            -by yexiaonan");
        }
    }
}
