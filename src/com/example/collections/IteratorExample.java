package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);//output [Volvo, BMW, Ford, Mazda]
        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());//Volvo
        // Print the next item
        System.out.println(it.next());//BMW
        // Print the next item
        System.out.println(it.next());//Ford
        // Print the next item
        System.out.println(it.next());//Mazda
        it = cars.iterator();
        //Loop through while
        System.out.println("***************Loop through while***************");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
