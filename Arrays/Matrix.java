import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        // wrap it in a do while loop and init the array values (default first before modifying it)
        do {
            int[][][] threeArray = { { { 10, 20 }, { 30, 40 } }, { { 50, 60 }, { 70, 80 } } };
            System.out.println("Default Values");
            for (int i = 0; i < threeArray.length; i++) {
                System.out.println("Array Layer " + (i + 1));
                for (int j = 0; j < threeArray[i].length; j++) {
                    for (int k = 0; k < threeArray[i][j].length; k++) {

                        System.out.printf("%5d", threeArray[i][j][k]);
                    }
                    System.out.println();
                }
            }
            // accept user input to modify the values of the array
            for (int i = 0; i < threeArray.length; i++) {
                System.out.println();
                for (int j = 0; j < threeArray[i].length; j++) {
                    for (int k = 0; k < threeArray[i][j].length; k++) {

                        System.out.print("Type your desired number for Layer " + (i + 1) + " Index " + "[" + i + "]" + "[" + j + "]" + "[" + k + "]: ");
                        threeArray[i][j][k] = a.nextInt();
                    }

                }
            }

            // print updated values modified by the user
            System.out.println("\nValues updated!");
            for (int i = 0; i < threeArray.length; i++) {
                System.out.println("Array Layer " + (i + 1));
                for (int j = 0; j < threeArray[i].length; j++) {
                    for (int k = 0; k < threeArray[i][j].length; k++) {

                        System.out.printf("%5d", threeArray[i][j][k]);
                    }
                    System.out.println();
                }
            }

            // total elements counter
            int totalArrayValueInt = 0;
            double threeArrayTotal = 0;
            int threeArrayTotalInt = 0;
            for (int i = 0; i < threeArray.length; i++) {
                double firstArrayValue = threeArray.length;
                for (int j = 0; j < threeArray[i].length; j++) {
                    double secondArrayValue = threeArray.length;
                    for (int k = 0; k < threeArray[i][j].length; k++) {
                        double thirdArrayValue = threeArray.length;
                        double totalArrayValue = firstArrayValue * secondArrayValue * thirdArrayValue;
                        totalArrayValueInt = (int) totalArrayValue;
                        threeArrayTotal += threeArray[i][j][k];
                        threeArrayTotalInt = (int) threeArrayTotal;

                    }
                }

            }

            // print total value and count
            System.out.println("\nTotal number of elements: " + totalArrayValueInt);
            System.out.println("Total value of elements: " + threeArrayTotalInt + "\n");

            // try again option
            System.out.print("Do you want to try again? (y/n): ");
            char choice = a.next().toLowerCase().charAt(0);
            System.out.println();

            // if answer not yes, exit program
            if (choice != 'y') {
                System.out.println("Okay bro, bye o/");
                a.close();
                break;
            }

        } while (true);
    }
}