package org.example.Task_01_TextFile;
import java.io.IOException;
import org.example.Task_01_TextFile.Directory;
import org.example.Task_01_TextFile.MyFile;
import org.example.Task_01_TextFile.TextFile;

import java.lang.constant.DynamicCallSiteDesc;

/*
Задача 1.
 Создать приложение с вложенностью пакетов не менее 3х, где будет класс для входа и несколько классов с логикой.
Пример: приложение для внесения заметок во внешний файл с обязательной фиксацией времени
Создаю объект  класса Текстовый файл, используя классы Файл, Директория.
Класс входа Майн
Использую методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 */
public class Main {
    public static void main(String[] args) {
        Directory directoryDirectory = null;
        directoryDirectory = new directoryDirector("text", "txt", directoryDirectory);
        MyFile myFile = new MyFile("text", "txt", directoryDirectory);
        TextFile textFile = new TextFile(text, myFile);
        textFile.createTextFile();
        textFile.renameFile("Янка Купала - 158500");
        textFile.printTextFile();
        textFile.addText(textAdd);
        textFile.deleteText();
        textFile.deleteFile();
    }

    static String text = "кошка\n" +
            "китаец.\n" +
            "кукушка\n" +
            "леший.\n" +
            "помпон\n" +
            "сова.\n";
    static String textAdd = "345\n" +
            "111.\n" +
            "222\n" +
            "333.\n" +
            "444\n" +
            "555.\n" +
            "666\n" +
            "777.\n" +
            "888\n" +
            "999.\n";
}
