package org.yexiaonan;

public class ConnectGames {
    public static void main(String[] args) {
        // 书写一段代码，表示玩家在掉线重连，代码执行五次
        for (int errorcode = 1; errorcode <= 5; errorcode++){
            System.out.println("您好，监测到您的网络波动，正在尝试为您重连第：" + errorcode + " 次");
        }
    }
}
