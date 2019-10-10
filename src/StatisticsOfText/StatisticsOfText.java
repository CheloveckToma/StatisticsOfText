package StatisticsOfText;

import java.util.ArrayList;

public class StatisticsOfText {
    public static void main(String[] args) {
        ArrayList arrayList = ReadAndWriteText.readText();
        String result = FindStatistics.findStatistics(arrayList);
        ReadAndWriteText.writeText(result);
        System.out.println(result);
    }
}

