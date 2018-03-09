package com.odigeo.finance.training.designpatterns.template;

import java.security.InvalidParameterException;

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

public class Fighter {

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

    public String powerUp() {
        if (this.type.equals("human")) {
            return "Fighter tries to power up... but is only a human :(";
        } else if (this.type.equals("saiyan")) {
            return "Fighter has powered up and now is a supersaiyan!";
        } else if (this.type.equals("monster")) {
            return "Fighter has powered up and now has an ugly transformation!";
        }
        throw new InvalidParameterException();
    }
}
