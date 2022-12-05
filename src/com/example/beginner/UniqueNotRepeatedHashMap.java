package com.example.beginner;

import java.util.HashMap;
import java.util.Map;

public class UniqueNotRepeatedHashMap {
    static void occurredOnce(int[] arr, int n)
    {
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Store all the elements in the map with
        // their occurrence
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
                mp.put(arr[i], 1 + mp.get(arr[i]));
            else
                mp.put(arr[i], 1);
        }

        // Traverse the map and print all the elements with occurrence 1
        for (Map.Entry entry : mp.entrySet())
        {
            if (Integer.parseInt(String.valueOf(entry.getValue())) == 1)
                System.out.println(entry.getKey() + " ");
        }

        for(int i: mp.keySet())
        {
            if(mp.get(i)==1)
            {
                System.out.println(i);
            }
        }
    }

    // Driver code
    public static void main(String args[])
    {
        int[] arr = { 2, 4, 5, 2, 4};
        int n = arr.length;

        occurredOnce(arr, n);
    }
}
