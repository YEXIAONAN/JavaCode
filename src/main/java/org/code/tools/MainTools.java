package org.code.tools;

public class MainTools {

    // Debug Mode
    private static boolean debug = true;

    public static void setDebug(boolean flag){
        debug = flag;
    }

    // Tools 字符拼接操作
    public static String TextContext(String input_1, String input_2){
        String TextContent = "字符拼接";
        if(debug){
            System.out.println("【小楠Tools】你调用了 " + TextContent + " 方法.");
        }
        return input_1 + input_2;
    }

    // Tools 传递两个参数进行匹配
    public static String TextMatching(String input_1, String input_2){
        String TextMatchingName = "参数匹配";
        if (debug){
            System.out.println("【小楠Tools】你调用了 " + TextMatchingName + " 方法.");
        }

        if (input_1.equals(input_2)){
            return "【小楠Tools】 匹配成功！";
        }else {
            return "【小楠Tools】 匹配失败！";
        }
    }

    // Tools 输出作者信息
    public static class XNInfomation {
        public static String printAuthor(){
         return """
                【小楠Tools】 - v1
                """;
        }
    }
}
