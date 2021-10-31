package Arbeidskrav.oving7.oppgave1;

import java.util.Scanner;

public class NewStringMain {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        boolean go = true;


        while (go) {
            System.out.println("Press 1 to use the program and 2 to end the program");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("Choose one of the following options:\n1: Abbreviation of sentences\n2: Remove one letter from the sentence");
                int choice2 = input.nextInt();

                if (choice2 == 1) { //Abbreviation of sentences
                    System.out.println("Please write a text");
                    input.nextLine();
                    String text = input.nextLine();
                    NewString text1 = new NewString(text);

                    System.out.println(text1.abbreviation());


                }

                if (choice2 == 2) {
                    System.out.println("Please write a text");
                    input.nextLine();
                    String text = input.nextLine();
                    NewString text1 = new NewString(text);

                    System.out.println("Please write the letter you wish to remove from your sentence.");
                    String letterRemoved = input.nextLine();

                    NewString letter = new NewString(letterRemoved);
                    System.out.println(text1.remove(letterRemoved));


                }
            }

            if (choice == 2) {
                go = false;
                System.out.println("You've ended the program.");
            }
        }
    }
}
