package com.odigeo.finance.training.designpatterns.template;

public class SaiyanFighter extends Fighter {
    public SaiyanFighter() {
        super("saiyan");
    }

    @Override
    public String powerUp() {
        return "Fighter has powered up and now is a supersaiyan!";
    }
}
