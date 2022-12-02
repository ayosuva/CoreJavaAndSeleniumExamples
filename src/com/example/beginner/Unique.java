package com.example.beginner;

import java.util.HashMap;
import java.util.Map;

class Unique {

    public static void main(String args[])
    {
        int[] arr = { 2, 4, 5, 2, 4};
        int n = arr.length;

        System.out.println(solution(arr));
    }

    public static int solution(int[] A) {
        for(int i=0;i<A.length;i++) {
            int memberCount=0;
            int member= A[i];
            for(int j=0;j<A.length;j++)
            {
                if(member==A[j])
                {
                    memberCount++;
                }
            }
            if(memberCount<2)
            {
                return member;
            }
        }
        return -1;
    }
}