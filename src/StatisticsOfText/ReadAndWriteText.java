package StatisticsOfText;

import java.io.*;
import java.util.ArrayList;

/**
 * ReadAndWriteText выполняет чтение из файла и запись в файл
 */

public class ReadAndWriteText {
    /**
     * readText выполянет чтение файла и запись содежимого в массив
     * @return
     */
    public static ArrayList readText() {
        ArrayList arrayList = new ArrayList();
        try {
            String resultOfReadLine;
            FileReader fileReader = new FileReader("src\\StatisticsOfText\\fileOutput.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (( resultOfReadLine = bufferedReader.readLine()) != null) {
                arrayList.add(resultOfReadLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    /**
     * writeText выполняет запись в файл
     * @param resultOfOperation
     */

    public static void writeText(String resultOfOperation) {

        try {
            FileWriter fileWriter = new FileWriter("src\\StatisticsOfText\\fileInput.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(resultOfOperation + "\n");
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
