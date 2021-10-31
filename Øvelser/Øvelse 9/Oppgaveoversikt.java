package Arbeidskrav.oving9;
import java.util.Scanner;
import java.sql.Array;
import java.util.*;
public class Oppgaveoversikt {

    private static ArrayList<Student> studenter = new ArrayList<Student>();
    private static int antStud = 0;

    public Oppgaveoversikt() {
        studenter = new ArrayList<Student>();
    }

    public static int getAntStud() {
        return studenter.size();

    }

    public static int studentId(String navn) {
        int index = -1;
        for (int i = 0; i < getAntStud(); i++) {
            if (studenter.get(i).getNavn().equals(navn)) {
                index = i;
                break;
            }
        }
        return index;
    }


    public String toString() {
        String tekst = "";
        for (int i = 0; i < getAntStud(); i++) {
            tekst += studenter.get(i).toString();
        }
        return tekst;
    }

    public static void skrivUtAlle() {
        if (getAntStud() < 1) {
            System.out.print("Det er ingen studenter registrert enda.\n");
        } else {
            System.out.println("Studenter: ");
            for (int i = 0; i < getAntStud(); i++) {
                Student student = studenter.get(i);
                System.out.println("Navn: " + student.getNavn() + ". Oppgaver: "+ student.getAntOppg());
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Velkommen til Oppgaveoversikten.");
        System.out.println("Tast 1 for å bruke programmet eller tast 2 for å avslutte:");
        int choice = scan.nextInt();

        if (choice == 1) {
            boolean go = true;
            while (go) {
                System.out.println("Hva vil du gjøre i dag?");
                System.out.println("1: Registrere en ny student");
                System.out.println("2: Finn antall studenter registrert");
                System.out.println("3: Finn antall oppgaver en student har løst");
                System.out.println("4: Øk antall oppgaver løst for en bestemt student");
                System.out.println("5: Print ut alle registrerte studenter");
                System.out.println("6: Avslutte programmet");
                int choice2 = scan.nextInt();

                if (choice2 == 1) { //Registrere en ny student
                    scan.nextLine();
                    System.out.println("Studentens navn:");
                    String navn = scan.nextLine();
                    System.out.print("Antall oppgaver løst:");
                    int antOppg = scan.nextInt();
                    Student nyStudent = new Student(navn, antOppg);
                    studenter.add(nyStudent);
                    System.out.println("Studenten er blitt registrert.");
                }

                if (choice2 == 2) { //Finn antall studenter registrert
                    System.out.println("Printer ut antall studenter..");
                    System.out.println("Det er totalt " + getAntStud() + " student registrert.\n");
                }

                if (choice2 == 3) { //Finn antall oppgaver en student har løst
                    scan.nextLine();
                    System.out.print("Hva er studentens navn?\n");
                    String navn = scan.nextLine();
                    int id = studentId(navn); //bruker navnet for å finne index til studenten

                    try {
                        Student student = studenter.get(id); //Setter student lik personen vi har hentet via studentId();
                        System.out.println(student.getNavn() + " har gjort " + student.getAntOppg() + " oppgaver.\n");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Denne studenten eksisterer ikke.");
                    }
                }

                if (choice2 == 4) { //Øk antall oppgaver løst for en bestemt student
                    scan.nextLine();
                    System.out.print("Hva er studentens navn?\n");
                    String navn = scan.nextLine();
                    int id = studentId(navn); //bruker navnet for å finne index til studenten

                    Student student = studenter.get(id);
                    System.out.println("Hvor mange løste oppgaver vil du legge til?");
                    int okning = scan.nextInt();
                    student.økAntOppg(okning);
                    System.out.println("Den nye mengden for oppgaver løst: " + student.getAntOppg());
                }

                if (choice2 == 5) { //Print ut alle registrerte studenter
                    skrivUtAlle();
                }

                if (choice2 == 6) {
                    go = false;
                    System.out.println("Avslutter programmet...");
                }
            }

        }
    }
}
