//Maximum and minimum number in the array?

public class T8 {

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 7, 2, 6, 4};
int max = arr[0];
int min = arr[0];

for(int num : arr){
    if(num > max){
        max = num;
    } else if (num < min) {
        min = num;
    }
    }
        System.out.println("Maximum number in the array: " + max);
        System.out.println("Minimum number in the array: " + min);
}
}
