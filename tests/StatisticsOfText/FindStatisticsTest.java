package StatisticsOfText;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindStatisticsTest {

    @Test
    public void findNumberOfSpace() {
        String[] line = {"Я", " ", "c", "ъ", "е", "л", " ", "к", "о", "н", "ф", "е", "т", "у"};
        assertEquals(2, FindStatistics.findNumberOfSpace(line));
    }

    @Test
    public void findNumberOfSymbolsWithSpace() {
        String[] line = {"Я", " ", "c", "ъ", "е", "л", " ", "к", "о", "н", "ф", "е", "т", "у"};
        assertEquals(14, FindStatistics.findNumberOfSymbolsWithSpace(line));
    }

    @Test
    public void findNumberOfSymbolsWithoutSpace() {
        String[] line = {"Я", " ", "c", "ъ", "е", "л", " ", "к", "о", "н", "ф", "е", "т", "у"};
        int numberOfSpace = FindStatistics.findNumberOfSpace(line);
        int numberOfSymbolWithSpace = FindStatistics.findNumberOfSymbolsWithSpace(line);
        assertEquals(numberOfSymbolWithSpace - numberOfSpace,FindStatistics.findNumberOfSymbolsWithoutSpace(numberOfSpace,numberOfSymbolWithSpace));
    }

    @Test
    public void findNumberOfWords() {
        String line = "Я съел конфету";
        assertEquals(3, FindStatistics.findNumberOfWords(line));
    }
}