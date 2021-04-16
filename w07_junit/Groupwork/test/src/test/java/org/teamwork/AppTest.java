package org.teamwork;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;

import java.io.IOException;

import static org.hamcrest.Matchers.*;

import org.junit.BeforeClass;
import org.junit.Test;

//import jdk.internal.util.xml.impl.Input;

//import jdk.internal.util.xml.impl.Input;

//import jdk.internal.util.xml.impl.Input;


public class AppTest {
    static Main main;
    static Easy easy;
    static Main secondmain;
    static Easy secondeasy;
    

    @Before
    public void init(){
        main = new Main();
        easy = new Easy();
    }

    

    @Test
    public void easypease(){
        assertEquals("", easy.attemptedLetters);
    }

    @Test 
    public void esimoisim(){
      assertNotEquals(easy.fails, 1);
    }

    @Test
    public void eeeee(){
        //easy.attemptedLetters = "2";
        assertNotEquals("2", easy.attemptedLetters);
    }

    @Test
    public void iiiii(){
        assertTrue("jaaa", easy.isWon == false);
       
    }

    @Test
    public void aaaaaa(){
        assertThat(main.input, startsWith("aaaa"));

    }

    @After
    public void winit(){
        secondmain = new Main();
    }

   

    @Test
    public void difficulty(){
        String aaa = "easy";
        String b = secondmain.input;
        assertEquals(aaa,b);
    }

    //was the right difficulty selected
    //test on praegu normaliga
    
    
    
    /*@Test
    public void WasHardDifficultySelected(){
        //assertEquals("difficulty should be hard","hard");
        //assertEquals(expected, actual);
    }*/
    

   

}


// Did the right letter appear in the screen
    // does the word match with guessed word


    // was the game started
    /*@Test
    public void DidGameStart() throws IOException{
        assertTrue(true == Main.isGameActive());
        //assertTrue("game shoudld be runnig", main.isGameActive()==true);
    }*/
