public class OverloadedAverage {

    // Method to calculate the average of a short array
    public static short average(short[] array) {
        int sum = 0; // Use int to avoid overflow
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Main method to test the overloaded methods
    public static void main(String[] args) {
        // Test arrays
        short[] shortArray = {10, 20, 30};
        int[] intArray = {40, 50, 60, 70};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Test and print results
        System.out.println("Short Array Average: " + average(shortArray));
        System.out.println("Int Array Average: " + average(intArray));
        System.out.println("Long Array Average: " + average(longArray));
        System.out.println("Double Array Average: " + average(doubleArray));
    }
}

