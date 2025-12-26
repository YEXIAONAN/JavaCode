package org.code.Develop.VerAPI;

import org.code.Tools.MainTools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerAPI {

    public static void main(String[] args) throws IOException {
        // 使用Bf获取用户输入，适合
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String in_1 = br.readLine();

        String in_2 = br.readLine();

        System.out.println(MainTools.TextMatching(in_1,in_2));


    }
}
