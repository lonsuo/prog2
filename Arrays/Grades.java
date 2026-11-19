import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        // 1 dimensional array declare and init
        float grades[] = {90.00f, 85.00f, 65.00f};

        // traverse array
        System.out.println("Sample grades only!");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Sample grade no. " + (i + 1) + ": " + grades[i]);
        }

        // spacer
        System.out.println();

        // input numbers to array
        Scanner a = new Scanner(System.in);
        for (int i = 0; i < grades.length; ++i) {
            System.out.print("Type your grade no. " + (i + 1) + ": ");
            grades[i] = a.nextInt();
        }

        // print new values
        System.out.println("\nYour grades are:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade no. " + (i + 1) + ": " + grades[i]);
        }

        // sum all the grades in the array
        double sum = 0;
        for (double total : grades) {
            sum += total;
        }

        // print da avg
        System.out.printf("\nYour average: %.2f\n", (sum / grades.length));

        // init of 3d array
        int[][] numbers = {
            {1, 2, 3},{4, 5, 6},{7, 8, 9}
        };

        // print em
        System.out.println("\nNumber Grid btw\n");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%4d", numbers[i][j]);
            }
            System.out.println("\n");
        }
    }
}
 