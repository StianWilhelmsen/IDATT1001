package GangeTabell;
import java.util.Scanner;
class GangeTabell {
	public static void main (String [] args) {

		//Hente inn start og sluttverdi for gangetabellene fra bruker
		System.out.println("Skriv inn tallet du vil begynne med for gangetabellene!");
		Scanner putIn = new Scanner(System.in);
		int startTall = putIn.nextInt();
		System.out.println("Skriv inn tallet du vil avslutte med for gangetabellen!");
		int sluttTall = putIn.nextInt();

		// Løkke som kjører fra start til sluttTall.
		for (int i = startTall; i <= sluttTall; i++) {
			System.out.println(i + "-gangen"); //Printer ut overskrift for tabellen


			//gange tabell med tallet i opp til tallet 10
			for (int j = 1; j <= 10; j++) {
				System.out.println("\n" + i + "*" + j + " = " + i*j);
			}

			System.out.println("\n"); //Legge til et mellomrom etter siste linje i gangetabellen
		}


	}
}