package org.yexiaonan;

/**
 * 需求：
 *  BankSystem：
 *      属性：有多少钱
 *      行为：
 *          put：支持用户存钱
 *              返回值：
 *              --boolean（布尔返回值类型【True：存钱成功，False：存钱失败】）
 *              --int （数字判断类型【1：存钱成功，False：存钱失败】）
 *              --void （可以在程序中写好对应的返回类型）
 *
 *              参数：
 *              --存储了多少钱
 *          get：支持用户取钱
 *              返回值：
 *              --int（成功取出多少钱）
 *
 *              参数：
 *              --int（你想取出多少钱）
 *  User:
 *      行为：
 *          put：存钱
 *          get：取钱
 *  APP：
 *      模拟用户存钱和取钱的一个过程
 *
 *  1，代码要写对
 *  2，代码要合理（程序世界映射到现实世界）
 *  3，代码要有健壮性（设计模式  23种） ---
 */

public class BankSystem {
    // 取款机里面现在有10w元
    private static int money = 1000000;    // 11w
    public static void put(int money){
        System.out.println("【小楠Bank】存钱成功！") ;
        BankSystem.money = BankSystem.money + money;

    }

    public static void get(int money) {
        if (BankSystem.money > money){
            BankSystem.money = BankSystem.money - money;
            System.out.println("【小楠Bank】取钱成功");
        }else {
            System.out.println("【小楠Bank】取钱失败qwq，当前取款机没那么钱");
        }

    }

    public static int getBankSystemMoney(String password) {
        if (password.equals("123456")) {
            return BankSystem.money;
        } else {
            System.out.println("您不是系统管理员，无法查看系统存储多少钱");
            return -1;
        }
    }
}

/*
1.一个类里面如果没有显示的声明无参数构造方法的话，那么系统会自动生成一个无参数的构造方法
2.如果在一个类里面显示的声明了一个有参数的构造方法，那么无参数的构造方法系统不会自动生成
3.在类里面声明一个有参数的构造方法的话，那么无参数的构造方法的话要自动不全
 */

// 默认的，我们在声明一个类的时候系统会给我们一个无参数的构造方法
class User{
    String name = "";
    int age = 0;

    // 无参数的构造方法
    public User(){
    }

    // 有参数的构造方法
    public User(String name,int age){
    }

    // 参数money要取出多少钱
    public void get(int money){
        // 用户取钱需要找取款机，取钱
        BankSystem.get(money);
    }

    public void put(int money){
        // 存钱
        BankSystem.put(money);

    }

    public int getBankSystemMoney(String password) {
        return BankSystem.getBankSystemMoney(password);
    }
//        if (password.equals("123456")) {
//            return BankSystem.money;
//        } else {
//            System.out.println("您不是系统管理员，无法查看系统存储多少钱");
//            return -1;
//        }
//
}


/*
 * 访问修饰符：public 四种访问修饰符
 *   --public
 *   --private
 * */


class App{
    public static void main(String[] args) {
        User user = new User();
        user.put(10);
        user.get(100);
        int bankSystemMoney = user.getBankSystemMoney("12345");
        System.out.println(bankSystemMoney);
    }
}
