package com.company;

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public void setWeapon (WeaponBehavior w) {
        weaponBehavior = w;
    }

    void fight(){

    }
    public void performWeapon() {
        weaponBehavior.useWeapon();
    }
}
