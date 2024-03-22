package characters;

public class Sniper extends Character {
    private int precision;
    private int camouflage;

    public Sniper(int health, int strength, int precision, int camouflage, String name, Coordinates coordinates) {
        super(health, strength, name, coordinates);
        this.precision = precision;
        this.camouflage = camouflage;
    }

    @Override
    public void attack() {
        System.out.println("Sniper is shooting with a sniper rifle");
    }

    @Override
    public void heal() {
        System.out.println("Sniper is applying first aid kit");
    }
}
