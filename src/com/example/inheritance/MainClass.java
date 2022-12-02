package com.example.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.setName();
        Child2 child2 = new Child2();
        child2.setName();
        System.out.println(child1.name);
        System.out.println(child2.name);
    }
}
