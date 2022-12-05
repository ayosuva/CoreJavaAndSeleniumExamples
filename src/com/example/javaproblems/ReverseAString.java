package com.example.javaproblems;

public class ReverseAString {
    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);

        String revString="";
        for (int i = originalStr.length()-1; i >= 0; i--) {
            revString = revString + originalStr.charAt(i);
        }
        System.out.println("Reversed string: "+revString);

    }
}
