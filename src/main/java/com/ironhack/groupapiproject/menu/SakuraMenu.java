package com.ironhack.groupapiproject.menu;

import com.ironhack.groupapiproject.controller.SakuraController;
import com.ironhack.groupapiproject.service.SakuraCardServiceConnected;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public final class SakuraMenu{

    final
    SakuraController sakuraController;

    final
    SakuraCardServiceConnected sakuraCardServiceConnected;


    private final Scanner scanner = new Scanner(System.in);

    public SakuraMenu(SakuraController sakuraController, SakuraCardServiceConnected sakuraCardServiceConnected) {
        this.sakuraController = sakuraController;
        this.sakuraCardServiceConnected = sakuraCardServiceConnected;
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
                case CASE_1 -> System.out.println("Get all Sakura cards");
                case CASE_2 -> System.out.println("Get a Sakura card by id");
                case CASE_3 -> System.out.println("Get a Sakura card by name in english");
                case CASE_4 -> System.out.println("Get a Sakura card by name in spanish");
                case CASE_5 -> System.out.println("Get a random Sakura card");
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
        System.out.println("    1. Get all Sakura cards");
        System.out.println("    2. Get a Sakura card by id");
        System.out.println("    3. Get a Sakura card by name in english");
        System.out.println("    4. Get a Sakura card by name in spanish");
        System.out.println("    5. Get a random Sakura card ");
        System.out.println("    0. Exit the application");
        System.out.println(" ");
        System.out.print("  Enter your command [0-5]: ");
    }
}