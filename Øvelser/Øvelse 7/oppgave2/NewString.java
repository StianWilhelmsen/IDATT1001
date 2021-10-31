package Arbeidskrav.oving7.oppgave2;

public class NewString {
    private String text;

    public NewString (String text) {
        this.text = text;
    }

    public double numberOfWords() {
        return text.split(" ").length;
    }

    public int totalLetters() {
        String text1 = text;

        String text2 = text1.replaceAll("[.,:;?! ] ", "");
        int text2Length = text2.length();

        return text2Length;
    }

    public double averageWordLength() {
        double sum = text.replaceAll("[.,:;?! ]", "").length();
        return  sum / numberOfWords();
    }


    public double averageWordSentences() {
        String text1 = text;
        double periods = 0;

        for (int i = 0; i < text1.length(); i++) {
            if (text.charAt(i) == ':'
                    || text.charAt(i) == '.'
                    || text.charAt(i) == '!'
                    || text.charAt(i) == '?') periods++;
        }
        if (periods == 0) return 0;

        return numberOfWords() / periods;
    }




    public NewString replaceWord(String oldWordObject, String newWordObject) {
        String text1 = text;
        String oldWord = oldWordObject;
        String newWord = newWordObject;

        String text2 = text1.replaceAll(oldWord, newWord);

        return new NewString(text2);
    }

    public NewString printText() {
        String text1 = text;
        return new NewString(text1);
    }

    public NewString upperCase() {
        String text1 = text;
        String text2 = text1.toUpperCase();

        return new NewString(text2);
    }

    @Override
    public String toString() {
        return text;
    }
}
