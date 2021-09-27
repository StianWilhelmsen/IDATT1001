public class BrokTestKlient {
    public static void main(String [] args) {
        int teller3 = 2;
        int nevner3 = 2;
        int teller4 = 2;
        int nevner4 = 6;

        brokKlasse brok3 = new brokKlasse(teller3, nevner3);

        System.out.println(brok3.getSvar());
        brok3.summer(teller4, nevner4);
        System.out.println(brok3.getSvar());
        System.out.println("Test for summering er ok");

        System.out.println(brok3.getSvar());
        brok3.subtraher(teller4, nevner4);
        System.out.println(brok3.getSvar());
        System.out.println("Test for subtraksjon er ok");

        System.out.println(brok3.getSvar());
        brok3.multiplisere(teller4, nevner4);
        System.out.println(brok3.getSvar());
        System.out.println("Test for multiplikasjon er ok");

        System.out.println(brok3.getSvar());
        brok3.dividere(teller4, nevner4);
        System.out.println(brok3.getSvar());
        System.out.println("Test for divisjon er ok");
    }
}
