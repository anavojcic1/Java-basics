import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int daysInWeek = 7;
        double[] temperatures = new double[daysInWeek];


        for (int i = 0; i < daysInWeek; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }


        double highestTemperature = temperatures[0];
        double lowestTemperature = temperatures[0];

        for (int i = 1; i < daysInWeek; i++) {
            if (temperatures[i] > highestTemperature) {
                highestTemperature = temperatures[i];
            }

            if (temperatures[i] < lowestTemperature) {
                lowestTemperature = temperatures[i];
            }
        }


        System.out.println("Highest Temperature: " + highestTemperature);
        System.out.println("Lowest Temperature: " + lowestTemperature);

        scanner.close();
    }
}
