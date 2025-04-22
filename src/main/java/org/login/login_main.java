package org.login;

import java.util.Objects;
import java.util.Scanner;

public class login_main {
    // 定义存储
    private static class save_information {
        String Login_name = "XiaoNan";
        int Login_password = 123456;
    }

    // 引入save_information
    static save_information information = new save_information();

    public static void main(String[] args) {
        // 定义初始值
        int num = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("---------X Login System---------");

        System.out.println("[INFO] 请输入您的姓名：");
        String inPut_name = sc.nextLine();


        System.out.println("[INFO] 请输入您的密码：");
        int inPut_password = Integer.parseInt(sc.next());

//        int sum_num = 0;

        // 添加名字判断 正确 +1 不正确直接结束
        int name_sum = 0;
        if (inPut_name == login_main.information.Login_name) {
            name_sum = num + 1;
        } else {
            System.out.println("用户名错误！！！");
        }
        int password_sum = 0;
        if (inPut_password == new save_information().Login_password) {
            password_sum = num + 1;
        } else {
            System.out.println("密码错误！！！");
        }


        // 计算 sum_num 大于等于 2 则下一步
        int sum_num = name_sum + password_sum;
        if (sum_num >= 2) {
            System.out.println("登录成功！！！");
        }else {
            System.out.println("登录失败！！！");
        }


        String[] index = {"1.欢迎使用小楠登录系统","2.查看用户信息","3."};

        int sum = -0;
        while (sum <1 || sum > index.length){
            System.out.println("请选择您要操作的功能：");
            for (int i = 0; i < index.length; i++) {
                System.out.println(index[i]);
            }

        }

    }


}
