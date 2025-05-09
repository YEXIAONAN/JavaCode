package org.review;

// 调用枚举
public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    }
}
/*
这是一个枚举
 */
class FreshJuice {
    enum FreshJuiceSize {SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;
}