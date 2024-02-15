package dsa_questions;
class Fibonacci{
    public static void main(String[] args) {
        int prevFirst = 0;
        int prevSecond = 1;
        for(int i = 1; i<=20; i++){
            int fiboNum = prevFirst + prevSecond ;
            System.out.println(fiboNum);
            prevSecond = fiboNum;
            prevFirst = prevSecond;
        }
    }
}