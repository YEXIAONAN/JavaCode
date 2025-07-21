package org.code.general;

public class GenericMethodTest {
    // 定义一个泛型对象
    public static < E > void printArray(E [] inputArray){
        // 遍历输入的泛型对象
        for (E element : inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    // Main方法
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'H','M','G','A'};

        // 调用泛型方法
        printArray( intArray );
        printArray( doubleArray );
        printArray( charArray );
    }
}

