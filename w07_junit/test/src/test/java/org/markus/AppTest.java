package org.markus;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.Matchers.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static App app;

    @BeforeClass
    public static void init() {
        app = new App();
    }

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void checkName() {
        app.name = "Test";
        assertEquals("App name should be Test", "Test", app.getName());
    }

    @Test
    public void CheckSum() {
        assertTrue(4 == app.sum(2, 2));

        assertNotEquals(1, app.sum(2, 2)); //
        assertNotSame(1, app.sum(2, 2)); //
    }

    @Test
    public void doArraysEqual() {
        int[] arr = new int[] { 2, 3, 4, 5 };
        assertArrayEquals(arr, app.toArray(2, 3, 4, 5));
        assertThat(arr, is(app.toArray(2, 3, 4, 5))); //
    }

    @Test
    public void hamcrestTest() {
        assertThat(50, is(not(40)));
        assertThat(60, is(greaterThan(59)));
        assertThat("Hello", startsWith("Hel"));
    }

    @Test
    public void compareObjects() {
        App app1 = new App();
        App app2 = new App();
        App app3 = null;
        assertNotEquals(app1, app2);

        assertNotSame(app1, app2);//
        assertThat(app1, is(not(app2)));//
        assertNull(app3); //
    }
}
