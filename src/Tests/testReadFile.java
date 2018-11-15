package Tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class testReadFile {


    public static void main(String[] args) {

        final File folder2 = new File("/home/danielmodrzejewski/Downloads/kryptowaluty");
        //Path filePath = Paths.get("/home/danielmodrzejewski/Downloads/kryptowaluty" , "btc.csv");

        String fileNames[] = listFilesForFolder2(folder2);
        for (int i = 0; i < 3; i++) {

            System.out.println(fileNames[i]);
            Path filePath = Paths.get("/home/danielmodrzejewski/Downloads/kryptowaluty", fileNames[i]);
            try {
                List<String> lines = Files.readAllLines(filePath);
                System.out.println(lines.get(0));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }



    }


    public static String[] listFilesForFolder2(final File folder) {
        ArrayList<String> s2 = new ArrayList<>();

        String s = "";

        for (final File fileEntry : folder.listFiles()) {
            if (!fileEntry.isDirectory()) {
                //System.out.println(fileEntry.getName());
                //return fileEntry.getName();
                s += fileEntry.getName() + ",";
                s2.add(fileEntry.getName());
            }
        }

        return s.split(",");
    }

    public static ArrayList listFilesForFolder3(final File folder) {
        ArrayList<String> s2 = new ArrayList<>();


        for (final File fileEntry : folder.listFiles()) {
            if (!fileEntry.isDirectory()) {
                s2.add(fileEntry.getName());
            }
        }

        return s2;
    }
}
