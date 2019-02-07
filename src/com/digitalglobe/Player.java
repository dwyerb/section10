package com.digitalglobe;

/**
 * Created by Brendan on 1/30/2019.
 */
public abstract class Player {
    private String name;

    public Player(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
