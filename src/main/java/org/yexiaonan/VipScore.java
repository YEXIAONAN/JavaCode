package org.yexiaonan;

import java.util.Scanner;

public class VipScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("您好！商品总价是1000元，请输入您的会员等级：");
        int UserVip = scanner.nextInt();
        int ShopMoney = 1000;

        if (UserVip >=1 && UserVip <2){
            double Vip1 = ShopMoney * 0.9;
            System.out.println("检测到您的会员等级是Vip1级，为您打九折，您还需要付款：" + Vip1);
        }else if (UserVip >=2 && UserVip <3){
            double Vip2 = ShopMoney * 0.8;
            System.out.println("检测到您的会员等级是Vip2级，为您打八折，您还需要付款：" + Vip2);
        }else if (UserVip >=3 && UserVip <4){
            double Vip3 = ShopMoney * 0.7;
            System.out.println("检测到您的会员等级是Vip3级，为您打七折，您还需要付款：" + Vip3);
        }else {
            System.out.println("您不是Vip，没有享受到会员的权力，建议加入我们Vip!，您还需要付款：" + ShopMoney);
        }
    }
}
