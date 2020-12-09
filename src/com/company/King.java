package com.company;

public class King extends Character{
    public King () {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    void fight() {
        super.fight();
    }
}
