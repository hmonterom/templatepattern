package com.odigeo.finance.training.designpatterns.template;

/**
 * METHOD TEMPLATE DESIGN PATTERN
 *
 * In order to avoid checking type in if statements, let's create a subclass for each figther type.
 *
 * 1. Make this class abstract, and make abstract all methods that depend on the fighter type
 * 2. Create a new class for each fighter type extending this one
 * 3. Override methods that depends on fighter type on the new subclasses
 * 4. Tests should be adapted to new subclasses
 */

public abstract class Fighter {

    private final String type;

    public Fighter(String inputFighterType) {
        type = inputFighterType;
    }

    public String getType() {
        return type;
    }

    public String attack() {
        return "Fighter has attacked!";
    }

    public String eatBean() {
        return "Fighter has eaten a magic bean and health has been restored!";
    }

    abstract public String powerUp();
}
