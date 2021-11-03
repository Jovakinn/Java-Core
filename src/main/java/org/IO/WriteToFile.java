package org.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.logging.Logger;

public class WriteToFile {
    private static final Logger log = Logger.getLogger(WriteToFile.class.getName());

    public static void main(String[] args) {
        String poem = "Як умру, то поховайте\n" +
                "Мене на могилі,\n" +
                "Серед степу широкого,\n" +
                "На Вкраїні милій,\n" +
                "Щоб лани широкополі,\n" +
                "І Дніпро, і кручі\n" +
                "Було видно, було чути,\n" +
                "Як реве ревучий.\n" +
                "\n" +
                "Як понесе з України\n" +
                "У синєє море\n" +
                "Кров ворожу... отоді я\n" +
                "І лани і гори —\n" +
                "Все покину і полину\n" +
                "До самого бога\n" +
                "Молитися... А до того —\n" +
                "Я не знаю бога.\n" +
                "\n" +
                "Поховайте та вставайте.\n" +
                "Кайдани порвіте\n" +
                "І вражою злою кров'ю\n" +
                "Волю окропіте.\n" +
                "І мене в сім'ї великій,\n" +
                "В сім'ї вольній, новій\n" +
                "Не забудьте пом'янути\n" +
                "Незлим тихим словом.";

        File file = new File(String.valueOf(Path.of("Test.txt")));
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            for (int i = 0; i < poem.length(); i++) {
                fileWriter.write(poem.charAt(i));
            }
            log.info("Successfully done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
