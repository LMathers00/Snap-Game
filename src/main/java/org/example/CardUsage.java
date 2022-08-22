package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CardUsage {

    public static ArrayList<Card> getUnshuffledDeck() {
        ArrayList<Card> deckOfCards = new ArrayList<>();
        HashMap<Integer, String> suitHash = new HashMap<Integer, String>();
        suitHash.put(1, "A");
        suitHash.put(2, "2");
        suitHash.put(3, "3");
        suitHash.put(4, "4");
        suitHash.put(5, "5");
        suitHash.put(6, "6");
        suitHash.put(7, "7");
        suitHash.put(8, "8");
        suitHash.put(9, "9");
        suitHash.put(10, "10");
        suitHash.put(11, "Jack");
        suitHash.put(12, "Queen");
        suitHash.put(13, "King");

        for (int j = 1; j <= suitHash.size(); j++) {
            deckOfCards.add(new Card("♤ (Spades)", suitHash.get(j), j));
            deckOfCards.add(new Card(" ⃟  (Diamonds)", suitHash.get(j), j));
            deckOfCards.add(new Card("♡ (Hearts)", suitHash.get(j), j));
            deckOfCards.add(new Card("♧ (Clubs)", suitHash.get(j), j));
        }

        return deckOfCards;
    }

    public static ArrayList<Card> getShuffledDeck() {
        ArrayList<Card> deck = getUnshuffledDeck();
        Collections.shuffle(deck);
        return deck;
    }
}
