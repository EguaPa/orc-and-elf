package spawner;

import model.Elf;
import java.util.Random;


public class ElfSpawner {

    private final Random random = new Random();


    public Elf spawnElf (){
        int health = random.nextInt(100) + 1;
        int armor = random.nextInt(5) + 1;
        int minDamage = random.nextInt(5) + 1;
        int maxDamage = minDamage + random.nextInt(5) + 1;
        return new Elf(health, armor, minDamage, maxDamage);
    }
}