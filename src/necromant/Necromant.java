package necromant;

import model.Elf;
import model.Orc;

import java.util.ArrayDeque;
import java.util.Queue;

public class Necromant {

    private final Queue<Orc> zombieOrcQueue = new ArrayDeque<>();
    private final Queue<Elf> zombieElfQueue = new ArrayDeque<>();

    public void draftZombieOrc(Orc orc) {
        if (!orc.isZombie()) {
            orc.restoreHealth();
            zombieOrcQueue.add(orc);
        }
    }

    public Orc releaseZombieOrc() {
        return zombieOrcQueue.poll();
    }

    public void dratZombieElf(Elf elf) {
        if (!elf.isZombie()) {
            elf.restoreHealth();
            zombieElfQueue.add(elf);
        }
    }

    public Elf releaseZombieElf() {
        return zombieElfQueue.poll();
    }
}
