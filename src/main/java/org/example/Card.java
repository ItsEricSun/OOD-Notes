package org.example;

public class Card {

    private char value;
    private char suit;

    public Card(char v, char s) {
        value = v;
        suit = s;
    }

    public String toString() {
        return "[" + value + " " + suit + "]";
    }
}
