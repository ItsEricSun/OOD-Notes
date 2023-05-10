package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardCollectionTest {

    @Test
    public void checkToString() {
        Card c = new Card('5', 'H');
        Card d = new Card('8', 'D');
        CardCollection cc = new CardCollection();
        cc.addCard(c);
        cc.addCard(d);
        assertEquals("{[5 H][8 D]}", cc.toString());
    }

}