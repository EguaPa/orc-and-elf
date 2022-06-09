package spawner;

import model.Orc;

import java.util.Random;

public class OrcSpawner{
    private final Random random = new Random();

//    Orc orc = new Orc(100, 1, 3, 5);



    public Orc spawnOrc (){
        int health = random.nextInt(100) + 1;
        int armor = random.nextInt(5) + 1;
        int minDamage = random.nextInt(5) + 1;
        int maxDamage = minDamage + random.nextInt(5) + 1;
        return new Orc(health, armor, minDamage, maxDamage);

//        for (int i = 1; i < 10; i++) {
//            if (orc.getHealth() <= 0) {
//                Orc orc = new Orc(100, 1, 3, 5);
//            }
//        }
    }




    }

