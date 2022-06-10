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

        int elves = 1;
        int orcs = 1;
        while (true){
            orc.attack(elf);
            elf.printHealth();

            if (elf.getHealth() == 0 && elves < 10){
                elves++;
                elf = elfSpawner.spawnElf();
                System.out.println(elves);
                System.out.println("A new unit is summoned");

            }
            else if (elf.getHealth() == 0 && elves == 9){
                System.out.println("Orc won !!!");
                break;
            }

            elf.attack(orc);
            orc.printHealth();
            if (orc.getHealth() == 0){
                if (orcs < 10){
                    orcs++;
                    orc = orcSpawner.spawnOrc();
                    System.out.println(orcs);
                    System.out.println("A new orc is summoned");
                }
                else {
                    System.out.println("Elf won!!");
                    break;
                }
            }


        }
    }
}
