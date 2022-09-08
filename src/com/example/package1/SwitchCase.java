package com.example.package1;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        System.out.println("Select option a or b");
        Scanner scanner=new Scanner(System.in);
        String option=scanner.nextLine();
        switch (option){
            case "a":
                System.out.println("you have selected option a");
                break;
            case "b":
                System.out.println("you have selected option b");
                break;
            default:
                System.out.println("this option is not yet supported");

        }
        int num=2;
        switch (num){
            case 1:
                System.out.println("you have selected option a");
                break;
            case 2:
                System.out.println("you have selected option b");
                break;
            default:
                System.out.println("this option is not yet supported");

        }
    }
}
