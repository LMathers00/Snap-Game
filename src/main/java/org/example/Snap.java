package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

public class Snap extends CardGame {
    private ArrayList<Card> deckOfCards;
    String playerOne = "";
    String playerTwo = "";

    public Snap(ArrayList<Card> deck, String playerOne, String playerTwo) {
        super("snap", deck);
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.deckOfCards = deck;
    }

    public String getPlayerTurn(int i) {
        String isPlayerTurn = "";
        if (i % 2 == 0) {
            return isPlayerTurn = playerOne;
        } else {
            return isPlayerTurn = playerTwo;
        }
    }
    public boolean isMatch(Card first, Card second) {
        return first.getValue() == second.getValue();
    }

    public String runGame() {
        //get name of player
        Scanner readInput = new Scanner(System.in);
        System.out.println("The game is " + this.getName().toLowerCase() + " press enter to play.");

        for (int i = 0; i < 51; i++) {
            readInput.nextLine();
            Card cardBefore = deckOfCards.get(i);
            Card cardNow = deckOfCards.get(i + 1);

            if (isMatch(cardBefore, cardNow)) {
                System.out.println(cardBefore.toString() + " Next card: " + cardNow.toString() + getPlayerTurn(i) + ".You have 5 seconds to type, hit enter to win the game!");
                return handleMatch(i);
            } else {
                System.out.println(cardBefore.toString() + " Next card: " + cardNow.toString() + " It's not a match!");
            }
        }

        return "It's a draw";
    }

    public String handleMatch(int currentTurn) {
        TimerFunction timer = new TimerFunction(5, new Timer());
        Scanner scanSnap = new Scanner(System.in);
        String winningPlayer = getPlayerTurn(currentTurn);

        timer.startTimer();
        String userInput = scanSnap.nextLine().toLowerCase();
        timer.cancelTimer();

        if (userInput.equals("snap") && timer.getTimeRemaining() != 0) {
            return winningPlayer + " you win!";
        }

        return "Sorry too slow, keep playing";
    }

}
