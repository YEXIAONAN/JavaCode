package org.review;

public class FreshJuiceTest {
    public static void main(String[] args) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
    }
}

class FreshJuice {
    enum FreshJuiceSize {SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;
}