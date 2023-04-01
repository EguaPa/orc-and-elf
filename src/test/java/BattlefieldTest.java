import model.Team;
import necromant.Necromant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import spawner.ElfSpawner;
import spawner.OrcSpawner;

class BattlefieldTest {
    @Test
    @Disabled
    void shouldFight(){
        OrcSpawner orcSpawner = new OrcSpawner();
        ElfSpawner elfSpawner = new ElfSpawner();
        Necromant necromant = new Necromant();

        Team winner = Battlefield.fight(orcSpawner, elfSpawner, necromant);

        Assertions.assertEquals(Team.ORCS, winner);
    }

}