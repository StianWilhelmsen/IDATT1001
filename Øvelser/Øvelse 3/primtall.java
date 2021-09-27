package Primtall;
import java.util.Scanner;

public class Primtall {
    public static void main(String [] args) {
        int tall = 100;
        Scanner primtall = new Scanner(System.in);
        while (tall != -1) { //Så lenge tall ikke er likt -1 så skal koden kjøres
            System.out.println("Skriv inn et tall, eller skriv -1 for å avslutte programmet.");
            tall = primtall.nextInt();
            if (tall == -1) {
                System.out.println("Du har avsluttet programmet.");
                break;
            }
            int i, m = 0, flag = 0;
            m = tall/2; // finner tall vi skal kjøre løkken til senere
            if (tall == 0 || tall == 1) {
                System.out.println(tall + " er ikke et primtall.");
            } else {
                for (i=2; i<=m; i++) { // Sjekker om tallet ikke er et primtall
                    if (tall%i==0) {
                        System.out.println(tall + " er ikke et primtall");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) { //Tallet er et primtall og blir printet
                    System.out.println(tall + " er et primtall");
                }
            } // Koden begynner fra toppen igjen
        }
    }
}



