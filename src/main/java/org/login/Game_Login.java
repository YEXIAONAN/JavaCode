package org.login;

public class Game_Login {
    public static void main(String[] args) {
        save_info info = new save_info();

        System.out.println(info.Name);
        System.out.println(info.age);
    }

    private static class save_info {
        String Name = "K";

        int age = 1;
    }
}
