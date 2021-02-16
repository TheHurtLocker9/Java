package com.lyx.demo;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<String> playerCards;

    public Player(String name) {
        this.name = name;
        playerCards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(ArrayList<String> playerCards) {
        this.playerCards = playerCards;
    }
}
