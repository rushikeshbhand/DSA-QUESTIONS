package dsa_questions;

import java.util.ArrayList;

public class ArrayListRemoveExample {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Removing element at index 1
        numbers.remove(1);

        // Displaying elements
        System.out.println("ArrayList after removal: " + numbers);
    }
}

