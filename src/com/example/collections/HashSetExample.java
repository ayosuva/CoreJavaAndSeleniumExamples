package com.example.collections;

import java.util.HashSet;

/**
 * HashSet is a collection of items where every item is unique
 * Not index based collection
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");// it will be omitted as it is not unique
        cars.add("Mazda");
        System.out.println(cars);//output [Volvo, Mazda, Ford, BMW]
        System.out.println(cars.contains("Volvo"));//output true
        System.out.println(cars.contains("XXX"));//output false
        cars.remove("Volvo");// To remove
        System.out.println(cars);//output [Mazda, Ford, BMW]
        //For each loop iteration
        for (String car : cars) {
            System.out.println(car);//output Mazda, Ford, BMW
        }
        cars.clear();//To remove all items
    }
}
