package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Path p = Path.of("sampleData/cards.txt");
        Scanner s = null;
        try {
            s = new Scanner(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        CardCollection cc = new CardCollection();
        int numberOfCards = s.nextInt();
        for (int i = 0; i < numberOfCards; i++) {
            char value = s.next().charAt(0);
            char suit = s.next().charAt(0);
            Card c = new Card(value, suit);
            cc.addCard(c);
        }
        System.out.println(cc);
    }
}