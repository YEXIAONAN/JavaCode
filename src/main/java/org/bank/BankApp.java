package org.bank;

// 导入 Java 的 Scanner 类，用于读取控制台输入
import java.util.Scanner;

/**
 * BankApp 是一个模拟银行账户操作的简易命令行应用。
 * 它允许用户执行以下操作：
 * - 存钱（Deposit）
 * - 取钱（Withdraw）
 * - 查询当前账户余额（Check Balance）
 * - 退出系统（Exit）
 */
public class BankApp {

    // 静态变量 balance 表示账户的余额，初始设为 10000 元
    // 使用 static 是为了让这个变量在整个类中保持共享状态，不需要创建对象即可访问
    private static double balance = 10000;

    /**
     * main 方法是 Java 程序的入口点。
     * 程序启动后会运行这个方法，进行用户交互。
     */
    public static void main(String[] args) {
        // 创建 Scanner 对象，用于从控制台读取用户输入
        Scanner scanner = new Scanner(System.in);

        // 控制程序运行状态的标志变量，true 表示程序继续运行
        boolean running = true;

        // 打印欢迎信息
        System.out.println("=== 欢迎使用简易银行系统 ===");

        // 主循环，程序会反复执行，直到用户选择退出
        while (running) {
            // 打印菜单选项，提示用户操作
            System.out.println("\n请选择操作：");
            System.out.println("1. 存钱 (Deposit)");
            System.out.println("2. 取钱 (Withdraw)");
            System.out.println("3. 查询余额 (Check Balance)");
            System.out.println("4. 退出 (Exit)");
            System.out.print("请输入选项 (1-4): ");

            // 读取用户输入的菜单编号，假设用户一定会输入合法的 int 类型
            int choice = scanner.nextInt();

            // 根据用户选择的编号，执行对应的功能逻辑
            switch (choice) {
                case 1:
                    // 执行存钱逻辑
                    deposit(scanner);
                    break;
                case 2:
                    // 执行取钱逻辑
                    withdraw(scanner);
                    break;
                case 3:
                    // 显示当前余额
                    checkBalance();
                    break;
                case 4:
                    // 用户选择退出，打印提示信息并结束循环
                    System.out.println("感谢使用，再见！");
                    running = false; // 设置标志为 false，主循环将终止
                    break;
                default:
                    // 用户输入非法数字，提示重新输入
                    System.out.println("无效选项，请重新输入！");
            }
        }

        // 释放 Scanner 占用的系统资源，良好的资源管理习惯
        scanner.close();
    }

    /**
     * 存钱操作：提示用户输入金额，更新余额
     * @param scanner 用于读取用户输入金额
     */
    private static void deposit(Scanner scanner) {
        System.out.print("请输入存入金额: ");
        // 读取用户输入的金额，类型为 double
        double amount = scanner.nextDouble();

        // 判断金额是否合法（必须大于 0）
        if (amount > 0) {
            // 将金额加到账户余额中
            balance += amount;
            // 打印操作成功提示及当前余额
            System.out.println("存入成功，当前余额为: " + balance);
        } else {
            // 如果金额为负或为 0，则输出错误提示
            System.out.println("金额必须大于 0！");
        }
    }

    /**
     * 取钱操作：提示用户输入金额，验证余额是否足够，并扣除金额
     * @param scanner 用于读取用户输入金额
     */
    private static void withdraw(Scanner scanner) {
        System.out.print("请输入取出金额: ");
        // 读取用户输入的取款金额
        double amount = scanner.nextDouble();

        // 检查输入金额是否合法（必须 > 0 且 <= 当前余额）
        if (amount > 0 && amount <= balance) {
            // 扣除余额
            balance -= amount;
            // 输出成功提示及剩余余额
            System.out.println("取出成功，当前余额为: " + balance);
        } else if (amount > balance) {
            // 用户试图提取超出当前余额的金额，输出错误提示
            System.out.println("余额不足，无法取出！");
        } else {
            // 用户输入了非法金额（如负数或 0）
            System.out.println("金额必须大于 0！");
        }
    }

    /**
     * 查询账户当前余额
     */
    private static void checkBalance() {
        // 显示当前账户余额
        System.out.println("当前余额为: " + balance);
    }
}
