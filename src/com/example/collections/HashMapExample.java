package com.example.collections;

import java.util.HashMap;

/**
 * A HashMap store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
 * One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values,
 * or the same type, like: String keys and String values:
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        //Output: {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
        System.out.println(capitalCities.get("England"));//London
        capitalCities.remove("England");
        System.out.println(capitalCities);//{USA=Washington DC, Norway=Oslo, Germany=Berlin}

        System.out.println(capitalCities.size()); //0 Size of the HashMap
        //print keys
        for (String key : capitalCities.keySet())
        {
            System.out.println(key);
        }
        //print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        //print keys and values
        for (String key : capitalCities.keySet())
        {
            System.out.println(key + " -> " + capitalCities.get(key));
        }
        capitalCities.clear();// To remove all items
    }
}
