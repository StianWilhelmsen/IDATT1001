package TesktAnalyse;

import java.util.Scanner;
import java.lang.Math;


public class TekstMain {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        boolean go = true;

        int[] totalLetters = new int[31];
        char[] letters = {'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; //':', ',', '!', '.'};}
        // char[] notLetters = {'æ','ø','å', '-','<', '>', '/', '1','2','3','4','5','6','7','8','9','0','*'};

        while(go) {
            System.out.println(" Welcome to text analysis program!\n Press 1 to continue using the program and 2 to quit.");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println("What do you want to do? \n Press one of the following numbers:\n 1: Total different letters\n 2: The total amount of letters\n 3: What percentage of the text is not letters\n 4: Find the number of occurences of a particular letter\n 5: The most commonly used letters");
                int choice2 = input.nextInt();

                if (choice2 == 1) { // Total different letters
                    System.out.println("Please write a text of your choice");
                    input.nextLine();
                    String text = input.nextLine();
                    for (int i=0; i < text.length(); i++){ //Goes through a loop until its gone through the whole text length
                        for (int z=0; z < letters.length; z++) { //Goes through the letters array length to check for different letters
                            if (text.charAt(i) == letters[z]) {
                                totalLetters[z]++;
                            }
                        }
                    }
                    for (int x=0; x < letters.length; x++) {
                        if (totalLetters[x]>0) {
                            System.out.println(letters[x]+": "+ totalLetters[x]);
                        }
                    } 
                }

                if (choice2 == 2) { //The total amount of letters
                    System.out.println("Please write a text of your choice");
                    input.nextLine();
                    String text = input.nextLine();
                    int stringLength = text.length(); //Length of text with spaces
                    int stringLengthWithoutSpaces = text.replace(" ", "").length(); //Removes spaces
                    System.out.println("Total amount of letters in this text: "+ stringLengthWithoutSpaces);
                }

                if (choice2 == 3) { // What percentage of the text is not letters
                    System.out.println("Please write a text of your choice");
                    input.nextLine();
                    String text = input.nextLine();
                    int stringLength = text.length();

                    int letter = 0;
                    int notLetters = 0;
                    int others = 0;

                    for (int i = 0; i < text.length(); i++) { //Loop to get the amount of letters, nonletters and others
                        char ch = text.charAt(i);

                        if (Character.isLetter(ch)) {
                            letter++;
                        } else if(Character.isDigit(ch)) {
                            notLetters++;
                        } else {
                            others++;
                        }
                    }
                    double letterPercentage = (letter * 100.0) / stringLength;
                    double notLetterPercentage = ((notLetters+others) * 100.0) / stringLength;

                    System.out.println("In the text");
                    System.out.println(" Letters occures: " + Math.round(letterPercentage) + "%"); 
                    System.out.println(" Symbols occures(not letters) " + Math.round(notLetterPercentage) + "%");
                }

                if (choice2 == 4) { // Find the number of occurences of a particular letter
                    int time = 0;
                    int position;

                    System.out.println("Please write in a text");
                    input.nextLine();
                    String text = input.nextLine();
                    System.out.println(" Please enter the character you wish to be counted here;");
                    String letter = input.nextLine();

                    for (position = 0; position < text.length(); position++) { // checks for the amount of occurenses of letter wished for
                        if (text.charAt(position) == letter.charAt(0) ) {
                            time++;
                        }
                    }

                    System.out.println("There are " + time + " occurances of the letter " + letter + " in your text.");
                }

                if (choice2 == 5) { // The most commonly used letters
                    System.out.println("Please write in a text");
                    input.nextLine();
                    String text = input.nextLine();
                    int stringLength = text.length();

                    char maxappearchar = ' ';
                    int counter = 0;
                    int[] charcnt = new int[Character.MAX_VALUE + 1];

                    for (int i = 0; i < text.length(); i++) { //Counts the amount of times a letter appears
                        char ch = text.charAt(i);

                        charcnt[ch]++;

                        if (charcnt[ch] >= counter) { // If a character has more counts than the current counter, set it as the most appeared character
                            counter = charcnt[ch];
                            maxappearchar = ch;
                        }
                    }
                    System.out.println("There is a total of " + stringLength + " letters in the text.");
                    System.out.println("The letter used the most is " + maxappearchar + " and is displayed " + counter + " times.");
                }
            }  
            
            if (choice == 2) { //Stop program
                go = false;
                System.out.println("Have a good day!");
            }
        }
    }
}
