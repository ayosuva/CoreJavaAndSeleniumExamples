package com.qualitest.package1;

public class Class1 {
    public int a=1;//anywhere
    private int b=2;//within the current class
    int c=3;//within the package
    protected int d=4;//within the package
    public static void main(String[] args) {
        Class1 c1=new Class1();
        System.out.println(c1.a);
        System.out.println(c1.b);
        System.out.println(c1.c);
        System.out.println(c1.d);

    }
}
