package org.login;

import java.util.Random;
import java.util.Scanner;

public class ChooseHeroGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 定义英雄列表和对应的技能描述
        String[] heroes = {
                "1. 剑圣 (Blade master) - 技能：旋风斩",
                "2. 火女 (Lina) - 技能：烈焰冲击",
                "3. 幽鬼 (Spectre) - 技能：痛苦之刃",
                "4. 痛苦女王 (Queen of Pain) - 技能：尖叫"
        };

        // 英雄背景
        String[] heroBackgrounds = {
                "剑圣：他是一个武器大师，精通剑术，速度如风。",
                "火女：她掌握着强大的火焰魔法，能够摧毁一切敌人。",
                "幽鬼：她来自死亡的国度，擅长快速击杀敌人。",
                "痛苦女王：她是一个冷血的刺客，尖叫能摧毁一切敌人的精神。"
        };

        // 定义一些表情包
        String[] expressions = {
                ":)", ":D", ":(", ";)", "o_O"
        };

        int choice = -1;
        Random random = new Random();

        while (choice < 1 || choice > heroes.length) {
            System.out.println("=== 欢迎来到英雄选择界面 ===");
            System.out.println("请选择您的英雄：");

            // 重复显示英雄列表
            for (String hero : heroes) {
                System.out.println(hero);
            }

            // 加入随机选择功能
            System.out.println("5. 随机选择英雄 🌀");

            System.out.print("请输入对应的编号（1-" + (heroes.length + 1) + "）：");
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
            } else {
                sc.next(); // 清除无效输入
                System.out.println("[警告] 请输入数字！");
            }

            if (choice < 1 || choice > heroes.length + 1) {
                System.out.println("[提示] 无效的选择，请重新输入！");
            }
        }

        // 如果选择了随机英雄
        if (choice == heroes.length + 1) {
            choice = random.nextInt(heroes.length) + 1;
            System.out.println("[INFO] 随机选择了英雄 " + heroes[choice - 1]);
            System.out.println("表情反馈：" + expressions[random.nextInt(expressions.length)]);
        }

        System.out.println("\n您选择的英雄是：" + heroes[choice - 1]);
        System.out.println("背景介绍：" + heroBackgrounds[choice - 1]);
        System.out.println("表情反馈：" + expressions[random.nextInt(expressions.length)]);
    }
}
