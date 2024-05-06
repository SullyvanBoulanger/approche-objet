package fr.diginamic.jdr;

import java.util.Scanner;

public class Game {
    private static int calculateAttack(Entity entity){
        return (int) Math.round(entity.getStrength() + 1 + Math.random() * 10);
    }

    private static void fight(Character character, Monster monster){
        int characterAttack = calculateAttack(character);
        int monsterAttack = calculateAttack(monster);

        if(monsterAttack > characterAttack){
            character.setLifePoints(character.getLifePoints() - (monsterAttack - characterAttack));
        } else {
            monster.setLifePoints(monster.getLifePoints() - (characterAttack - monsterAttack));
        }

        if(monster.getLifePoints() > 0 && character.getLifePoints() > 0){
            fight(character, monster);
        }
    }

    private static Character createCharacter(Character character){
        if(character != null && character.getLifePoints() < 0){
            System.out.println("Votre personnage est encore vivant");
            return character;
        }

        return new Character();
    }

    private static Monster createMonster(){
        int random = (int) Math.round(Math.random() * 3);

        switch (random) {
            case 0:
                return new Wolf();
            case 1:
                return new Gobelin();
            case 2 :
                return new Troll();
            default:
                return new Gobelin();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character character = new Character();
        Monster monster;

        int choice = 0;

        do {
            System.out.println("Menu : ");
            System.out.println("1 - Créer un personnage");
            System.out.println("2 - Combattre une créature");
            System.out.println("3 - Afficher le score");
            System.out.println("4 - Quitter");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    character = createCharacter(character);
                    break;
                case 2:
                    if(character.getLifePoints() < 0){
                        System.out.println("Votre personnage est décédé. Il a obtenu le score de " + character.getLifePoints() + " points. Veuillez créer un nouveau personnage");
                    }else{
                        monster = createMonster();
                        fight(character, monster);
                        if(character.getLifePoints() > 0){
                            String[] monsterSplitted = monster.getClass().toString().split(".");
                            String monsterType = monsterSplitted[monsterSplitted.length - 1];
                            System.out.println("Vous avez vaincu un " + monsterType + " !");
                            System.out.println("Il reste " + character.getLifePoints() + " points de vie.");
                            character.addScore(monster.getScoreWhenDefeated());
                        } else {
                            System.out.println("Votre personnage est mort");
                            System.out.println("Score : " + character.getScore());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Score : " + character.getScore());
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
