package spawner;

import model.Orc;

import java.util.Random;

public class OrcSpawner{
    private final Random random = new Random();



    public Orc spawnOrc (){
        int health = random.nextInt(100) + 1;
        int armor = random.nextInt(5) + 1;
        int minDamage = random.nextInt(5) + 1;
        int maxDamage = minDamage + random.nextInt(5) + 1;
        return new Orc(health, armor, minDamage, maxDamage);


    }




    }

