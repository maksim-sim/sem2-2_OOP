package characters;

public class Crossbowman extends Character {
    private int accuracy;
    private int reloadspeed;

    public Crossbowman(int health, int strength, int accuracy, int reloadspeed, String name, Coordinates coordinates) {
        super(health, strength, name, coordinates);
        this.accuracy = accuracy;
        this.reloadspeed = reloadspeed;
    }

    @Override
    public void attack() {
        System.out.println("Crossbowman is shooting");
    }

    @Override
    public void heal() {
        System.out.println("Crossbowman is applying");
    }
}
