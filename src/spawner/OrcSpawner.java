package spawner;

import model.Orc;

import java.util.*;

public class OrcSpawner {


    private final Random random = new Random();

    private final Queue<Orc> orcQueue = new ArrayDeque<>();

    {
        for (int i = 0; i < 10; i++) {
            orcQueue.add(createOrc());
        }
    }


    public Orc spawnOrc() {
        return orcQueue.poll();

    }


    private Orc createOrc() {
        int health = random.nextInt(100) + 1;
        int armor = random.nextInt(5) + 1;
        int minDamage = random.nextInt(5) + 1;
        int maxDamage = minDamage + random.nextInt(5) + 1;
        return new Orc(health, armor, minDamage, maxDamage);


    }


}

