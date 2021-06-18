package playdough;

import playdough.livingbeings.Elf;
import playdough.livingbeings.Human;
import playdough.livingbeings.Humanoid;
import playdough.livingbeings.Orc;

import java.util.Scanner;

public class Game {
    Scanner scanner = new Scanner(System.in);

    public Humanoid createPlayer(){
        scanner = new Scanner(System.in);
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
        return player;
    }

    public void startGame(){
        System.out.println("-----------------GAME START-----------------");
        Humanoid player = createPlayer();


    }
}
