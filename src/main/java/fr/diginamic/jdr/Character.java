package fr.diginamic.jdr;

public class Character extends Entity {
    private int score = 0;

    public Character() {
        super((int) Math.round(12 + Math.random() * 6), 
        (int) Math.round(20 + Math.random() * 30));
    }
    
    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }

}
