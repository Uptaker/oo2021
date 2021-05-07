package org.tammeoja;

import org.junit.BeforeClass;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

    static Word word;
    static Sentence sentence;

    @BeforeClass
    public static void init() {
        word = new Word("pere");
        sentence = new Sentence("i am a sentence weee look at me me me AAAAA");
    }

    // Koosta automaattestid töö kontrolliks näitamaks a, p ja e-tähtede arvu sõnas
    // pere
    @Test
    public void letterExists() {
        assertEquals(1, word.howManyLetters('p'));
        assertEquals(2, word.howManyLetters('e'));
        assertEquals(1, word.howManyLetters('r'));
    }

    @Test
    public void letterShouldNotExists() {
        assertEquals(0, word.howManyLetters('a'));
        assertEquals(0, word.howManyLetters('b'));
        assertEquals(0, word.howManyLetters('c'));
    }

    // Koosta automaattest lause a-tähtede arvu kontrolli õigsuse kohta.
    @Test
    public void letterACounterIsCorrect() {
        assertEquals(8, sentence.howManyALetters());
    }
}
