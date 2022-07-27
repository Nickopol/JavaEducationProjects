package CriptoAnalizer.controller;

public class ConsoleController {

    public static final int SYMBOL_COUNT = 25;
    public static final String APPLICATION_NAME = "CRYPTOR";

    public void printMainManu () {
        printHeader();
        System.out.println();
        System.out.println("\033[0;32m" + "Make your choice: " + "\033[0m");
        System.out.println("1: Encript file");
        System.out.println("1: Dencript file");
        System.out.println();
        System.out.println("\033[0;36m" + "0: Exit" + "\033[0m");
    }

    private void printHeader() {
        printStars();
        System.out.println("\t\t" + "\033[0;31m" + APPLICATION_NAME + "\033[0m");
        printStars();
    }

    private void printStars () {
        for (int i = 0; i < SYMBOL_COUNT; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

}
