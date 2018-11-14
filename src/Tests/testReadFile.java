package Tests;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class testReadFile {


    public static void main(String[] args) {

        final File folder2 = new File("/home/danielmodrzejewski/Downloads/kryptowaluty");
        //Path filePath = Paths.get("/home/danielmodrzejewski/Downloads/kryptowaluty" , "btc.csv");

        String fileNames[] = listFilesForFolder2(folder2);
        for (int i = 0; i < fileNames.length; i++) {

            System.out.println(fileNames[i]);
            Path filePath = Paths.get("/home/danielmodrzejewski/Downloads/kryptowaluty", fileNames[i]);
            try {
                List<String> lines = Files.readAllLines(filePath);
                //System.out.println(lines.toString());
//            for (String s : lines) {
//                System.out.println(s);
//            }

                //System.out.println(lines.get(0));
                System.out.println(lines.get(1));
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }


    public static String[] listFilesForFolder2(final File folder) {
        // List<>

        String s = "";

        for (final File fileEntry : folder.listFiles()) {
            if (!fileEntry.isDirectory()) {
                //System.out.println(fileEntry.getName());
                //return fileEntry.getName();
                s += fileEntry.getName() + ",";
            }
        }

        return s.split(",");
    }
}
