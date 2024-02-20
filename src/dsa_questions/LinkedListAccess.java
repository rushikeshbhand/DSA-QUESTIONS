package dsa_questions;

import java.util.LinkedList;

public class LinkedListAccess {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        // Accessing elements using index
        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Last Element: " + linkedList.getLast());
        System.out.println("Element at index 1: " + linkedList.get(1));
    }
}

