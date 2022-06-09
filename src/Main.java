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

//        Orc orc = new Orc(100, 1, 3, 5);
//        Elf elf = new Elf(100, 2, 2, 4);
        int elves = 1;
        int orcs = 1;
        while (true){
            orc.attack(elf);
            elf.printHealth();

            if (elf.getHealth() == 0 && elves < 10){
                elves++;
                elf = elfSpawner.spawnElf();
//                elf.spawnElf();
                System.out.println("model.Orc won !!!");
                break;
            }

            elf.attack(orc);
            orc.printHealth();
            if (orc.getHealth() == 0){
//                orc.spawnOrc();
                System.out.println("model.Elf won !!!");
                break;
            }


        }
    }
}
