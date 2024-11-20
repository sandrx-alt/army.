package Soldier;

public class Defender extends Soldier {
    public Defender(String name, int health) {
        super(name, health);
    }

    public void Defend() {
        System.out.println(getName() + " is defending! ");
    }

    public void defend() {

    }
}
