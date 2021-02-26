package com.lyx.demo;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Integer> cards;

    public Player(String name) {
        this.name = name;
        cards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Integer> cards) {
        this.cards = cards;
    }
}
