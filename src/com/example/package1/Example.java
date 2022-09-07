package com.example.package1;

public class Example {
    int a=1;
    int b=2;
    String str1="He";
    double _db=10.99;
    char _char ='a';
    boolean _bool=true;
    public static void main(String[] args) {
        System.out.println("Hello World");
        Example ex=new Example();//object
        ex.method1();
        String str2=ex.method2();
        System.out.println(str2);
        ex.method3("131231",10);

    }

    public void method1()
    {
        System.out.println("a+b:"+(a+b));
    }

    public String method2(){
        //block of code or statement
        return "Hello";
    }

    public void method3(String str1,int num){
        System.out.println(str1);
    }

    public static void method4()
    {
        System.out.println("a+b:");
    }

}
