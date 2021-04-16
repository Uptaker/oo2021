package org.teamwork;

import java.io.IOException;
import java.util.Scanner;

//import jdk.internal.loader.AbstractClassLoaderValue.Sub;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    //static boolean isGameActive = true;
    static String input="aaaaa";

    
    public static void main(String[] args) throws IOException {
        //boolean isGameActive = true;
        System.out.println(input);
        difficulty(input);
    }
    
    public static String difficulty(String input) throws IOException{

        boolean isGameActive = true;

        while (isGameActive) {
            System.out.println("Please select a difficulty:");
            System.out.println("easy - 12 failed guesses, easy words");
            System.out.println("normal - 8 failed guesses, common words");
            System.out.println("hard - 3 failed guesses, difficult words");
            System.out.println("hardcore - 1 failed guess, insanely difficult");
            //String winput;
            //input = winput;
            //winput = input;
            //input = Main.input;
            String winput = sc.nextLine().toLowerCase();
            //winput = input;
            //System.out.println(winput);

            if (winput.equals("easy")) {
                Difficulty game = new Easy();
                game.startGame(sc);
                game = null;
            } else if (winput.equals("quit")) {
                System.out.println("You've quit the game.");
                isGameActive = false;
                sc.close();
            } else if (input.equals("normal")) {
                Difficulty game = new Normal();
                game.startGame(sc);
                game = null;
            } else if (input.equals("hard")) {
                Difficulty game = new Hard();
                game.startGame(sc);
                game = null;
            } else if (input.equals("hardcore")) {
                Difficulty game = new Hardcore();
                game.startGame(sc);
                game = null;
            } else {
                System.out.println("( ! ) Invalid command.");
            }
            input = winput;
            //return input;
        
        }
        System.out.println("sse "+input);
        return input;
        
       
        
    }
}




    /*public static boolean isGameActive() throws IOException{

        boolean isGameActive = true;

        while (isGameActive) {
            System.out.println("Please select a difficulty:");
            System.out.println("easy - 12 failed guesses, easy words");
            System.out.println("normal - 8 failed guesses, common words");
            System.out.println("hard - 3 failed guesses, difficult words");
            System.out.println("hardcore - 1 failed guess, insanely difficult");
            String input = sc.nextLine().toLowerCase();
            if (input.equals("easy")) {
                Difficulty game = new Easy();
                game.startGame(sc);
                game = null;
            } else if (input.equals("quit")) {
                System.out.println("You've quit the game.");
                isGameActive = false;
                sc.close();
            } else if (input.equals("normal")) {
                Difficulty game = new Normal();
                game.startGame(sc);
                game = null;
            } else if (input.equals("hard")) {
                Difficulty game = new Hard();
                game.startGame(sc);
                game = null;
            } else if (input.equals("hardcore")) {
                Difficulty game = new Hardcore();
                game.startGame(sc);
                game = null;
            } else {
                System.out.println("( ! ) Invalid command.");
            }

        }
        
        return isGameActive;
    }*/
/*while (isGameActive) {
            System.out.println("Please select a difficulty:");
            System.out.println("easy - 12 failed guesses, easy words");
            System.out.println("normal - 8 failed guesses, common words");
            System.out.println("hard - 3 failed guesses, difficult words");
            System.out.println("hardcore - 1 failed guess, insanely difficult");
            //String winput;
            //input = winput;
            //winput = input;
            //input = Main.input;
            String input = sc.nextLine().toLowerCase();
            //winput = input;
            //System.out.println(winput);

            if (input.equals("easy")) {
                Difficulty game = new Easy();
                game.startGame(sc);
                game = null;
            } else if (input.equals("quit")) {
                System.out.println("You've quit the game.");
                isGameActive = false;
                sc.close();
            } else if (input.equals("normal")) {
                Difficulty game = new Normal();
                game.startGame(sc);
                game = null;
            } else if (input.equals("hard")) {
                Difficulty game = new Hard();
                game.startGame(sc);
                game = null;
            } else if (input.equals("hardcore")) {
                Difficulty game = new Hardcore();
                game.startGame(sc);
                game = null;
            } else {
                System.out.println("( ! ) Invalid command.");
            }
            //input = winput;

        }
        
        //isGameActive();
        //difficulty(input);
        //difficulty();
     */   