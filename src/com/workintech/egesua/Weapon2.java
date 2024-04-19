package com.workintech.egesua;

public enum Weapon2 {
    SWORD(10, 0.5),
    AXE(13, 0.3),
    GREATSWORD(15, 0.1);



    private int damage;
    private double attackSpeed;

    Weapon2(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
