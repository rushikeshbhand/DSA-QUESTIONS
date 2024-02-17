package dsa_questions;

import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter first number: ");
			int firstNum = sc.nextInt();
			System.out.println("Enter second number: ");
			int secondNum = sc.nextInt();
			if(secondNum != 0) {
				int divisionResult = firstNum / secondNum;
				System.out.println("Result of division :"+ divisionResult);
			}
			else {
				System.out.println("Enter valid number for division");
			}
		}catch(Exception x){
			System.out.println("server error is come" + x);
		}
		finally {
			sc.close();
		}
	}
}
