package StatisticsOfText;

import java.io.File;

/**
 * класс CheckingFile осуществляет проверку наличия файлов
 */
public class CheckingFile {
    /**
     * checkFileOutput выполянет проверку на наличие файла чтения
     */

    public static void checkFileOutput() {
        File file = new File("src\\StatisticsOfText\\fileOutput.txt");
        if (!file.exists()) {
            System.out.println("У вас нет файла для чтения");
        }
    }

    /**
     * checkFileInput выполняет проверку на наличие файла для записи
     */

    public static void checkFileInput() {
        File file = new File("src\\StatisticsOfText\\fileInput.txt");
        if (!file.exists()) {
            System.out.println("У вас нет файла для записи, мы его создадим(fileInput)");
        }
    }
}
