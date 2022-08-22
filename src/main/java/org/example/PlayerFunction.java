package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerFunction {
    private String name;
    private String playerOne = "";
    private String playerTwo = "";
    private ArrayList<Card> deckOfCards;
    int turn = 0;


    public PlayerFunction(String name, ArrayList<Card> deck, String playerOne, String playerTwo) {
        this.name = name;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.deckOfCards = deck;
    }

    //Determines who's turn
    public String getPlayerTurn(int i) {
        String isPlayerTurn = "";
        if (i % 2 == 0) {
            isPlayerTurn = playerOne;
            return (playerOne);
        } else {
            isPlayerTurn = playerTwo;
            return (playerTwo);
        }
    }


    public String startGame() {
        Scanner readInput = new Scanner(System.in);
        String enterKey;
        Card cardBefore;
        Card cardNow;
        boolean isWin;
        String isPlayerTurn = "";
        System.out.println("The game is " + name.toLowerCase() + "...");
        for (int i = 0; i < 52; i++) {
            getPlayerTurn(i);
            //On even = player one turn
            if (i % 2 == 0) {
                isPlayerTurn = playerOne;
                System.out.println(playerOne + " your turn! Press enter");
            } else {
                // On odd player turn
                isPlayerTurn = playerTwo;
                System.out.println(playerTwo + " your turn! Press enter");
            }
            enterKey = readInput.nextLine();
            enterKey.equals("");
            cardBefore = deckOfCards.get(turn);
            turn++;
            cardNow = deckOfCards.get(turn);
        }
        return "It's a draw";
    }
}
