package playdough;

import playdough.livingbeings.*;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    private Humanoid createPlayer(){
        scanner = new Scanner(System.in);
        int bonusPoints = 10;
        Humanoid player;
        System.out.println("Welcome to the danger zone.");
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("Alright %s, now pick your race:\n", name);
        System.out.println("1. Human");
        System.out.println("2. Orc");
        System.out.println("3. Elf");
        switch (scanner.nextInt()){
            case 1:
                player = new Human();
                player.setName(name);
                break;
            case 2:
                player = new Orc();
                player.setName(name);
                break;
            case 3:
                player = new Elf();
                player.setName(name);
                break;
            default:
                System.out.println("Enter a number ranging from 1 to 3, please~");
                return null;
        }
        System.out.printf("%s, an %sish shmuck. \n", name, player.getRaceName());
        System.out.println("Sooo, how about some bonus points, for...You know, to make something of yourself?");
        do {
            System.out.println(player.getName() + "'s stats, are " + player.getStrength() + " for Strength, " + player.getAgility() +
                    " for Agility, " + player.getWisdom() + " for Wisdom, and " + player.getWillpower() + " for the Willpower.");
            System.out.printf("1. Strength\n2. Agility\n3. Wisdom\n4. Willpower\n");
            switch (scanner.nextInt()){
                case 1:
                    player.setStrength(player.getStrength() + 1);
                    bonusPoints--;
                    break;
                case 2:
                    player.setAgility(player.getAgility() + 1);
                    bonusPoints--;
                    break;
                case 3:
                    player.setWisdom(player.getWisdom() + 1);
                    bonusPoints--;
                    break;
                case 4:
                    player.setWillpower(player.getWillpower() + 1);
                    bonusPoints--;
                    break;
                default:
                    System.out.println("???");
                    break;
            }
        }   while (bonusPoints != 0);
        return player;
    }

    public void startGame(){
        System.out.println("-----------------GAME START-----------------");
        Humanoid player = createPlayer();
        }
    }

