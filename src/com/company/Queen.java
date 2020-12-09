package com.company;

public class Queen extends Character {
    public Queen (){
        weaponBehavior = new BowAndArrowBehavior();
    }


    @Override
    void fight() {
        super.fight();
    }
}
