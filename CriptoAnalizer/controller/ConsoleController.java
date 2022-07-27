package CriptoAnalizer.controller;

import CriptoAnalizer.dao.DataDao;
import CriptoAnalizer.dao.FileDataDao;
import CriptoAnalizer.service.CaesarCryptor;
import CriptoAnalizer.service.Cryptor;
import CriptoAnalizer.service.Logger;

import java.util.Scanner;

public class ConsoleController {

    public static final int SYMBOL_COUNT = 25;
    public static final String APPLICATION_NAME = "CRYPTOR";

    private final DataDao dataDao = new FileDataDao();
    private final Cryptor cryptor = new CaesarCryptor();
    private final Logger log = Logger.getInstance();

    public void printMainManu () {
        printHeader();
        makeChoise();
    }

    private void makeChoise() {
        do {
            printMainChoises();
            Scanner scanner = new Scanner(System.in);
            int choise = scanner.nextInt();
            if (isExitCodeChoose(choise)) break;
            callChoise(choise);
        } while (true);
    }

    private void callChoise(int choise) {
        switch (choise) {
            case 1:
                log.info("Choise 1");
                break;
            case 2:
                System.out.println("Choise 2");
                break;
            default:
                System.out.println("\033[0;31m" + "Make correct choise: " + "\033[0m");
        }
    }

    private boolean isExitCodeChoose(int choise) {
        if (choise == 0) {
            System.out.println("Goodbye!");
            return true;
        }
        return false;
    }

    private void printMainChoises() {
        System.out.println();
        System.out.println("\033[0;32m" + "Make your choice: " + "\033[0m");
        System.out.println("1: Encript file");
        System.out.println("2: Dencript file");
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
