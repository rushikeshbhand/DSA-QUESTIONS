package dsa_questions;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Radius ?");
		double radius = obj.nextInt();
		double Area = 3.14 * (radius*radius);
		System.out.println(Area);
	}
}
