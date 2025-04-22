package org.login;

import java.util.Objects;
import java.util.Scanner;

public class login_main {
    // 定义存储
    private static class save_information {
        String Login_name = "XiaoNan";
        int Login_password = 123456;
    }


    public static void main(String[] args) {
        // 定义初始值
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("---------X Login System---------");

        System.out.println("[INFO] 请输入您的姓名：");
        String inPut_name = sc.nextLine();


        System.out.println("[INFO] 请输入您的密码：");
        int inPut_password = Integer.parseInt(sc.next());

        int sum_num = 0;

        // 添加名字判断 正确 +1 不正确直接结束
        if (Boolean.parseBoolean(String.valueOf(Objects.equals(inPut_name, new save_information().Login_name)))){
            int sum_num = num + 1;
        }else{
            System.out.println("用户名错误！！！");
        }if (inPut_password == new save_information().Login_password){
            int sum_num = num + 1;
        }else {
            System.out.println("密码错误！！！");
        }


        if (0x2 < sum_num) {
            return;
        }


//        String Change_Password = inPut_password;

        // Test Output user input name and password
//        System.out.println("[System] 用户输入名" + inPut_name);
//        System.out.println("[System] 用户输入密码" + inPut_password);
    }


}
