package org.teamwork;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Easy implements Difficulty {
    public String word;
    public String attemptedLetters = "";
    public String[] wordLetters;
    public String hidden;
    public String[] hiddenLetters;
    public int fails = 0;
    public boolean active = true;
    public boolean isWon = false;
    public boolean isFailed = false;

    @Override
    // various hangman states, last one sets game to lose
    public void result(int step) {
        switch (step) {
        case 1:
            System.out.println("|____________|");
            break;
        case 2:

            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            break;
        case 3:
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            break;
        case 4:
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            break;
        case 5:
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            break;
        case 6:
            System.out.println("  ____");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            break;
        case 7:
            System.out.println("  __________");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            break;
        case 8:
            System.out.println("  __________");
            System.out.println("  |        |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            break;
        case 9:
            System.out.println("  __________");
            System.out.println("  |        |");
            System.out.println("  |        O");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("  |");
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            break;
        case 10:
            System.out.println("  __________");
            System.out.println("  |        |");
            System.out.println("  |        O");
            System.out.println("  |       /|");
            System.out.println("  |        |");
            System.out.println("  |");
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            break;
        case 11:
            System.out.println("  __________");
            System.out.println("  |        |");
            System.out.println("  |        O");
            System.out.println("  |       /|");
            System.out.println("  |        |");
            System.out.println("  |       /");
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            break;
        case 12:
            System.out.println("  __________");
            System.out.println("  |        |");
            System.out.println("  |        O");
            System.out.println("  |       /|\\");
            System.out.println("  |        |");
            System.out.println("  |       /");
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
        case 13:
            System.out.println("  __________");
            System.out.println("  |        |");
            System.out.println("  |        O");
            System.out.println("  |       /|\\                 YOU FAIL!");
            System.out.println("  |        |");
            System.out.println("  |       / \\");
            System.out.println("__|_______");
            System.out.println("|        |");
            System.out.println("|        |___");
            System.out.println("|____________|");
            this.isFailed = true;
            break;
        }
    }

    @Override
    // picks a random word from a text file
    public void pickWord() throws IOException {
        File file = new File("../easy.txt"); // word list from https://gist.github.com/deekayen/4148741
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        ArrayList<String> array = new ArrayList<String>();
        int count = 0;
        while (line != null) {
            array.add(line);
            count++;
            line = br.readLine();
        }
        fr.close();
        br.close();
        int rand = (int) (Math.random() * count + 1);
        this.word = array.get(rand);
    }

    @Override
    public void startGame(Scanner s) throws IOException {
        System.out.println("Welcome! You've picked the EASY difficulty");
        this.pickWord();
        System.out.println("Your genereated word is: " + hiddenWord() + ". Good luck!");
        this.active = true;
        // Scanner s = new Scanner(System.in);
        while (this.active) {
            if (isFailed) {
                System.out.println("Unfortunately, you've lost the game!\nBetter luck next time? :)");
                System.out.println("The word was: " + this.word.toUpperCase());
                System.out.println("---------------------------------------");
                // s.close();
                break;
            } else if (isWon) {
                System.out.println("CONGRATULATIONS! You've won!");
                System.out.println("You guessed wrong " + this.fails + " times!");
                System.out.println("---------------------------------------");
                // s.close();
                break;
            } else {
                String input = s.nextLine().toLowerCase();
                if (input.length() > 1) {
                    System.out.println("Insert just one letter at a time!");
                } else if (input == null || input.length() == 0) {
                    System.out.println("Letter can't be empty!");
                } else if (this.attemptedLetters.contains(input)) {
                    System.out.println("You've already tried this letter!");
                } else {
                    if (this.word.contains(input)) {
                        System.out.println("CORRECT! " + input + " is in the word!");
                        this.attemptedLetters = this.attemptedLetters + input;
                        this.result(this.fails);
                    } else {
                        System.out.println("FAIL! Your attempts: " + this.printAttemptedLetters(input));
                        this.result(this.fails);
                    }
                    System.out.println("Solve: " + this.revealWord(input));
                }
            }
        }

    }

    @Override
    // creates the initial hidden string and hidden array, only used at the start.
    public String hiddenWord() {
        String hidden = "";
        this.hiddenLetters = new String[this.word.length()];
        for (int i = 0; i < this.word.length(); i++) {
            hidden = hidden + "-";
            this.hiddenLetters[i] = "_";
        }
        this.hidden = hidden;
        return hidden;
    }

    @Override
    // function for hidden word manipulation
    public String revealWord(String input) {
        // replaces hiddenLetters array with an updated one
        for (int i = 0; i < this.word.length(); i++) {
            char c = input.charAt(0);
            if (this.word.toLowerCase().charAt(i) == c) {
                this.hiddenLetters[i] = input;
            }
        }
        // replaces hidden string with an updated one
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.hiddenLetters.length; i++) {
            sb.append(hiddenLetters[i]);
        }
        this.hidden = sb.toString();

        if (this.hidden.contains(this.word.toLowerCase())) {
            this.isWon = true;
        }

        return this.hidden;
    }

    @Override
    // prints and saves all the input letters by the user
    public String printAttemptedLetters(String input) {
        this.fails++;
        this.attemptedLetters = this.attemptedLetters + input;

        String attempts = "";
        for (int i = 0; i < this.attemptedLetters.length(); i++) {
            attempts = attempts + this.attemptedLetters.charAt(i) + " ";
        }
        return attempts;
    }

}