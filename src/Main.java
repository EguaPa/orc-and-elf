import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Orc orc = new Orc(100, 1, 3, 5);
        Elf elf = new Elf(100, 2, 2, 4);

        while (true){
            orc.attack(elf);
            elf.printHealth();
            if (elf.getHealth() == 0){
                System.out.println("Orc won !!!");
                break;
            }

            elf.attack(orc);
            orc.printHealth();
            if (orc.getHealth() == 0){
                System.out.println("Elf won !!!");
                break;
            }


        }
    }
}
