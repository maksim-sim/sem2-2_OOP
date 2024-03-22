package characters;

public class Bandit extends Character {
    private int stealth;
    private int agility;

    public Bandit(int health, int strength, int stealth, int agility, String name, Coordinates coordinates) {
        super(health, strength, name, coordinates);
        this.stealth = stealth;
        this.agility = agility;
    }

    @Override
    public void attack() {
        System.out.println("Bandit is attacking with a dagger");
    }

    @Override
    public void heal() {
        System.out.println("Bandit is using bandages to stop bleeding");
    }
}
