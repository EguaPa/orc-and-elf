package model;

public abstract class Unit {

    protected int health;
    protected int armor;
    protected int minDamage;
    protected int maxDamage;

    public int getHealth() {
        return health;
    }
    public int getArmor() {
        return armor;
    }
    public int getMinDamage() {
        return minDamage;
    }
    public int getMaxDamage() {
        return maxDamage;
    }

    public abstract void takeDamage(int damage);
    public abstract int ability();
    public abstract void printHealth();
}
