/* Write a program to print out duplicate elements from an Array
of Strings? */

public class T10 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};
        System.out.println("Duplicate elements in the array:");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
