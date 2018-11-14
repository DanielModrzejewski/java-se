package ObjectProgramming.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test1 {
    public static void main(String[] args) {
        byte[] bytes;
        try {
            System.out.println("Rozpoczeto wczytywanie pliku.");
            bytes = Files.readAllBytes(Paths.get("/homemikolaj/bla.txt"));
            System.out.println("Udalo sie wczytac plik");
        } catch (IOException e){
            System.out.println("Nie udalo sie wczytac pliku");
            bytes = new byte[0];
        } finally {
            {
                System.out.println("Zakonczono wczytywanie");
            }
        }

        try{
            Triangle triangle = new Triangle(2,4,6);
        } catch (InvalidSideException e) {
            System.out.println("nie udalo sie");
        }
    }
}
