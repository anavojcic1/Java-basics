////Write a java program to find the second largest number in the array?
import java.util.Arrays;
public class T9 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 4, 5, 6, 7, 8, 9};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("The second largest number in the array is: " + secondLargest);
    }

    public static int findSecondLargest(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];
    }
}
