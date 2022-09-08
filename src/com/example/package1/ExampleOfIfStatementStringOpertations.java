package com.example.package1;

public class ExampleOfIfStatementStringOpertations {
    static int a=0;
    static String str="Hello";
    static boolean _bool=false;
    public static void main(String[] args) {
        //if statement with int comparison
        if(a==0){
            System.out.println("a=0");
        }
        else if(a==1)
        {
            System.out.println("a=1");
        }
        else
        {
            System.out.println("a is something else");
        }
        //if statement with string comparison
        if(str.equals("Hello"))
        {
            System.out.println("str is Hello");
        }
        else
        {
            System.out.println("str is something else");
        }

        //if statement with boolean comparison
        if(_bool)
        {
            System.out.println("true");
        }
        else {
            System.out.println(_bool);

        }
        //useful string method
        str="I am the \"Vikings\" from the north.";
        System.out.println(str);
        str="I am the \\Vikings\\ from the north.";
        System.out.println(str);
        System.out.println(str.replace("\\",""));
        System.out.println(str.split( " ")[3]);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(3));
        System.out.println(str.contains("he"));
        System.out.println(str.endsWith("lo"));

        //Arithmetic operators
        int num1=10;
        int num2=20;
        int add=num1+num2;
        int sub=num1-num2;
        int mul=num1*num2;
        int div=num2/num1;
        System.out.println("num1+num2:"+add+"\nnum1-num2:"+Math.abs(sub)+"\nnum1*num2:"+mul+"\nnum2/num1:"+div);



    }
}
