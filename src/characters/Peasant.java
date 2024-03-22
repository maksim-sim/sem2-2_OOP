package characters;

public class Peasant extends Character {
    private int farmingskill;
    private int cookingskill;

    public Peasant(int health, int strength, int farmingskill, int cookingskill, String name, Coordinates coordinates) {
        super(health, strength, name, coordinates);
        this.farmingskill = farmingskill;
        this.cookingskill = cookingskill;
    }

    @Override
    public void attack() {
        System.out.println("Peasant is attacking with a pitchfork");
    }

    @Override
    public void heal() {
        System.out.println("Peasant is treating wounds with herbs");
    }
}