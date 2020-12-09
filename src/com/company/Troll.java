package com.company;

public class Troll extends Character{
    public Troll () {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    void fight() {
        super.fight();
    }
}
