package com.example.beginner;

public class ShortHandIfElse {
    public static void main(String[] args) {
        System.out.println("Hello World");
        if (true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //shortHandIfElse
        String result= (true) ? "true" :"false";
        System.out.println(result);
    }
}
