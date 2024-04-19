package com.workintech.egesua;

public class Player2 {
    private String name;
    private int healthPercentage;
    Weapon2 weapon;

    public Player2(String name, int healthPercentage, Weapon2 weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkHealth(this.healthPercentage);
        this.weapon = weapon;
    }

    private void checkHealth(int healthPercentage) {
        if (healthPercentage < 0) {
            this.healthPercentage = 0;
        }
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        }
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }

    public void loseHealth(int damage) {
        int healthRemaining = this.healthPercentage - damage;
        if( healthRemaining < 0 ) {
            System.out.println(name + " player is dead.");
        }
        healthPercentage = healthRemaining;
        checkHealth(healthPercentage);
    }

    @Override
    public String toString() {
        return "Player2{" +
                "name='" + name + '\'' +
                ", healthPercentage=" + healthPercentage +
                ", weapon=" + weapon +
                '}';
    }
}
