public class brokKlasse {
    private int teller;
    private int nevner;

    public brokKlasse(int teller, int nevner) {
        this.teller = teller;
        this.nevner = nevner;
        if(nevner == 0){
            throw new ArithmeticException("Du har skrevet inn en ugyldig verdi");
        }
    }

    public brokKlasse(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }

    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    public void summer(int inpTeller, int inpNevner) {
        this.teller = (this.teller*inpNevner)+(inpTeller*this.nevner);
        this.nevner = this.nevner*inpNevner;
    }

    public void subtraher(int inpTeller, int inpNevner) {
        this.teller = (this.teller*inpNevner)+(inpTeller*this.nevner);
        this.nevner = this.nevner*inpNevner;
    }

    public void multiplisere(int inpTeller, int inpNevner) {
        this.teller = this.teller*inpTeller;
        this.nevner = this.nevner*inpNevner;
    }

    public void dividere(int inpTeller, int inpNevner) {
        this.teller = this.teller*inpNevner;
        this.nevner = this.nevner*inpTeller;
    }

    public String getSvar() {
       return this.teller + "/" + this.nevner;
    }
}
