package dsa_questions;

import java.util.LinkedList;

public class LinkedListRemove {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Java");
        linkedList.add("Python");
        linkedList.add("C++");

        // Removing an element
        linkedList.remove("Python");

        // Displaying the updated LinkedList
        System.out.println("Updated LinkedList: " + linkedList);
    }
}

