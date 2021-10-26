package com.example.hw_01;

public class printColor {
    public static void main(String [] args){
        int value = -5;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <=100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }
}
