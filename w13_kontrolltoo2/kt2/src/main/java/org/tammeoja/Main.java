package org.tammeoja;

// Tähed

// CHECK: Loo liides, mille ainus meetod saab sisendiks tähe ning väljastab selle tähe esinemise arvu.
// CHECK: Loo realiseeriv klass sõna tarbeks.
//  Koosta automaattestid töö kontrolliks näitamaks a, p ja e-tähtede arvu sõnas pere.
// * Loo liidest realiseeriv klass Lause. Lauselt saab lisaks küsida sõnade arvu ning Sõna-klassi eksemplaride massiivi. Koosta rakendus, kus saab ette anda lause ning väljastatakse a-tähtede arv terves lauses ning igas sõnas eraldi. Koosta automaattest lause a-tähtede arvu kontrolli õigsuse kohta.
// * Kõik lausetes leidunud eri sõnad lisatakse faili. Rakenduse väljundis näidatakse, millised sõnad on sisendlausest uued ning millised juba varem olemas olnud. 

public class Main {
    public static void main(String[] args) {
        Word word = new Word("hello");
        System.out.println(word.howManyLetters('l'));
    }
}
