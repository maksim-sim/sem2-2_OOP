import characters.Crossbowman;
import characters.Peasant;
import characters.Spearman;
import characters.Warlock;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Character> characters;

    public Team(String teamName) {
        this.teamName = teamName;
        this.characters = new ArrayList<>();
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void printTeam() {
        for (Character character : characters) {
            System.out.println(character);
        }
    }
}