package org.tammeoja;

public class Word implements WordInterface {

    public String word;

    public Word(String word) {
        this.word = word;
    }

    // returns amount of letters
    @Override
    public int howManyLetters(char letter) {
        int count = 0;
        for (int i = 0; word.length() > i; i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return word;
    }

}
