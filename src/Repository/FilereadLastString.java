package Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilereadLastString {

    public String readstring() {
        String last = null;
        try (FileReader reader = new FileReader("file.txt")) {

            BufferedReader input = new BufferedReader(reader);
            String line;
            while (null != (line = input.readLine())) {
                last = line;
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        return last;
    }

}

