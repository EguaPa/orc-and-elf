package model;

import java.util.Random;

public class Orc extends Unit{

    public Orc(int health, int armor, int minDamage, int maxDamage) {
        this.health = health;
        this.initialHealth = health;
        this.armor = armor;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    @Override
    public int ability() {
        int a = new Random().nextInt(10);
        if (a < 2) {// 20% chance
            return 2;
        } else {// 80% chance
            return 1;
        }
    }
    @Override
    public void printHealth() {
        System.out.println("Orc current health is: " + health);
    }
    @Override
    public void takeDamage(int damage) {
        if (damage < armor)
            return;
        int finalDamage = damage - armor;
        if (finalDamage > health)
            health = 0;
        else
            health -= finalDamage;
    }

    public void attack(Elf elf) {
        Random random = new Random();
        int damage = random.nextInt(maxDamage + 1 - minDamage) + minDamage;
        damage *= ability();
        elf.takeDamage(damage);
    }

}
