//Write a java program to check whether a given number is prime or not?

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }
    }
}
