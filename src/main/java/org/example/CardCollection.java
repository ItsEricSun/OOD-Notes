package org.example;

import java.util.ArrayList;

public class CardCollection {
    private ArrayList<Card> cardcollection = new ArrayList<>();

    public void addCard(Card c) {
        cardcollection.add(c);
    }

    //{[5 H][6 C]}
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("{");
        for (Card c : cardcollection) {
            s.append(c);
        }
        s.append("}");
        return s.toString();
    }
}
