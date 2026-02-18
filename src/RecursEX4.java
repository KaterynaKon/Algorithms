import java.util.Random;

public class RecursEX4 {
    public static void main(String[] args) {
        int n = 10000; // Large input size
        int[] arr = new int[n];
// Fill the array with random values
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100); // Random numbers between 0-99
        }
// Start time
        long startTime = System.nanoTime();
// Compute sum of array elements
        long sum = sumArray(arr,0);
// End time
        long endTime = System.nanoTime();
// Compute elapsed time
        long elapsedTime = endTime - startTime;
// Display results
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Elapsed time (nanoseconds): " + elapsedTime);
        System.out.println("Elapsed time (milliseconds): " + elapsedTime /
                1_000_000.0);
// Determine time complexity class
        System.out.println("Expected Time Complexity: O(n)");
    }
    public static long sumArray(int[] arr, int ind) {
        if (ind == arr.length) return 0;
    return arr[ind]+sumArray(arr, ind+1);


    }

    // Method to sum elements of an array (Linear Time Complexity O(n))
    /*public static long sumArray(int[] arr) {
        long sum = 0;
        for (int num : arr) { // Iterates through all elements
            sum += num;
        }
        return sum;
    }*/


}
