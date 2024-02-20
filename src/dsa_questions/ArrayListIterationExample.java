package dsa_questions;

import java.util.ArrayList;

public class ArrayListIterationExample {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Iterating over ArrayList using enhanced for loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

