import model.Elf;
import model.Orc;
import necromant.Necromant;
import spawner.ElfSpawner;
import spawner.OrcSpawner;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 100; i++) {
            fight();
        }

    }

    private static void fight() {
        OrcSpawner orcSpawner = new OrcSpawner();
        Orc orc = orcSpawner.spawnOrc();
        ElfSpawner elfSpawner = new ElfSpawner();
        Elf elf = elfSpawner.spawnElf();
        Necromant necromant = new Necromant();

        while (true) {
            orc.attack(elf);
            elf.printHealth();

            if (elf.getHealth() == 0) {
                necromant.dratZombieElf(elf);
                elf = elfSpawner.spawnElf();
                if (elf == null) {
                    elf = necromant.releaseZombieElf();
                    if (elf == null) {
                        System.out.println("Orc won !!!");
                        break;
                    }
                    System.out.println("A new Zombie Elf is summoned !!!");
                } else {
                    System.out.println("A new ELF is summoned");
                }

            }

            elf.attack(orc);
            orc.printHealth();
            if (orc.getHealth() == 0) {
                necromant.draftZombieOrc(orc);
                orc = orcSpawner.spawnOrc();
                if (orc == null) {
                    orc = necromant.releaseZombieOrc();
                    if (orc == null) {
                        System.out.println("Elf won !!!");
                        break;
                    }
                    System.out.println("A new Zombie Orc is summoned !!!");
                } else {
                    System.out.println("A new ORC is summoned");
                }
            }


        }
    }
}
