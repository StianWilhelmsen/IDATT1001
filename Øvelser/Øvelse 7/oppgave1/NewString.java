package Arbeidskrav.oving7.oppgave1;

public class NewString {
    private String text;

    public NewString(String text) {
        this.text = text;
    }


    public String abbreviation() {
        String text1 = text;
        String text3 = ""; //Final text to print
        String[] text2 = text1.split(" ");
        for (int i = 0; i < text2.length; i++) {
            text3 += (text2[i].charAt(0));
            }
        return text3;
        }


    public NewString remove(String letterRemoved) {
        String letter = letterRemoved;

        String text3 = text.replaceAll(letter, "");

        return new NewString(text3);
    }

    //}

    public String toString() {
        return text;
    }

}




