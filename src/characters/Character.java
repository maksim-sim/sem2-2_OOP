package characters;

public abstract class Character{
    protected int health;
    protected int strength;
    protected String name;
    protected Coordinates coordinates;

    public Character(int health, int strength, String name, Coordinates coordinates) {
        this.health = health;
        this.strength = strength;
        this.name = name;
        this.coordinates = coordinates;
    }

    public abstract void attack();

    public abstract void heal();

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}