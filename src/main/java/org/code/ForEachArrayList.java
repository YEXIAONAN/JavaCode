package org.code;

import java.util.ArrayList;

public class ForEachArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("MuGay");
        cars.add("XiaoBa");
        cars.add("High");
        cars.add("SmallGay");

        for (String i : cars){
            System.out.println(i);
        }
    }
}
