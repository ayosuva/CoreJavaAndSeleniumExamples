package com.example.package1;

public class Example2 {
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




    }
}
