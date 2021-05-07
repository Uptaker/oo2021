package org.tammeoja;

import java.util.ArrayList;
import java.util.List;

public class Sentence implements WordInterface {
    public String sentence;

    public Sentence(String sentence) {
        this.sentence = sentence;
    }

    public int howManyWords() {
        int count = 0;
        String[] splitWords = this.sentence.split(" ");
        if (this.sentence != null) {
            count = splitWords.length;
        }
        return count;
    }

    public List<Word> requestWordList() {
        String[] arr = this.sentence.split(" ");
        List<Word> wordObj = new ArrayList<>();
        for (int i = 0; arr.length > i; i++) {
            wordObj.add(new Word(arr[i]));
        }
        return wordObj;
    }

    @Override
    public int howManyLetters(char letter) {
        int count = 0;
        for (int i = 0; sentence.length() > i; i++) {
            if (sentence.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

}
