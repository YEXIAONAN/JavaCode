package org.code.develop.Enums;

enum Size {
    LOW,
    MEDIUM,
    HIGH
}

public class SwitchEnum {
    public static void main(String[] args) {
        Size mySize = Size.HIGH;

        switch (mySize){
            case LOW :
                System.out.println("Low Size");
                break;
            case MEDIUM:
                System.out.println("MEDIUM Size");
                break;
            case HIGH:
                System.out.println("you are so high!");
                break;
        }
    }
}
