package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    public void checkToString() {
        Card c = new Card('5', 'H');
        assertEquals("[5 H]", c.toString());
    }

}