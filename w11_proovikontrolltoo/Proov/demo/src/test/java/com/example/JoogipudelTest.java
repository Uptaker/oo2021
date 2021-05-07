package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class JoogipudelTest {
    static Joogipudel joogipudel;
    static Jook jook;
    static Joogivaat vaat;
    static Kast kast;

    @BeforeClass
    public static void init() {
        jook = new Jook("Mingi alko", 0.7, 0.789);
        joogipudel = new Joogipudel(2, "A", 600, 0.1, jook);
        vaat = new Joogivaat(50, 20, jook);
        kast = new Kast(joogipudel);
    }

    // Jook - nothing to test

    // Joogipudel
    @Test
    public void getTotalEmptyMass() {
        assertEquals(2, joogipudel.getTotalMass(), 0.2);
    }

    @Test
    public void isBottleEmpty() {
        assertEquals(false, joogipudel.isT2idetud());
    }

    @Test
    public void priceIsWithDrink() {
        assertNotSame("price should be higher with drink", 0.1, joogipudel.getTotalPrice());
    }

    @Test
    public void isFullAfterFilling() {
        joogipudel.setT2idetud(true);
        assertEquals(true, joogipudel.isT2idetud());
    }

    @Test
    public void isMahtCorrect() {
        assertEquals(2, joogipudel.getMaht(), 0);
    }

    // Joogivaat

    // Kast
}
