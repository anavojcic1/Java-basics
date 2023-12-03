// Write a program to swap 2 numbers without a temporary variable

public class T5 {
    public static void main(String[] args) {
    int num1 = 5;
    int num2 = 10;

        System.out.println("Before swapping: num1 = " + num1 + " , num2 = "+ num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping: num1 = " + num1 + " , num2 = "+ num2);
    }
}
