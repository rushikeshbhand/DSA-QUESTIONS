package dsa_questions;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter num one: ");
		int num = obj.nextInt();
		System.out.println("Enter num two: ");
		int numTwo = obj.nextInt();
		System.out.println("Addition of two numbers is: "+ num + numTwo);
	}
}
