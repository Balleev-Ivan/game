package Repository;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Countstring {
    public int countLines() throws IOException {
        LineNumberReader reader  = new LineNumberReader(new FileReader("file.txt"));
        int cnt = 0;
        String lineRead = "";
        String string = "service.Game";
        int game = 0;
        while ((lineRead = reader.readLine()) != null) { if (lineRead.contains(string)) { game++;}}
        cnt = game;
        //System.out.println(game);
        reader.close();
        return cnt;
    }
}
