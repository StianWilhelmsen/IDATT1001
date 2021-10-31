package Arbeidskrav.oving7.oppgave2;

import Arbeidskrav.oving7.oppgave2.NewString;

import java.util.Scanner;
public class main {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        boolean go = true;


        while (go) {
            System.out.println("Press 1 to use the program and 2 to end the program");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("What do you want to do?\n1: Find the amount of words in the text\n2: Find the average word length in the text\n3: Find the average amount of words per sentences\n4: To swap a word in the text with another word\n5: Get the text returned to you\n6: Get the text returned with every letter being capitalized");

                int choice2 = input.nextInt();

                if (choice2 == 1) { //Find the amount of words in the text
                    System.out.println("Please write a text of your choice");
                    input.nextLine();
                    String text = input.nextLine();
                    NewString text1 = new NewString(text);

                    System.out.println(text1.numberOfWords());
                }

                if (choice2 == 2) { //Find the average word length in the text
                    System.out.println("Please write a text of your choice");
                    input.nextLine();
                    String text = input.nextLine();
                    NewString text1 = new NewString(text);

                    System.out.println(text1.averageWordLength());
                }

                if (choice2 == 3) { //Find the average amount of words per sentences
                    System.out.println("Please write a text of your choice");
                    input.nextLine();
                    String text = input.nextLine();
                    NewString text1 = new NewString(text);

                    System.out.println(text1.averageWordSentences());
                }

                if (choice2 == 4) { //To swap a word in the text with another word
                    System.out.println("Please write a text of your choice");
                    input.nextLine();
                    String text = input.nextLine();
                    NewString text1 = new NewString(text);

                    System.out.println("Pick your word to be replaced");
                    String oldWord = input.nextLine();
                    NewString oldWordObject = new NewString(oldWord);

                    System.out.println("Pick your new word");
                    String newWord = input.nextLine();
                    NewString newWordObject = new NewString(newWord);

                    System.out.println(text1.replaceWord(oldWord, newWord));

                }

                if (choice2 == 5) { //Get the text returned to you
                    System.out.println("Please write a text of your choice");
                    input.nextLine();
                    String text = input.nextLine();
                    NewString text1 = new NewString(text);

                    System.out.println(text1.printText());
                }

                if (choice2 == 6) {
                    System.out.println("Please write a text of your choice");
                    input.nextLine();
                    String text = input.nextLine();
                    NewString text1 = new NewString(text);

                    System.out.println(text1.upperCase());
                }
            }

            if (choice == 2) {
                System.out.println("You've ended the program.");
                go = false;
            }
        }
    }
}
