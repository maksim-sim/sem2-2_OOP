package characters;

public class Monk extends Character {
    private int meditation;
    private int agility;

    public Monk(int health, int strength, int meditation, int agility, String name, Coordinates coordinates) {
        super(health, strength, name, coordinates);
        this.meditation = meditation;
        this.agility = agility;
    }

    @Override
    public void attack() {
        System.out.println("Monk is martial");
    }

    @Override
    public void heal() {
        System.out.println("Monk powers");
    }
}