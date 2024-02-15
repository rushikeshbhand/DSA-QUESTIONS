package dsa_questions;

public class FibonacciRecursive {
    static int count = 2;

    public static void main(String[] args) {
        int prevFirst = 0;
        int prevSecond = 1;
        System.out.println(prevFirst);
        System.out.println(prevSecond);
        recursive(prevFirst, prevSecond);
    }

    public static void recursive(int prevFirst, int prevSecond) {
        if (count <= 20) {
            int fiboNum = prevFirst + prevSecond;
            System.out.println(fiboNum);
            count++;
            recursive(prevSecond, fiboNum);
        } else {
            System.out.println("First twenty Fibonacci numbers are printed");
        }
    }
}
