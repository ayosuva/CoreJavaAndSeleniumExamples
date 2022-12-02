package com.example.collections;

import java.util.Collections;
import java.util.LinkedList;

/**
 * The LinkedList class is almost identical to the ArrayList
 * The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface.
 * This means that you can add items, change items, remove items and clear the list in the same way.
 * <p>
 * However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.
 * The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not
 * big enough, a new, larger array is created to replace the old one and the old one is removed.
 * The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to
 * the next container in the list. To add an element to the list, the element is placed into a new container and that container
 * is linked to one of the other containers in the list.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Volvo");
        list.add("BMW");
        list.add("Ford");
        list.add("Mazda");
        System.out.println(list);//[Volvo, BMW, Ford, Mazda]
        System.out.println(list.get(0));//volvo - Gets value of index 0
        System.out.println(list.size());//4 Size of ArrayList
        System.out.println(list.remove("Volvo"));//Removes value of index 0
        System.out.println(list.size());//3 Size of ArrayList
        System.out.println(list.set(0, "Volvo"));//it replaces value of index 0
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
        //LinkedList methods
        System.out.println("************************************addFirst()****************************************");
        list.addFirst("addFirst");
        System.out.println(list);
        //Output: [addFirst, Ford, Mazda, Volvo]
        System.out.println("************************************addLast()****************************************");
        list.addLast("addLast");
        System.out.println(list);
        //Output: [addFirst, Ford, Mazda, Volvo, addLast]
        System.out.println("************************************removeFirst()****************************************");
        list.removeFirst();
        System.out.println(list);
        //Output: [ Ford, Mazda, Volvo, addLast]
        System.out.println("************************************removeLast()****************************************");
        list.removeLast();
        System.out.println(list);
        //Output: [Ford, Mazda, Volvo]
        System.out.println("************************************getFirst()****************************************");
        System.out.println(list.getFirst());
        //Output: Ford
        System.out.println("************************************removeLast()****************************************");
        System.out.println(list.getLast());
        //Output: Volvo
        list.clear();//To remove all the elements in the ArrayList



    }
}
