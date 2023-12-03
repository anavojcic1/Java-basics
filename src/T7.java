//Write a Java Program to print the first 10 numbers of Fibonacci series

public class T7 {
    public static void main(String[] args) {

        int n = 10;

        System.out.println("First " + n + " numbers in the Fibonacci series:");

        int firstTerm = 0;
        int secondTerm = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
