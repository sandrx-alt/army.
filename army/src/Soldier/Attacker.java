package Soldier;

public class Attacker extends Soldier {
    public Attacker(String name, int health) {
        super(name, health);
    }

    public void attack() {
        System.out.println(getName() + " is attacking! ");
    }
}
