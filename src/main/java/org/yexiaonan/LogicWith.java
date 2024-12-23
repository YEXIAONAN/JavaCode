package org.yexiaonan;

public class LogicWith {
    public static void main(String[] args) {
        // 1.& 并且
        // 两边都为真，结果才为真
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true & false);
        System.out.println(false & true);

        System.out.println("--------------");

        // 2. | 或者
        // 两边都为假，结果才为假（只要有一个真，结果就是真）
        System.out.println(true | true);
        System.out.println(false | false);
        System.out.println(true | false);
        System.out.println(false | true);

        System.out.println("--------------");

        // 3. ^ 逻辑异或
        // 相同为false，不同为true
        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        System.out.println("--------------");

        // 4. ！ 逻辑非  取反
        // 取反的感叹号不要写多个，要么不写，要么只写一次
        System.out.println(!false);
        System.out.println(!true);
    }
}
