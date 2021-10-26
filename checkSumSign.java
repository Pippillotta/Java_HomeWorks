package com.example.hw_01;

public class checkSumSign {
    public static void main (String [] args){
        int a = -4;
        int b = -3;
        a+=b;
        if (a+b > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
