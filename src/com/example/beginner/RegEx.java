package com.example.beginner;

import java.util.regex.*;

public class RegEx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\d{10}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit 9876543210!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found: "+matcher.group(0));
        } else {
            System.out.println("Match not found");
        }
    }
}
