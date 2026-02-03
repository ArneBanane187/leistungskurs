package blatt16;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Schreibprozess {

    public static void main(String args[]) {
        Path ordner =  Paths.get("io");

        try{
            if (Files.notExists(ordner)) {
                Files.createFile()
            }
        }
    }
}
