package dsa_questions;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int TwoDArray[][] = {{1,2,3,4,3},{6,7,8}};
		for(int i = 0; i<=TwoDArray.length; i++) {
			for(int w = 0; w<=TwoDArray[i].length; w++) {
				System.out.println(TwoDArray[i][w]);
			}
		}
	}
}
