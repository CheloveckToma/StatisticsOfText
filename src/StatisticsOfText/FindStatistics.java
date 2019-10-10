package StatisticsOfText;

import java.util.ArrayList;

/**
 * класс FindStatistics выполняет назождение таких статистик текста как:
 * кол-во пробелов,
 * общее кол-во символов,
 * кол-во символов без пробелов,
 * кол-во слов
 */
public class FindStatistics {
    /**
     * findStatistics метод который выполняет вызов методов нахождения статистики собирает их результат и возвращает его
     * @param writeArrayList - массив данных
     * @return результаты методов вычислений статистики
     */

    public static String findStatistics(ArrayList writeArrayList) {
        CheckingFile.checkFileInput();
        CheckingFile.checkFileOutput();
        String line = createStringBufferLine(writeArrayList);
        String[] splitLine = FindStatistics.getSplitLine(line);
        int numberOfSpace = findNumberOfSpace(splitLine);
        int numberOfSymbolsWithSpace = findNumberOfSymbolsWithSpace(splitLine);
        int numbersOfSymbolsWithoutSpace = findNumberOfSymbolsWithoutSpace(numberOfSpace, numberOfSymbolsWithSpace);
        int numberOfWords = findNumberOfWords(line);
        String result = "Кол-во пробелов: " + numberOfSpace + "\n" +
                "Общее кол-во символов: " + numberOfSymbolsWithSpace + "\n" +
                "Кол-во символов без пробелов:" + numbersOfSymbolsWithoutSpace + "\n" +
                "Кол-во слов: " + numberOfWords;
        return result;
    }

    /**
     * getSplitLine выполняет деление строки на массив посимвольно
     * @param line - строка данных
     * @return массив символов
     */

    public static String[] getSplitLine(String line) {
        String[] splitLine = line.split("");
        return splitLine;
    }

    /**
     * findNumberOfSpace выполняет нахождение кол-ва пробелов в массиве
     * @param splitLine - массив символов
     * @return кол-во пробелов в массиве
     */

    public static int findNumberOfSpace(String[] splitLine) {
        int numberOfSpace = 0;
        for (int i = 0; i < splitLine.length; i++) {
            if (splitLine[i].equals(" ")) {
                numberOfSpace++;
            }
        }
        return numberOfSpace;
    }

    /**
     * findNumberOfSymbolsWithSpace выполняет нахождение кол-ва символов и пробелов в массиве
     * @param splitLine - массив символов
     * @return кол-во символов в массиве
     */

    public static int findNumberOfSymbolsWithSpace(String[] splitLine) {
        int numberOfSymbolsWithSpace = 0;
        for (int i = 0; i < splitLine.length; i++) {
            if (!splitLine[i].equals("")) {
                numberOfSymbolsWithSpace++;
            }
        }
        return numberOfSymbolsWithSpace;
    }

    /**
     * findNumberOfSymbolsWithoutSpace выполянет нахождение кол-ва символов (без пробелов) в массиве
     * @param numberOfSpace - кол-во пробелов
     * @param numberOfSymbols - кол-во символов
     * @return кол-во символов (без пробелов)
     */

    public static int findNumberOfSymbolsWithoutSpace(int numberOfSpace, int numberOfSymbols) {
        int numberOfSymbolsWithoutSpace = numberOfSymbols - numberOfSpace;
        return numberOfSymbolsWithoutSpace;
    }

    /**
     * createStringBufferLine выполянет создание StringBuffer (расширяемой строки?)
     * @param line - строка данных
     * @return переделанную строку данных
     */

    public static String createStringBufferLine(ArrayList<String> line) {
        String lineBuffer = "";
        StringBuffer stringBuffer = new StringBuffer();
        for (String i : line) {
            stringBuffer.append(i);
            lineBuffer = new String(stringBuffer);
        }
        return lineBuffer;
    }

    /**
     * findNumberOfWords выполянет нахождение кол-ва слов в строке
     * @param line - строка данных
     * @return  кол-во слов
     */

    public static int findNumberOfWords(String line) {
        String[] splitLineBuffer = line.split("\\s+");
        int numberOfWords = 0;
        for (int i = 0; i < splitLineBuffer.length; i++) {
            if (splitLineBuffer[i].matches("[\\w]+[\\.\\,\\?\\!]+")) ;
            splitLineBuffer[i] = splitLineBuffer[i].replaceAll("[\\.\\,\\?\\!]+", "");
            if (splitLineBuffer[i].matches("[\\w+]+")) ;
            numberOfWords++;
        }
        return numberOfWords;
    }
}


