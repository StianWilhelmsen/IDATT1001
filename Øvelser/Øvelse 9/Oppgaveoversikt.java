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

    public static void nyStudent(String navn, int antOppg) {
        boolean navnEksisterer = false;
        for (int i = 0; i < getAntStud(); i++) {
            if (studenter.get(i).getNavn().equals(navn)) {
                navnEksisterer = true;
            }
        }
        if (!navnEksisterer) {
            Student nyStudent = new Student(navn, antOppg);
            studenter.add(nyStudent);
            System.out.println("Studenten er blitt registrert!");
        } else {
            System.out.println("Dette navnet er allerede i bruk.");
        }
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
        System.out.println("Tast 1 for ?? bruke programmet eller tast 2 for ?? avslutte:");
        int choice = scan.nextInt();

        if (choice == 1) {
            boolean go = true;
            while (go) {
                System.out.println("Hva vil du gj??re i dag?");
                System.out.println("1: Registrere en ny student");
                System.out.println("2: Finn antall studenter registrert");
                System.out.println("3: Finn antall oppgaver en student har l??st");
                System.out.println("4: ??k antall oppgaver l??st for en bestemt student");
                System.out.println("5: Print ut alle registrerte studenter");
                System.out.println("6: Avslutte programmet");
                int choice2 = scan.nextInt();

                if (choice2 == 1) { //Registrere en ny student
                    scan.nextLine();
                    System.out.println("Studentens navn:");
                    String navn = scan.nextLine();
                    System.out.print("Antall oppgaver l??st:");
                    int antOppg = scan.nextInt();
                    nyStudent(navn, antOppg);
                }

                if (choice2 == 2) { //Finn antall studenter registrert
                    System.out.println("Printer ut antall studenter..");
                    System.out.println("Det er totalt " + getAntStud() + " student registrert.\n");
                }

                if (choice2 == 3) { //Finn antall oppgaver en student har l??st
                    scan.nextLine();
                    System.out.print("Hva er studentens navn?\n");
                    String navn = scan.nextLine();
                    int id = studentId(navn); //bruker navnet for ?? finne index til studenten

                    try {
                        Student student = studenter.get(id); //Setter student lik personen vi har hentet via studentId();
                        System.out.println(student.getNavn() + " har gjort " + student.getAntOppg() + " oppgaver.\n");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Denne studenten eksisterer ikke.");
                    }
                }

                if (choice2 == 4) { //??k antall oppgaver l??st for en bestemt student
                    scan.nextLine();
                    System.out.print("Hva er studentens navn?\n");
                    String navn = scan.nextLine();
                    int id = studentId(navn); //bruker navnet for ?? finne index til studenten

                    Student student = studenter.get(id);
                    System.out.println("Hvor mange l??ste oppgaver vil du legge til?");
                    int okning = scan.nextInt();
                    student.??kAntOppg(okning);
                    System.out.println("Den nye mengden for oppgaver l??st: " + student.getAntOppg());
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
