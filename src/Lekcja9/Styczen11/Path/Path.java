package Lekcja9.Styczen11.Path;

import java.nio.file.Paths;

public class Path {
    public static void main(String[] args) {
        //Paths.get() – tworzenie nowych instancji Path Obecna ścieżka (względna) :
        Path cwdRl = (Path) Paths.get("");
        //Obecna ścieżka (bezwzględna) :
        Path cwdAbs = cwdRl.toAbsolutePath();
        //Łańcuch (folder obecny -> src -> main):
        Path chainedPathRl = (Path) Paths.get("", "src", "main");
        //resolve() - dostęp do „dziecka”:
        Paths.get("").resolve("help.txt");
        //getParent() - dostęp do „rodzica”:
        Paths.get("src/java/main").getParent();
        //getRoot() – pierwszy element ścieżki:
        Paths.get("").toAbsolutePath().getRoot();
        //getFilename() – ostatni element ścieżki:
        Path filename = (Path) Paths.get("").toAbsolutePath().getFileName();
    }

    private Path toAbsolutePath() {
        return null;
    }
}
