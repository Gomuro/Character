package com.company;

public class Knight extends Character{
    public Knight (){
        weaponBehavior = new SwordBehavior();
    }

    @Override
    void fight() {
        super.fight();
    }
}
