import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // declaration of variables and stuff needed
        Scanner a = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        char choice;

        // wrap the thing in do while loop so we can restart it
        do {
            // ask for user input
            System.out.println("\nInput 9 elements:");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = a.nextInt();
                }
            }
            
            System.out.println("\nHere are the numbers and the outputs:");
            System.out.printf("%48s%n", "Row Sum");

            // init column sum array so we can print it out, and init for diagonal sum vars
            int[] col = new int[3];
            int diagonal1 = 0;
            int diagonal2 = 0;

            // now print the values
            for (int i = 0; i < 3; i++) {
                int rowTotal = 0;
                System.out.printf("%16s", "");
                for (int j = 0; j < 3; j++) {
                    System.out.printf("%-8d", matrix[i][j]);
                    rowTotal += matrix[i][j];
                    col[j] += matrix[i][j];

                    if (i == j) diagonal1 += matrix[i][j];
                    if (i + j == 2) diagonal2 += matrix[i][j];
                }
                System.out.printf("%8d%n", rowTotal);
            }

            // print column sum, with printf so we can have precise spacing
            System.out.printf("%n%-16s", "Column sum:");
            for (int i = 0; i < 3; i++) {
                System.out.printf("%-8d", col[i]);
            }

            System.out.println("\n");

            System.out.println("Diagonal sum 1: " + diagonal1);
            System.out.println("Diagonal sum 2: " + diagonal2);

            System.out.print("\nWanna try again? Maybe just this time? (y/n): ");

            choice = a.next().charAt(0);
            System.out.println();
        } while (choice == 'y');
    }
}
 