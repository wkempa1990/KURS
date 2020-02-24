package Lekcja9.Styczen11.Files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Files {
    public static void main(String[] args) {
        Path testDir = Paths.get("testDir").toAbsolutePath();
        //exists() - czy istnieje?
        boolean exists = Files.exists(testDir);
        //isRegularFile() – czy jest plikiem?
        boolean isFile = Files.isRegularFile(testDir);
        //isDirectory() – czy jest folderem?
        boolean isDirectory = Files.isDirectory(testDir);
        Path testFile = testDir.resolve("test.txt");
        // createDirectory() – nowy folder:
        Files.createDirectory(testDir);
        //createFile() – nowy plik:
        Files.createFile(testFile);
        //Kopiowanie pliku:
        Path fileCopy = testDir.resolve("test-copy.txt");
        Files.copy(testFile, fileCopy);
        //Przemieszczenie / zmiana nazwy:
        Path fileBkp = testDir.resolve("test-bkp.txt");
        Files.move(fileCopy, fileBkp);
        //Usuwanie pliku:
        Files.delete(fileBkp);
        //Files.newDirectoryStream() - zawartość folderu
        Path dir = Paths.get("");
        List<Path> dirContent = new ArrayList<>();
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dir)) {
            // DirectoryStream<T> implements Iterable<T>
            for (Path path : directoryStream) {
                dirContent.add(path);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void delete(Path fileBkp) {
    }

    private static void move(Path fileCopy, Path fileBkp) {
    }

    private static void copy(Path testFile, Path fileCopy) {
    }

    private static void createFile(Path testFile) {
    }

    private static void createDirectory(Path testDir) {
    }

    private static boolean isDirectory(Path testDir) {
        return false;
    }

    private static boolean isRegularFile(Path testDir) {
        return false;
    }

    private static boolean exists(Path testDir) {
        return false;
    }

    private static DirectoryStream<Path> newDirectoryStream(Path dir) {
        return null;
    }
}
