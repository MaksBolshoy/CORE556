package org.example.Task_01_TextFile;

import java.nio.file.*;

public class Directory {
    private Path path;

    public Directory() {
        this.path = createDirectory(String.valueOf(path));
    }

    //создание директории
    public Path createDirectory(String path) {
        if (Files.exists(Paths.get(path))) {
            System.out.println("Директория \"" + path + "\" уже существует.");
            return Paths.get(path);
        } else {
            try {
                return Files.createDirectory(Paths.get(path));
            } catch (Exception e) {
                System.out.println("Директория не создана:" + e);
                return null;
            }
        }
    }

    public Path getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = Paths.get(path);
    }
}