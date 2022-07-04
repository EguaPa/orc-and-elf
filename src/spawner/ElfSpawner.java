package spawner;

import model.Elf;

import java.util.ArrayList;
import java.util.Random;


public class ElfSpawner {

    private int elfCount = 0;

    private final Random random = new Random();

    private final ArrayList<Elf> elvesList = new ArrayList<>();

    {
        for (int i = 0; i < 10; i++) {
            elvesList.add(createElf());
        }

    }

    public int getElfCount() {
        return elfCount;
    }

    public Elf spawnElf() {
        if (elfCount > 9)
            return null;
        return elvesList.get(elfCount++);

    }

    private Elf createElf() {
        int health = random.nextInt(100) + 1;
        int armor = random.nextInt(5) + 1;
        int minDamage = random.nextInt(5) + 1;
        int maxDamage = minDamage + random.nextInt(5) + 1;
        return new Elf(health, armor, minDamage, maxDamage);
    }
}