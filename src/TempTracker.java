import java.util.Arrays;

public class TempTracker {
    public static void main(String[] args) {
        // Array to store temperatures for 7 days
        double[] temperatures = {72.5, 75.0, 68.0, 70.2, 73.8, 77.0, 71.5};
        Arrays.sort(temperatures);
        // Calculate and print the average temperature
        double averageTemp = calculateAverage(temperatures);
        System.out.println("Average Temperature: " + averageTemp);

        // Find and print the hottest temperature
        double hottest = findHottest(temperatures);
        System.out.println("Hottest Temperature: " + hottest);

        // Find and print the coldest temperature
        double coldest = findColdest(temperatures);
        System.out.println("Coldest Temperature: " + coldest);

        // Count and print the number of days above 74°F
        int daysAboveThreshold = countDaysAbove(temperatures, 74.0);
        System.out.println("Number of Days Above 74°F: " + daysAboveThreshold);

    }

    // Calculate the average temperature
    public static double calculateAverage(double[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;

    }

    // Find the hottest temperature
    public static double findHottest(double[] arr) {
        int hottest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[hottest]) {
                hottest = i;
            }
        }
        return arr[hottest];
    }


    // Find the coldest temperature
    public static double findColdest(double[] arr) {
        int coldest = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[coldest]) {
                coldest = i;
            }
        }
        return arr[coldest];


    }

    // Count the number of days with temperature above a threshold
    public static int countDaysAbove(double[] arr, double threshold) {
        int numTemAbove = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > threshold) {
                numTemAbove++;
            }
        }
        return numTemAbove;


    }
}

