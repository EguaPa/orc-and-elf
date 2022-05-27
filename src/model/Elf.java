package model;

import java.util.Random;

public class Elf extends Unit {

    public Elf(int health, int armor, int minDamage, int maxDamage) {
        this.health = health;
        this.armor = armor;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    @Override
    public int ability() {
        int a = new Random().nextInt(10);
        if (a < 3) {// 30% chance
            return 2;
        } else {// 80% chance
            return 0;
        }
    }

    @Override
    public void printHealth() {
        System.out.println("model.Elf current health is: " + health);
    }

    @Override
    public void takeDamage(int damage) {
        if (damage < armor) {
            return;
        }
        health += ability();
        int finalDamage = damage - armor;
        if (finalDamage > health) {
            health = 0;
        } else {
            health -= finalDamage;
        }
    }

    public void attack(Orc orc) {
        Random random = new Random();
        int randomAttack = random.nextInt((maxDamage - minDamage) + minDamage);
        orc.takeDamage(randomAttack);

    }
}


