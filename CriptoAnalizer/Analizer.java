package CriptoAnalizer;

import CriptoAnalizer.controller.ConsoleController;
import CriptoAnalizer.dao.DataDao;
import CriptoAnalizer.dao.FileDataDao;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Analizer {
    /*
    In this task we need to analize text on subject of encryption of text.
    Encriptor is a number, on which Char number of symbol will change in encripted text.

    Char Array openingFileArray  -  for opening new file.
    Char Array encryption - for analazing text and coded it to char Array.
    Void pushSaving - for creating new file of encriped text.
    Void dencrypting - for writing in new file decripted text.
                When program end`s in cosole must be messege All done.

    private  static  final int displacementNumber = 3;
    private  static  String incomeTextFileName = "To Encription.txt";
    private  static  String outcomeTextFileName = "Encripted text.txt";
    private  static  String decriptedTextFileName = "Dencripted text.txt";
*/
    public static void main(String[] args) {
        //pushSaving(encryption(openingFileArray()));
        //dencrypting();
        /*
        String dataName = "info.txt";
        DataDao dao = new FileDataDao();
        dao.writeData(dataName, "Hello word");

        System.out.println(dao.getData(dataName));

         */
        ConsoleController cc = new ConsoleController();
        cc.callMainManu();
    }

    private static char[] openingFileArray () {
         //char[] outcome = null;
        return null;
        // return outcome;
    }

    private static char[] encryption (char[] incomeTextArray) {
       // char[] outcome = null;
        return null;
        // return outcome;
    }

    private static void pushSaving (char[] textForSaving) {


        System.out.println("All Done.");
    }

    private static void dencrypting () {


        System.out.println("All Done.");
    }


}
