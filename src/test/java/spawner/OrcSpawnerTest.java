package spawner;

import model.Orc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class OrcSpawnerTest {
    private final OrcSpawner orcSpawner = new OrcSpawner();

    @Test
    void shouldReturnElfOnFirstCall() {
        Orc orc = orcSpawner.spawnOrc();

        assertNotNull(orc);
    }

    @Test
    void shouldReturnNullOnEleventhCall() {
        for (int i = 0; i < 10; i++) {
            orcSpawner.spawnOrc();
        }

        Orc orc = orcSpawner.spawnOrc();

        assertNull(orc);
    }
}
