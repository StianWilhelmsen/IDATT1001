package Arbeidskrav.oving9;
import java.util.*;
import java.util.Scanner;

public class Student {

    private String navn;
    private int antOppg;


    public Student(String navn, int antOppg) {
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn() {
        return this.navn;
    }

    public int getAntOppg() {
        return this.antOppg;
    }

    public void økAntOppg(int okning) {
        this.antOppg += okning;
    }

    public String toString() {
        return this.navn + ", Oppgaver godkjent: " + Integer.toString(this.antOppg);
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv inn studentens navn: ");
        String navn = scan.nextLine();
        System.out.println("Skriv inn antall oppgaver studenten har gjort: ");
        int antOppg = scan.nextInt();
        Student student = new Student(navn, antOppg);
        System.out.println("Data registrert.");
        System.out.println("Printer ut student informasjon:");
        System.out.println("Navn: " + student.toString());
        System.out.println("");
        System.out.println("Legger til 4 godkjente oppgaver");
        student.økAntOppg(4);
        System.out.print("Oppgaver lagt til..\n");
        System.out.println("Navn: " + student.toString());

    }
}
