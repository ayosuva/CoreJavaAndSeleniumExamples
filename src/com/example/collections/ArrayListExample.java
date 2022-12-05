package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The ArrayList class is a resizable array, which can be found in the java.util package.
 * <p>
 * The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified
 * (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added
 * and removed from an ArrayList whenever you want.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList is an Ordered list
        //ArrayList<String> list = new ArrayList<>();
        List<String> list = new ArrayList<>();

        list.add("Volvo");
        list.add("BMW");
        list.add("Ford");
        list.add("Mazda");
        System.out.println(list);//[Volvo, BMW, Ford, Mazda]
        System.out.println(list.get(0));//volvo - Gets value of index 0
        System.out.println(list.indexOf("Volvo"));//0 - index of an element
        System.out.println(list.size());//4 Size of ArrayList
        System.out.println(list.remove("Volvo"));//Removes value of index 0
        System.out.println(list.size());//3 Size of ArrayList
        System.out.println(list.set(0, "Volvo"));//it changes/replaces value of index 0
        System.out.println(list.contains("Volvo"));//true  if it is there in the List
        System.out.println(list);//[Volvo, Ford, Mazda]

        //Loop through the list
        System.out.println("************************************For loop iteration****************************************");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // For each loop iteration
        System.out.println("************************************For each loop iteration****************************************");
        for (String name : list) {
            System.out.println(name);
        }
        // Sort an ArrayList
        System.out.println("************************************Sort an ArrayList****************************************");
        Collections.sort(list);
        for (String name : list) {
            System.out.println(name);
        }
        //Output: Ford Mazda Volvo
        list.clear();//To remove all the elements in the ArrayList

    }
}
