import static javax.swing.JOptionPane.*;
import java.util.Scanner;
public class brokProgram {
    public static void main(String [] args) {

        System.out.println("Skriv inn teller til den første brøken: "); //får teller til brøk 1
        Scanner lesTeller = new Scanner(System.in);
        int teller1 = lesTeller.nextInt();
        System.out.println("Skriv inn nevner til den første brøken: "); //får nevner til brøk 1
        Scanner lesNevner = new Scanner(System.in);
        int nevner1 = lesNevner.nextInt();

        brokKlasse brok1 = new brokKlasse(teller1, nevner1);

        System.out.println("Skriv inn teller til den andre brøken: "); //får teller til brøk 2
        int teller2 = lesTeller.nextInt();
        System.out.println("Skriv inn nevner til den andre brøken: "); //får nevner til brøk 2
        int nevner2 = lesNevner.nextInt();


        System.out.println("Velg regnemåten du vil ha: \n 1: Summere \n 2: Subtrahere \n 3: Multiplisere \n 4: Dividere");
        Scanner input = new Scanner(System.in);
        int valg = input.nextInt();       

        switch (valg) { //Velger regnemåte ut ifra svar skrevet inn
            case 1:
                brok1.summer(teller2, nevner2);
                System.out.println(brok1.getSvar());
                break; // stopper fra å gå videre i switch løkken

            case 2:
                brok1.subtraher(teller2, nevner2);
                System.out.println(brok1.getSvar());
                break;

            case 3:
                brok1.multiplisere(teller2, nevner2);
                System.out.println(brok1.getSvar());
                break;

            case 4:
                brok1.dividere(teller2, nevner2);
                System.out.println(brok1.getSvar());
                break;

            default:
                System.out.println("Ikke et gyldig valg");
        }
    
    }
}
