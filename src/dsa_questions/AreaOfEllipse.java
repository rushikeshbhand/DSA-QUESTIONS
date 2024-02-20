package dsa_questions;

import java.util.Scanner;

public class AreaOfEllipse {
	public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Area of ellipse: ");
        double a = obj.nextInt();
        double b = obj.nextInt();
        double area = 3.14*a*b;
        System.out.println("Area of ellipse is: " + area);
        obj.close();
	}
}
