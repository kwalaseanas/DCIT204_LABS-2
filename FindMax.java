import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        int maxVal = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] > maxVal) {
                maxVal = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.println("Maximum Value: " + maxVal);
        System.out.println("Index of Maximum Value: " + maxIndex);

        scanner.close();
    }
}
