package fr.diginamic.jdr;

public class Monster extends Entity {
    private int scoreWhenDefeated;

    public Monster(int baseStrength, int variableStrength, int baseLifePoints, int variableLifePoints, int scoreWhenDefeated) {
        super(
            (int) Math.round(baseStrength + Math.random() * variableStrength), 
            (int) Math.round(baseLifePoints + Math.random() * variableLifePoints));

        this.scoreWhenDefeated = scoreWhenDefeated;
    }

    public int getScoreWhenDefeated() {
        return scoreWhenDefeated;
    }
}
