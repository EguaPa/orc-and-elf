package necromant;

import model.Elf;
import model.Orc;

import java.util.ArrayDeque;
import java.util.Queue;

public class Necromant {

    private final Queue<Orc> zombieOrcQueue = new ArrayDeque<>();
    private final Queue<Elf> zombieElfQueue = new ArrayDeque<>();

    public void draftZombieOrc(Orc orc) {
        if (!orc.isZombie() && orc.getHealth() == 0) {
            orc.restoreHealth();
            zombieOrcQueue.add(orc);
        }
    }

    public Orc releaseZombieOrc() {
        return zombieOrcQueue.poll();
    }

    public void draftZombieElf(Elf elf) {
        if (!elf.isZombie() && elf.getHealth() ==0) {
            elf.restoreHealth();
            zombieElfQueue.add(elf);
        }
    }

    public Elf releaseZombieElf() {
        return zombieElfQueue.poll();
    }
}
