package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//while Loops
//        boolean doWhileCondition = false;
//        int count = 0;
//
//        do {
//            System.out.println("our while condition is true. Adding 1 to our count");
//                count = count + 1;
//                if(count == 3) {
//                    System.out.println("our count is at 3");
//                    doWhileCondition = false;
//                }
//        } while (doWhileCondition);
////
////  For loops
//        for(int i = 0; i <= 5; i++) {
//            System.out.println(i);
//        }
//
//       Foreach Loops
        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Strawberry");
        fruit.add("Grape");

        for(String food : fruit) {
            if (food.contains("b") || food.contains("B")) {
                System.out.println(food);
            }
        }
    }
}
