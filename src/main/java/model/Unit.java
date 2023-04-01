package model;

public abstract class Unit {

    protected int health;
    protected int initialHealth;
    protected int armor;
    protected int minDamage;
    protected int maxDamage;
    private boolean isZombie;

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

    public void restoreHealth() {
        if (!isZombie) {
            isZombie = true;
            health = initialHealth;
        }
    }

    public boolean isZombie() {
        return isZombie;
    }


    public abstract void takeDamage(int damage);

    public abstract int ability();

    public abstract void printHealth();
}
