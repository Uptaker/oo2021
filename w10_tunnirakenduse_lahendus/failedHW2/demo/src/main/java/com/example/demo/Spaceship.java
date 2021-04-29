package com.example.demo;

import org.springframework.stereotype.Component;

@Component("space1")
public class Spaceship {
    private int cows;
    private String name;

    public int getCows() {
        return this.cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Spaceship " + name + " has " + cows + " cows";
    }

    public void abduct() {
        System.out.println("Cow abducted");
    }

}
