import model.Elf;
import model.Orc;
import spawner.ElfSpawner;
import spawner.OrcSpawner;

public class Main {
    public static void main(String[] args) {


        OrcSpawner orcSpawner = new OrcSpawner();
        Orc orc = orcSpawner.spawnOrc();
        ElfSpawner elfSpawner = new ElfSpawner();
        Elf elf = elfSpawner.spawnElf();

        while (true) {
            orc.attack(elf);
            elf.printHealth();

            if (elf.getHealth() == 0) {
                elf = elfSpawner.spawnElf();
                if (elf == null) {
                    System.out.println("Orc won !!!");
                    break;
                }
                System.out.println("A new ELF is summoned");

            }

            elf.attack(orc);
            orc.printHealth();
            if (orc.getHealth() == 0) {
                orc = orcSpawner.spawnOrc();
                if (orc == null) {
                    System.out.println("Elf won !!!");
                    break;
                }
                System.out.println("A new ORC is summoned");
            }


        }
        System.out.println("There have been summoned " + elfSpawner.getElfCount() + " elves");
        System.out.println("There have beed summoned " + orcSpawner.getOrcCount() + " orcs");
    }
}
