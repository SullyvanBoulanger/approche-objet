package fr.diginamic.jdr;

public class Entity {
    private int strength;
    private int lifePoints;

    public Entity(int strength, int lifePoints) {
        this.strength = strength;
        this.lifePoints = lifePoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
