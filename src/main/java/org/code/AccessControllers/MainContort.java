package org.code.AccessControllers;

public class MainContort {

    // 方法类
    private static class Main{

        public static void Print(boolean debug){
            System.out.println("Now loading class method.\n" +
                    "please waiting ......" +
                    " __  __       _        ____            _             _   \n" +
                    "|  \\/  | __ _(_)_ __  / ___|___  _ __ | |_ ___  _ __| |_ \n" +
                    "| |\\/| |/ _` | | '_ \\| |   / _ \\| '_ \\| __/ _ \\| '__| __|\n" +
                    "| |  | | (_| | | | | | |__| (_) | | | | || (_) | |  | |_ \n" +
                    "|_|  |_|\\__,_|_|_| |_|\\____\\___/|_| |_|\\__\\___/|_|   \\__|\n" +
                    "                                                         ");
            System.out.println("class method now load complete");
        }

    }


    // 调用方法
    public static void main(String[] args) {
        boolean debug = true;
        Main.Print(debug);

    }


}
