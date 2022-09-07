package com.example.package2;

import com.example.package1.Class1;

public class Class3 {
    public static void main(String[] args) {
        Class1 c1=new Class1();
        System.out.println(c1.a);
        //System.out.println(c1.b);//can't be accessed as b is private variable
        //System.out.println(c1.c);//default modifiers can't be accessed outside package
        //System.out.println(c1.d);//protected modifiers can't be accessed outside package
    }
}
