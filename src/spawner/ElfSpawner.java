package spawner;

import model.Elf;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;


public class ElfSpawner {


    private final Random random = new Random();

    private final Queue<Elf> elvesQueue = new ArrayDeque<>();

    {
        for (int i = 0; i < 10; i++) {
            elvesQueue.add(createElf());
        }

    }


    public Elf spawnElf() {
        return elvesQueue.poll();

    }

    private Elf createElf() {
        int health = random.nextInt(100) + 1;
        int armor = random.nextInt(1) + 1;
        int minDamage = random.nextInt(5) + 1;
        int maxDamage = minDamage + random.nextInt(5) + 1;
        return new Elf(health, armor, minDamage, maxDamage);
    }
}