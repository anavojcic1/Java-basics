/*Create a 2D array of integers. Develop a program which will calculate the
sum of even and odd numbers for that array */
public class T4 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2, 3, 4},
                {5, 6, 7, 8},
                {9, 10 , 11, 12}
        };

        int sumEven = 0;
        int sumOdd = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                if(arr[i][j] % 2 == 0){
                    sumEven += arr[i][j];
                } else {
                    sumOdd += arr[i][j];
                }
            }
        }
        System.out.println("Sum of even numbers is: " + sumEven);
        System.out.println("Sum of odd numbers is: " + sumOdd);
    }

}
