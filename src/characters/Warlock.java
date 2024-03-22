package characters;

import java.util.ArrayList;

public class Warlock extends Character {
    private int spellpower;
    private int mana;

    public Warlock(int health, int strength, int spellpower, int mana, String name, Coordinates coordinates) {
        super(health, strength, name, coordinates);
        this.spellpower = spellpower;
        this.mana = mana;
    }

    @Override
    public void attack() {
        System.out.println("Warlock is casting");
    }

    @Override
    public void heal() {
        System.out.println("Warlock is using");
    }
}