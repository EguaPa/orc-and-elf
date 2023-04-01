package spawner;

import model.Elf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ElfSpawnerTest {

    private final ElfSpawner elfSpawner = new ElfSpawner();

    @Test
    void shouldReturnElfOnFirstCall() {
        Elf elf = elfSpawner.spawnElf();

        assertNotNull(elf);
    }

    @Test
    void shouldReturnNullOnEleventhCall() {
        for (int i = 0; i < 10; i++) {
            elfSpawner.spawnElf();
        }

        Elf elf = elfSpawner.spawnElf();

        assertNull(elf);
    }

}