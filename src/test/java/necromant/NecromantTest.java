package necromant;

import model.Elf;
import model.Orc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NecromantTest {

    @Test
    void shouldNotDraftOrcThatIsAlive() {
        // data preparation
        Orc orc = new Orc(50, 50, 1, 2);
        Necromant necromant = new Necromant();

        // execution
        necromant.draftZombieOrc(orc);

        // assertion
        assertNull(necromant.releaseZombieOrc());

    }

    @Test
    void shouldDraftOrcThatIsDead() {
        // data preparation
        Orc orc = new Orc(50, 0, 1, 2);
        orc.takeDamage(50);
        Necromant necromant = new Necromant();

        // execution
        necromant.draftZombieOrc(orc);

        // assertion
        assertEquals(orc, necromant.releaseZombieOrc());
        assertEquals(50, orc.getHealth());
    }
    @Test
    void shouldNotDraftElfThatIsAlive() {
        // data preparation
        Elf elf = new Elf(50, 50, 1, 2);
        Necromant necromant = new Necromant();

        // execution
        necromant.draftZombieElf(elf);

        // assertion
        assertNull(necromant.releaseZombieElf());

    }

    @Test
    void shouldDraftElfThatIsDead() {
        // data preparation
        Elf elf = new Elf(50, 0, 1, 2);
        elf.takeDamage(100);
        Necromant necromant = new Necromant();

        // execution
        necromant.draftZombieElf(elf);

        // assertion
        assertEquals(elf, necromant.releaseZombieElf());
        assertEquals(50, elf.getHealth());
    }

}
