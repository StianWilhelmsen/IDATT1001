package Matrise;
import java.util.Scanner;

public class Matrise {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        boolean go = true;


        while(go) {
            System.out.println("Welcome to the matrix calculator.\n Press 1 to continue and 2 to stop the program");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("What do you want to do?\n1: Add two matrices together\n2: Transpose a matrix\n3: Multiply two matrices");
                int choice2 = input.nextInt();

                if (choice2 == 1) {
                    System.out.println( " Please type in total colums on the two matrices ");
                    int columns = input.nextInt();
                    System.out.println( " Please type in total rows on the two matrices ");
                    int rows = input.nextInt();

                    MatriseRegning matrix = new MatriseRegning(columns, rows);
                    MatriseRegning matrix2 = new MatriseRegning(columns, rows);

                    System.out.println(matrix.toString());
                    System.out.println(matrix2.toString());

                    System.out.println(matrix.addere(matrix2).toString()); // Summerer matrise og skriver ut
                }

                if (choice2 == 2) {
                    System.out.println( " Please type in total colums on the two matrices ");
                    int columns = input.nextInt();
                    System.out.println( " Please type in total rows on the two matrices ");
                    int rows = input.nextInt();

                    MatriseRegning matrix = new MatriseRegning(columns, rows);
                    MatriseRegning matrix2 = new MatriseRegning(columns, rows);
                    System.out.println(matrix.toString());
                    System.out.println(matrix.Transpose()); // Transponerer og skriver ut matrise
                }

                if (choice2 == 3) {
                    System.out.println( " Please type in total colums on the two matrices ");
                    int columns = input.nextInt();
                    System.out.println( " Please type in total rows on the two matrices ");
                    int rows = input.nextInt(); 

                    MatriseRegning matrix = new MatriseRegning(columns, rows);
                    MatriseRegning matrix2 = new MatriseRegning(columns, rows);
                    
                    System.out.println(matrix.toString());
                    System.out.println(matrix2.toString());
    
                    System.out.println(matrix.multiply(matrix2).toString());
                }
            }

            if (choice == 2) {
                go = false;
                System.out.println("You've stopped the program");
            }
        }
    }
}