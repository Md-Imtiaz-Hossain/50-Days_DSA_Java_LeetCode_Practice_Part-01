package com.iimtiaz.string.easy;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.printf("Sum of 2 and 5 = " + new SimpleCalculator().add(2, 2));
    }

    public int add(int num1, int num2) {
        if (num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException("****");
        }
        return num1 + num2;
    }
}
