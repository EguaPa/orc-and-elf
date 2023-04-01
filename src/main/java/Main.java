import model.Elf;
import model.Orc;
import necromant.Necromant;
import spawner.ElfSpawner;
import spawner.OrcSpawner;

public class Main {
    public static void main(String[] args) {
        OrcSpawner orcSpawner = new OrcSpawner();
        ElfSpawner elfSpawner = new ElfSpawner();
        Necromant necromant = new Necromant();

        Battlefield.fight(orcSpawner, elfSpawner, necromant);
    }


}
