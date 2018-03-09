package com.odigeo.finance.training.designpatterns.template;

public class HumanFighter extends Fighter {
    public HumanFighter() {
        super("human");
    }

    @Override
    public String powerUp() {
        return "Fighter tries to power up... but is only a human :(";
    }
}
