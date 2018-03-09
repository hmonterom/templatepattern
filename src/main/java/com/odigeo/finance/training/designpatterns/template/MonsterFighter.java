package com.odigeo.finance.training.designpatterns.template;

public class MonsterFighter extends Fighter {
    public MonsterFighter() {
        super("monster");
    }

    @Override
    public String powerUp() {
        return "Fighter has powered up and now has an ugly transformation!";
    }
}
