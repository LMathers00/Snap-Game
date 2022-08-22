package org.example;

import java.util.ArrayList;

public class Main {
    private static int interval = 5;

    public static void main(String[] args) {
        ArrayList<Card> deck = CardUsage.getShuffledDeck();
        Snap game = new Snap(deck, "User A", "User B");
        String result = game.runGame();
        System.out.println(result);
    }
}