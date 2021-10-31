package Arbeidskrav.oving8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Arbtaker {
    private Person personalia;
    int arbeidsNr;
    int ansettelsesAar;
    double maanedsLonn;
    double skatteProsent;
    java.util.GregorianCalendar kalender = new GregorianCalendar(); // hente kalender


    /**
     * Dette er konstruktøren til klassen
     * @param person Et person objekt
     * @param arbNr Arbeidsnummer til person
     * @param ansattAar
     * @param mndLonn
     * @param skatteProsent
     */
    public Arbtaker(Person person, int arbNr, int ansattAar, double mndLonn, double skatteProsent) {
    this.personalia = person;
    this.arbeidsNr = arbNr;
    this.ansettelsesAar = ansattAar;
    this.maanedsLonn = mndLonn;
    this.skatteProsent = skatteProsent;

    }

    public Person getPerson() {
        return personalia;
    }

    public int getArbeidsNr() {
        return arbeidsNr;
    }

    public int getAnsettelsesAar() {
        return ansettelsesAar;
    }

    public String getNavn() {
        return this.personalia.etternavn + ", " + this.personalia.fornavn;
    }

    public int getAlder() {
        int aar = kalender.get(Calendar.YEAR);
        return aar - personalia.getDato();
    }

    public int getAarIBedrift() {
        int aar = kalender.get(Calendar.YEAR);
        return aar - getAnsettelsesAar();
    }

    public Boolean aarIBedrif(int aar) {
        if (aar <= getAarIBedrift()) {
            System.out.println("Ja\n");
            return true;
        }
        System.out.print("Nei\n");
        return false;
    }

    public double getMaanedsLonn() {
        return maanedsLonn;
    }

    public double getSkatteProsent() {
        return skatteProsent/100;
    }

    public void setArbeidsNr(int nyttAnsattNr) {
        this.arbeidsNr = nyttAnsattNr;
    }

    public void setAnsettelsesAar(int nyttAnsattAar) {
        this.ansettelsesAar = nyttAnsattAar;
    }

    public void setMaanedsLonn(double nyMndLonn) {
        this.maanedsLonn = nyMndLonn;
    }

    public void setSkatteProsent(double nySkatteProsent) {
        this.skatteProsent = nySkatteProsent/100;
    }

    public double skattPerAar() {
      double skattAar = (skattPerMnd() * 10 + (skattPerMnd()/2));
      return skattAar;
    }

    public double skattPerMnd() {
        double skattMnd = getMaanedsLonn() * getSkatteProsent();
        return skattMnd;
    }

    public double bruttoLonn() {
        double bruttoAar = getMaanedsLonn() * 12;
        return bruttoAar;
    }

}


