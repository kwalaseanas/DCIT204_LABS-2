import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the Target Sum: ");
        int targetSum = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println("\n--- Pair Found ---");
                    System.out.println("Indices: " + i + " and " + j);
                    System.out.println("Values: " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + targetSum);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("\nNo pair exists that adds up to the target sum.");
        }

        scanner.close();
    }
}
