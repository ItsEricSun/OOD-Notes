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

        /*
        String input = args[0];
        int size = 0;
        try {
            size = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.err.println("Cannot parse " + input + " into integer.");
            System.exit(1);
        }
        if (size < 3) {
            System.err.println("Size has to be >= 3.");
            System.exit(1);
        }
        printTriangles(size);
         */
    }

    public static void printTriangles(int size) {
        StringBuilder s = new StringBuilder();
        s.append("*");
        System.out.println(s);
        for (int i = 0; i < size - 1; i++) {
            s.setLength(0);
            s.append("*");
            s.append(" ".repeat(i));
            s.append("*");
            System.out.println(s);
        }
        s.setLength(0);
        s.append("*".repeat(size + 1));
        System.out.println(s);
        for (int i = size - 2; i >= 0; i--) {
            s.setLength(0);
            s.append(" ".repeat(size - i - 1));
            s.append("*");
            s.append(" ".repeat(i));
            s.append("*");
            System.out.println(s);
        }
        s.setLength(0);
        s.append(" ".repeat(size));
        s.append("*");
        System.out.println(s);
    }
}