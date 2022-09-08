package com.example.package1;

public class Class1 {
    public int a=1;//public accessible for all classes
    private int b=2;//private only accessible within the declared class
    int c=3;//default only accessible within the same package.
    protected int d=4;//protected accessible within the same package and subclass. if it extends using inheritance then it can be accessed outside the package
    public static void main(String[] args) {
        Class1 c1=new Class1();//object
        System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);
        System.out.println(c1.d);

    }

    public void method(){

    }
    protected  void method1(){

    }
}
