package dsa_questions;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Multiplication mu = new Multiplication();
		mu.multipleTwo();
	}
	void multipleTwo() throws RuntimeException{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number first:");
		int first = obj.nextInt();
		System.out.println("Enter number second:");
		int second = obj.nextInt();
		int numResult = first * second;
		System.out.println("multiplication of two number is :" + numResult);
		obj.close();
	}
}
