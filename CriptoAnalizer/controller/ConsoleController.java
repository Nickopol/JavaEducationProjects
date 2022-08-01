package CriptoAnalizer.controller;

import CriptoAnalizer.dao.DataDao;
import CriptoAnalizer.dao.FileDataDao;
import CriptoAnalizer.service.CaesarCryptor;
import CriptoAnalizer.service.Cryptor;
import CriptoAnalizer.service.Logger;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ConsoleController {

    public static final int SYMBOL_COUNT = 25;
    public static final String APPLICATION_NAME = "CRYPTOR";

    private final DataDao dataDao = new FileDataDao();
    private final Cryptor cryptor = new CaesarCryptor();
    private final Logger log = Logger.getInstance();

    private boolean programEnd = false;

    public void callMainManu () {
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
            if (programEnd) break;
        } while (true);
    }

    private void callChoise(int choise) {
        switch (choise) {
            case 1:
                enryptData();
                break;
            case 2:
                decriptData();
                break;
            default:
                System.out.println("\033[0;31m" + "Make correct choise: " + "\033[0m");
        }
    }

    private void enryptData() {
        String path = getPathToFile();
        int secretKey = getSecretKey();
        String originalText = dataDao.getData(path);
        String encryptedText = cryptor.encript(originalText, secretKey);
        String fileName = Instant.now()
                .truncatedTo(ChronoUnit.MILLIS)
                .toString().replaceAll("[TZ]", " ") + "- encrypted";
        dataDao.writeData(fileName, encryptedText);
        System.out.println("File was encrypted and save!");
        programEnd = true;
    }

    private void decriptData() {
        String path = getPathToFile();
        int secretKey = getSecretKey();
        String originalText = dataDao.getData(path);
        String encryptedText = cryptor.decript(originalText, secretKey);
        String fileName = Instant.now().truncatedTo(ChronoUnit.MILLIS)
                .toString().replaceAll("[TZ]", " ") + "- decrypted";
        dataDao.writeData(fileName, encryptedText);
        System.out.println("File was decrypted and saved!");
        programEnd = true;
    }
    private int getSecretKey() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert key to encript: ");
        return scan.nextInt();

    }
    private String getPathToFile() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert path to file: ");
        return scan.nextLine();
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
