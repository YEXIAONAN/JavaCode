package org.code.General;

import java.util.ArrayList;

public class ArrayListFor {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("MuGay");
        cars.add("XiaoBa");
        cars.add("High");
        cars.add("SmallGay");

        for (int i = 0; i < cars.size();i++){
            System.out.println(cars.get(i));
        }

    }
}
