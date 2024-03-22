import characters.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("team 1");
        team1.addCharacter(new Peasant(100, 10, 5, 3, fillName(), new Coordinates(1, 0)));
        team1.addCharacter(new Warlock(120, 15, 8, 20, fillName(), new Coordinates(2, 0)));
        team1.addCharacter(new Crossbowman(80, 12, 10, 5, fillName(), new Coordinates(3, 0)));
        team1.addCharacter(new Spearman(110, 13, 6, 10, fillName(), new Coordinates(4, 0)));

        Team team2 = new Team("team 2");
        team2.addCharacter(new Peasant(90, 11, 4, 2, "mike", new Coordinates(5, 9)));
        team2.addCharacter(new Sniper(100, 14, 12, 15, "mark", new Coordinates(6, 9)));
        team2.addCharacter(new Monk(105, 12, 7, 8, "david", new Coordinates(7, 9)));
        team2.addCharacter(new Bandit(95, 9, 4, 6, "tom", new Coordinates(8, 9)));

        System.out.println("team 1:");
        team1.printTeam();

        System.out.println("\nteam 2:");
        team2.printTeam();
    }

    private static String fillName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }
}