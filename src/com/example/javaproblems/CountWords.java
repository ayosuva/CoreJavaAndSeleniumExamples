package com.example.javaproblems;

public class CountWords {
    public static void main(String[] args) {
        String str= "bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla bla";
        System.out.println(str.split(" ").length);
        System.out.println(str.split("\\s").length);

    }
}
