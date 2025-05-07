package org.test;

import java.util.Arrays;

public class ObjectAS {
    // 这是一个封装好的(String)方法，运行项目内调用。
    // 测试封装方法A
    String tString;

    // 字符串类型的数组
    String[] STR_INT;

    public void tPrintInfo (){
        System.out.println("调用ObjectAS测试方法成功！");
        System.out.println("debugOutput : ");
        System.out.println("Object String : " + tString);

        System.out.println("Object String[] : " + Arrays.toString(STR_INT));
    }


}
