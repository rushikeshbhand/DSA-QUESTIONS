package dsa_questions;

import java.util.ArrayList;

public class ArrayListSearchExample {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        // Finding index of element "Alice"
        int index = names.indexOf("Alice");

        // Displaying index
        System.out.println("Index of 'Alice': " + index);
    }
}

