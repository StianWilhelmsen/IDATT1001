package Arbeidskrav.oving8;

public final class Person {
    final String fornavn;
    final String etternavn;
    final int dato;

    public Person(String fnavn, String eNavn, int fDato) {
        fornavn = fnavn;
        etternavn = eNavn;
        dato = fDato;
    }

    public String getNavn() {
        return fornavn + etternavn;
    }

    public int getDato() {
        return dato;
    }
}
