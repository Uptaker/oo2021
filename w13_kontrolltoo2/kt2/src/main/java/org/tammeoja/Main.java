package org.tammeoja;

import java.io.IOException;

// Tähed

// CHECK: Loo liides, mille ainus meetod saab sisendiks tähe ning väljastab selle tähe esinemise arvu.
// CHECK: Loo realiseeriv klass sõna tarbeks.
// CHECK: Koosta automaattestid töö kontrolliks näitamaks a, p ja e-tähtede arvu sõnas pere.

// CHECK: Loo liidest realiseeriv klass Lause.
// CHECK: Lauselt saab lisaks küsida sõnade arvu
// CHECK: ning Sõna-klassi eksemplaride massiivi. 

// CHECK: Koosta rakendus, kus saab ette anda lause ning väljastatakse a-tähtede arv terves lauses ning igas sõnas eraldi. 
// CHECK: Koosta automaattest lause a-tähtede arvu kontrolli õigsuse kohta.
// CHECK: Kõik lausetes leidunud eri sõnad lisatakse faili. Rakenduse väljundis näidatakse, millised sõnad on sisendlausest uued ning millised juba varem olemas olnud. 

public class Main {
    public static void main(String[] args) throws IOException {

        // how many l letters in this word
        Word word = new Word("hello");
        System.out.println(word.howManyLetters('l'));

        // how many x letters in this sentence
        Sentence sentence = new Sentence("i am a sentence weee look at me me me AAAAA");
        System.out.println(sentence.howManyLetters('x'));

        // how many words in sentence
        System.out.println(sentence.howManyWords());

        // request list of Word objects using words from sentence
        System.out.println(sentence.requestWordList());

        // how many a letters are in the sentence
        System.out.println(sentence.howManyALetters());

        // print all unique words to a file
        sentence.PrintUniqueWordsToFile();

    }
}
