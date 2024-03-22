package characters;

public class Spearman extends Character {
    private int weaponskill;
    private int armor;

    public Spearman(int health, int strength, int weaponskill, int armor, String name, Coordinates coordinates) {
        super(health, strength, name, coordinates);
        this.weaponskill = weaponskill;
        this.armor = armor;
    }

    @Override
    public void attack() {
        System.out.println("Spearman is thrusting");
    }

    @Override
    public void heal() {
        System.out.println("Spearman bandages");
    }
}
