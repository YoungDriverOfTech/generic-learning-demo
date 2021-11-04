package com.interview.demo.generic;

public class GenericMethod {

    /**
     * <E> 指明了泛型方法的返回值
     * void 真正的返回值，也可以协程E
     * E[] inputArray 泛型方法的参数类型
     *
     * */
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // 创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        printArray(intArray);
        printArray(stringArray);
    }
}
