package dsa_questions;

import java.util.Scanner;

public class AgeCheck {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("What is age ?");
		int age = sc.nextInt();
		if(age<18) {
			System.out.println("Age must be more than 17");
		}
		else {
			System.out.println("Age is ok");
		}
	}
}
