/* Create an array of integer values. After the array is created, calculate the
sum of all stored elements in that array. */
public class T2 {
    public static void main(String[] args) {
        int[] arr = {5,6,8,9,10};

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of the array elements: " + sum);
    }
}
