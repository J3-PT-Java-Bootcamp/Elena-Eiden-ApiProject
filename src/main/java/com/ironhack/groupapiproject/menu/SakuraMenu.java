package com.ironhack.groupapiproject.menu;

import com.ironhack.groupapiproject.controller.SakuraController;
import com.ironhack.groupapiproject.model.Player;
import com.ironhack.groupapiproject.model.SakuraCard;
import com.ironhack.groupapiproject.service.PlayerServiceImpl;
import com.ironhack.groupapiproject.service.SakuraServiceImpl;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public final class SakuraMenu{

    final SakuraController sakuraController;
    final SakuraServiceImpl sakuraServiceImpl;
    final PlayerServiceImpl playerService;


    private final Scanner scanner = new Scanner(System.in);

    public SakuraMenu(SakuraController sakuraController, SakuraServiceImpl sakuraServiceImpl, PlayerServiceImpl playerService) {
        this.sakuraController = sakuraController;
        this.sakuraServiceImpl = sakuraServiceImpl;
        this.playerService = playerService;
    }

    public void start() {
        this.printWelcome();
        String inputCommand;
        boolean exit = false;
        do {
            this.printCommandRequest();
            inputCommand = scanner.nextLine().toLowerCase();
            Command command = Command.fromString(inputCommand);
            switch (command) {
                case CASE_1 -> this.showAllSakuraCards();
                case CASE_2 -> this.showSakuraCardById();
                case CASE_3 -> this.showRandomSakuraCard();
                case CASE_4 -> this.createPlayer();
                case CASE_5 -> this.showAllPlayers();
                case CASE_6 -> this.showPlayerById();
                case EXIT -> exit = true;
                default -> System.out.println("Kero can not understand this command :( " +
                        "Please try again.");
            }
        } while (!exit);

        System.out.println("Thanks for visiting me :)");
        System.out.println("See you next time, Cards Collector!");
    }


    private void printWelcome() {
        System.out.println("======================================================================");
        System.out.println(" ");
        System.out.println("  Welcome to the Sakura Cards Collector!");
        System.out.println(" ");
        System.out.println("======================================================================");
        System.out.println(" ");
        System.out.println(" My name is Kerberos, but you can call me Kero. How can I help you?");

    }

    private void printCommandRequest() {
        System.out.println(" Please, select a command from the following options:");
        System.out.println(" ");
        System.out.println("    1. Get all Sakura Cards");
        System.out.println("    2. Get a Sakura Card by id");
        System.out.println("    3. Get a random Sakura card");
        System.out.println("    4. Create Player");
        System.out.println("    5. Show all Players");
        System.out.println("    6. Show Player By Id");
        System.out.println("    0. Exit the application");
        System.out.println(" ");
        System.out.print("  Enter your command [0-5]: ");
    }

    private void showAllSakuraCards(){
        var sakuraCards = this.sakuraServiceImpl.getAllSakuraCards();
        for(SakuraCard sakuraCard : sakuraCards){
            System.out.println(sakuraCard);
        }
    }

    private void showSakuraCardById(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the Sakura Card ID -> \t");
        String id = sc.nextLine();
        System.out.println(" ************ Sakura Card ******************");
        System.out.println(this.sakuraServiceImpl.findById(id));
        System.out.println("********************************************");
    }

    private void showRandomSakuraCard() {
        System.out.println("\n************ Random Sakura Card ******************");
        System.out.println(this.sakuraServiceImpl.getRandomSakuraCard());
        System.out.println("***************************************************\n");
    }

    private void createPlayer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tADD player name: ");
        String name = sc.nextLine();
        Player player = new Player(name);
        playerService.create(player);
        System.out.println("Player -> " + name + " add!!!");
    }

    private void showAllPlayers(){
        System.out.println("SHOW ALL PLAYERS");
        /**var players = this.playerService.getAllPlayers();
         for(Player player : players){
         System.out.println(player);
         }
         */
    }

    private void showPlayerById(){
        System.out.println("SHOW PLAYER BY ID");
    }

}