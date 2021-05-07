package org.tammeoja;

// Tähed

// CHECK: Loo liides, mille ainus meetod saab sisendiks tähe ning väljastab selle tähe esinemise arvu.
// CHECK: Loo realiseeriv klass sõna tarbeks.
// NOT YET Koosta automaattestid töö kontrolliks näitamaks a, p ja e-tähtede arvu sõnas pere.

// CHECK: Loo liidest realiseeriv klass Lause.
// CHECK: Lauselt saab lisaks küsida sõnade arvu
// CHECK: ning Sõna-klassi eksemplaride massiivi. 
// Koosta rakendus, kus saab ette anda lause ning väljastatakse a-tähtede arv terves lauses ning igas sõnas eraldi. Koosta automaattest lause a-tähtede arvu kontrolli õigsuse kohta.
// * Kõik lausetes leidunud eri sõnad lisatakse faili. Rakenduse väljundis näidatakse, millised sõnad on sisendlausest uued ning millised juba varem olemas olnud. 

public class Main {
    public static void main(String[] args) {

        // how many l letters in this word
        Word word = new Word("hello");
        System.out.println(word.howManyLetters('l'));

        // how many x letters in this sentence
        Sentence sentence = new Sentence("i am a sentence weee look at me xxx");
        System.out.println(sentence.howManyLetters('x'));

        // how many words in sentence
        System.out.println(sentence.howManyWords());

        // request list of Word class words from sentence
        System.out.println(sentence.requestWordList());
    }
}
