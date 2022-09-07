package com.example.package1;

public class Class2 {
    public static void main(String[] args) {
        Class1 c1=new Class1();
        System.out.println(c1.a);
        //System.out.println(c1.b); //can't be accessed as b is private variable
        System.out.println(c1.c);
        System.out.println(c1.d);
    }
}
