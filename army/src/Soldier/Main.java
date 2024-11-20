package Soldier;

public class Main {

    public static void Main(String[] args) {
        Soldier soldier1 = new Soldier("John", 100);
        Soldier soldier2 = new Soldier("Alice", 90);
        Soldier soldier3 = new Soldier("Peter", 80);
        Soldier soldier4 = new Soldier("Martin", 90);
        Soldier soldier5 = new Soldier("Laura", 70);
        Soldier soldier6 = new Soldier("Jozef", 80);


        Unit unit1 = new Unit("Alpha");
        unit1.addSoldier(soldier1);
        unit1.addSoldier(soldier2);
        unit1.addSoldier(soldier3);
        unit1.addSoldier(soldier4);
        unit1.addSoldier(soldier5);
        unit1.addSoldier(soldier6);

        Army army = new Army("infantry");
        army.addUnit(unit1);
        army.addUnit(unit1);

        System.out.println(army);

        //Simulate damage
        soldier1.takeDamage(10);
        System.out.println("After batlle: " + soldier2);

        soldier2.takeDamage(50);
        System.out.println(" After battle " + soldier1);

        soldier3.takeDamage(60);
        System.out.println(" After battle " + soldier3);
    }

    public static void main(String[] args) {
        Attacker attacker3 = new Attacker("John", 100);
        Attacker attacker2 = new Attacker("Peter", 80);
        Attacker attacker1 = new Attacker("Jozef", 80);


        Defender defender1 = new Defender("Alice", 90);
        Defender defender2 = new Defender("Laura", 70);
        Defender defender3 = new Defender("Martin", 90);

        defender1.takeDamage(40);
        System.out.println(" After battle " + defender2);

        defender2.takeDamage(50);
        System.out.println(" After battle " + defender1);

        defender3.takeDamage(90);
        System.out.println(" After battle " + defender1);

        Unit unit1 = new Unit("Alpha");
        unit1.addSoldier(attacker2);
        unit1.addSoldier(attacker2);
        unit1.addSoldier(attacker3);

        Unit unit2 = new Unit("Defender");
        unit2.addSoldier(defender1);
        unit2.addSoldier(defender2);
        unit2.addSoldier(defender3);

        Army army = new Army("infantry");
        army.addUnit(unit1);

        attacker1.attack();
        attacker2.attack();
        attacker3.attack();

        defender1.defend();
        defender2.defend();
        defender3.defend();
    }
}

