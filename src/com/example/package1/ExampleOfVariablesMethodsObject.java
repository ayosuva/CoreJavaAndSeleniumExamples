package com.example.package1;

public class ExampleOfVariablesMethodsObject {//class declaration
    //Various data type and variables
    int a=1;
    int b=2;
    String str1="He";
    double _db=10.99;
    char _char ='a';
    boolean _bool=true;
    //main method
    public static void main(String[] args) {
        System.out.println("Hello World");
        ExampleOfVariablesMethodsObject ex=new ExampleOfVariablesMethodsObject();//object
        ex.method1();
        String str2=ex.method2();
        System.out.println(str2);
        ex.method3("131231",10);

    }
    //void method with 0 parameters
    public void method1()
    {
        System.out.println("a+b:"+(a+b));
    }
    //return method with 0 parameters
    public String method2(){
        //block of code or statement
        return "Hello";
    }
    //void method with 2 parameters
    public void method3(String str1,int num){
        System.out.println(str1);
    }
    //static method - don't need to create object to call the static method
    public static void method4()
    {
        System.out.println("a+b:");
    }

    //method overloading
    public void method3(int num1,int num2){
        System.out.println(num1);
    }



}
