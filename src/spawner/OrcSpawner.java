package spawner;

import model.Orc;

import java.util.ArrayList;
import java.util.Random;

public class OrcSpawner{

    private int orcCount = 0;

    private final Random random = new Random();
    private final ArrayList<Orc> orcsList = new ArrayList<>();

    {
        for (int i = 0; i < 10; i++) {
            orcsList.add(createOrc());
        }

    }

    public int getOrcCount() {
        return orcCount;
    }

    public Orc spawnOrc() {
        if (orcCount > 9)
            return null;
        return orcsList.get(orcCount++);

    }


    private Orc createOrc(){
        int health = random.nextInt(100) + 1;
        int armor = random.nextInt(5) + 1;
        int minDamage = random.nextInt(5) + 1;
        int maxDamage = minDamage + random.nextInt(5) + 1;
        return new Orc(health, armor, minDamage, maxDamage);


    }




    }

