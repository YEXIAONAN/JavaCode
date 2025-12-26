package org.code.General;

import java.util.HashMap;

public class MyHashMapPeople {
  public static void main(String[] args) {
    
    // 创建HashMap对象
    HashMap<String,Integer> people = new HashMap<String,Integer>();
    
    // 添加键和值（Name，Age）
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    for(String i : people.keySet()){
      System.out.println("Key: " + i + " Value: " + people.get(i));
    }
  }
}
