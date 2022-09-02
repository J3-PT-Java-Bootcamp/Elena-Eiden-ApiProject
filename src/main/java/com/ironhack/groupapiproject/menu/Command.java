package com.ironhack.groupapiproject.menu;


public enum Command{
    CASE_1("1"),
    CASE_2("2"),
    CASE_3("3"),
    CASE_4("4"),
    CASE_5("5"),
    CASE_6("6"),
    EXIT("0"),
    INVALID("invalid");

    final String command;

    public static Command fromString(String text) {
        for (Command b : Command.values()) {
            if (b.command.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return Command.INVALID;
    }

    public String getCommand() {
        return this.command;
    }

    Command(String command) {
        this.command = command;
    }

}
