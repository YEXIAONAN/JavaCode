package org.code.General;

import java.util.HashMap;


public class CapitalCitiesClass {
  public static void main(String[] args) {
    // 创建HashMap对象
    HashMap<String,String> CapitalCities = new HashMap<String,String>();

    // 添加键和值 (Country, City)
    CapitalCities.put("England", "London");
    CapitalCities.put("Germany", "Berlin");
    CapitalCities.put("Norway", "Oslo");
    CapitalCities.put("USA", "Washington DC");

    // // 打印 keys
    // for (String i : CapitalCities.keySet()) {
    //   System.out.println(i);
    // }

    // // 打印 values
    // for(String i : CapitalCities.values()) {
    //   System.out.println(i);
    // }

    for(String i : CapitalCities.keySet()){
      System.out.println("Key: " + i + "Value: " + CapitalCities.values());
    }
  }
}
