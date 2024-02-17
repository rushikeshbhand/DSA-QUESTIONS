package dsa_questions;

import java.util.Scanner;

public class Subtraction {
	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		System.out.println("Enter first number:");
		int numFirst = object.nextInt();
		System.out.println("Enter second number:");
		int numSecond = object.nextInt();
		System.out.println("Subtraction of two numbers is: " + (numFirst - numSecond));
	    object.close();
	}
}
