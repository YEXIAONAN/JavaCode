package org.code.AccessControllers;

public class Test1 {

    public static class Print{
        public static boolean Info(){
            System.out.println("" +
                    "////////////////////////////////////////////////////////////////////\n" +
                    "//                          _ooOoo_                               //\n" +
                    "//                         o8888888o                              //\n" +
                    "//                         88\" . \"88                              //\n" +
                    "//                         (| ^_^ |)                              //\n" +
                    "//                         O\\  =  /O                              //\n" +
                    "//                      ____/`---'\\____                           //\n" +
                    "//                    .'  \\\\|     |//  `.                         //\n" +
                    "//                   /  \\\\|||  :  |||//  \\                        //\n" +
                    "//                  /  _||||| -:- |||||-  \\                       //\n" +
                    "//                  |   | \\\\\\  -  /// |   |                       //\n" +
                    "//                  | \\_|  ''\\---/''  |   |                       //\n" +
                    "//                  \\  .-\\__  `-`  ___/-. /                       //\n" +
                    "//                ___`. .'  /--.--\\  `. . ___                     //\n" +
                    "//              .\"\" '<  `.___\\_<|>_/___.'  >'\"\".                  //\n" +
                    "//            | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |                 //\n" +
                    "//            \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /                 //\n" +
                    "//      ========`-.____`-.___\\_____/___.-`____.-'========         //\n" +
                    "//                           `=---='                              //\n" +
                    "//      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //\n" +
                    "//         佛祖保佑       永无BUG     永不修改                       //\n" +
                    "////////////////////////////////////////////////////////////////////");
            return false;
        }


    }
    public static void main(String[] args) {
        NoticeClass cs = new NoticeClass();

        System.out.println(Print.Info());
        System.out.println();

        System.out.println(cs.TestNotice());


    }

    public static class NoticeClass {
        public String TestNotice() {
            return "Class Be Used";
        }
    }


}
