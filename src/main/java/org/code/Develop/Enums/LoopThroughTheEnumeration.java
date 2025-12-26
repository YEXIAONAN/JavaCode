package org.code.Develop.Enums;

public class LoopThroughTheEnumeration {
    public static void main(String[] args) {
        for (Size mySize : Size.values()) {
            System.out.println(mySize);
        }
    }
}
