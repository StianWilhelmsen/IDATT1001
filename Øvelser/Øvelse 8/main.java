package Arbeidskrav.oving8;
import java.util.Scanner;


public class main {
    private static Scanner scan = new Scanner(System.in);
    static int personCounter = 0;
    static int employeeCounter = 0;

    public static void main (String [] args) {
        if (personCounter == 0 || employeeCounter == 0) {
            System.out.print("Det er ingen personer registrert enda.\n");
            meny();
        }
    }

    public static Arbtaker nyPerson() {
        System.out.print("Legg til en person\n");
        System.out.print("Fornavn: ");
        String fNavn = scan.nextLine();
        System.out.println("Etternavn: ");
        String eNavn = scan.nextLine();
        System.out.print("Fødselsår: ");
        int fDato = scan.nextInt();
        Person person1 = new Person(fNavn, eNavn, fDato);
        personCounter++;
        System.out.print("Legg til arbeider\n");
        System.out.print("Arbeidstaker nr: ");
        int arbNr = scan.nextInt();
        System.out.println("Ansettelses år: ");
        int ansattAar = scan.nextInt();
        System.out.println("Månedslønn: ");
        double mndLonn = scan.nextDouble();
        System.out.println("Skatteprosent: ");
        double skatteProsent = scan.nextDouble();
        Arbtaker Arbtaker1 = new Arbtaker(person1, arbNr, ansattAar,mndLonn, skatteProsent);
        employeeCounter++;
        return Arbtaker1;

    }

    public static void visAnsattInfo(Arbtaker arbtaker) {
        System.out.println("AnsattNr: " + arbtaker.getArbeidsNr());
        System.out.println("Månedslønn: " + arbtaker.getMaanedsLonn());
        System.out.println("Skatteprosent: " + arbtaker.getSkatteProsent());
        System.out.println("Ansettelses år: " + arbtaker.getAnsettelsesAar());
        System.out.println("År i bedriften: " + arbtaker.getAarIBedrift());
        System.out.println("Alder: " + arbtaker.getAlder());
        System.out.println("Bruttolønn: "+ arbtaker.bruttoLonn());
        System.out.println("Navn: " + arbtaker.getNavn());
        System.out.print("Skatt per år: " + arbtaker.skattPerAar() + "\n");
        System.out.println("Skatt per mnd: " + arbtaker.skattPerMnd());
    }

    public static void meny() {
        Arbtaker arbtaker = nyPerson();
        while(true) {
            System.out.println("Meny:\n" +
                    "0. Avslutt\n" +
                    "1. Endre AnsattNr\n" +
                    "2. Endre ansettelses År" +
                    "3. Endre månedslønn\n" +
                    "4. Endre skatteprosent\n" +
                    "5. Ansattinformasjon\n" +
                    "6. Om personen har vært ansatt i mer enn x antall år");
            int valg = scan.nextInt();
            switch(valg) {
                case 0:
                    System.out.println("Avslutter...");
                    System.exit(0);

                case 1:
                    System.out.println("Nytt ansattnr: ");
                    int nyttAnsattNr = scan.nextInt();
                    arbtaker.setArbeidsNr(nyttAnsattNr);
                    System.out.print("Ansattnr ble endret");
                    break;

                case 2:
                    System.out.print("Nytt ansettelses år: ");
                    int nyttAnsattAar = scan.nextInt();
                    arbtaker.setAnsettelsesAar(nyttAnsattAar);
                    System.out.println("Ansettelses år ble endret");
                    break;

                case 3:
                    System.out.println("Ny månedslønn: ");
                    double nyMndLonn = scan.nextDouble();
                    arbtaker.setMaanedsLonn(nyMndLonn);
                    System.out.println("Ny månedslønn ble satt");
                    break;

                case 4:
                    System.out.println("Ny skatteprosent: ");
                    double nySkatteProsent = scan.nextDouble();
                    arbtaker.setSkatteProsent(nySkatteProsent);
                    System.out.println("Ny skatteprosent ble satt");
                    break;

                case 5:
                    visAnsattInfo(arbtaker);
                    break;

                case 6:
                    System.out.println("Hvor mange år?");
                    int aar = scan.nextInt();
                    arbtaker.aarIBedrif(aar);
                    break;

                default:
                    System.out.println("Du skrev noe feil, prøv på nytt.");
                    continue;
            }
        }
    }



}
