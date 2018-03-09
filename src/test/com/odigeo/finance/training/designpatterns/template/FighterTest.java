package com.odigeo.finance.training.designpatterns.template;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FighterTest {

    @Test
    public void createAllTypeOfFighters() {
        Fighter humanFighter = new Fighter("human");
        Fighter saiyanFighter = new Fighter("saiyan");
        Fighter monsterFighter = new Fighter("monster");

        assertEquals(humanFighter.getType(), "human");
        assertEquals(saiyanFighter.getType(), "saiyan");
        assertEquals(monsterFighter.getType(), "monster");
    }

    @Test
    public void fightersAttack() {
        Fighter humanFighter = new Fighter("human");
        Fighter saiyanFighter = new Fighter("saiyan");
        Fighter monsterFighter = new Fighter("monster");

        assertEquals(humanFighter.attack(), "Fighter has attacked!");
        assertEquals(saiyanFighter.attack(), "Fighter has attacked!");
        assertEquals(monsterFighter.attack(), "Fighter has attacked!");
    }

    @Test
    public void fightersEatBean() {
        Fighter humanFighter = new Fighter("human");
        Fighter saiyanFighter = new Fighter("saiyan");
        Fighter monsterFighter = new Fighter("monster");

        assertEquals(humanFighter.eatBean(), "Fighter has eaten a magic bean and health has been restored!");
        assertEquals(saiyanFighter.eatBean(), "Fighter has eaten a magic bean and health has been restored!");
        assertEquals(monsterFighter.eatBean(), "Fighter has eaten a magic bean and health has been restored!");
    }

    @Test
    public void fightersPowerUp() {
        Fighter humanFighter = new Fighter("human");
        Fighter saiyanFighter = new Fighter("saiyan");
        Fighter monsterFighter = new Fighter("monster");

        assertEquals(humanFighter.powerUp(), "Fighter tries to power up... but is only a human :(");
        assertEquals(saiyanFighter.powerUp(), "Fighter has powered up and now is a supersaiyan!");
        assertEquals(monsterFighter.powerUp(), "Fighter has powered up and now has an ugly transformation!");
    }
}
