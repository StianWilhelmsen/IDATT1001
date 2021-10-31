package RandomLokke;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomLokke {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random(); //random funksjon
        int randomArray[] = new int[1000]; //Liste med 1000 plasser
        int countArray[]=new int[10]; //Liste som teller igjennom tall fra 0 til 9
        
        for (int i = 0; i < 1000; i++) { // for løkke som generer liste med tilfeldige tall og printer dem
            randomArray[i] = random.nextInt(10);
            System.out.println(randomArray[i]);
        }

        for (int r : randomArray) { //for løkke som teller antall ganger tallene kommer i randomArray listen
            countArray[r]++;
        }

        for (int x = 0; x < countArray.length; x++) { //for løkke som printer ut tabell med hvor mange ganger tallene er blitt printet
            System.out.println("" + x + " kommer " + countArray[x] + " ganger");
        }
        
    }
}