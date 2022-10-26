package Repository;

import java.io.FileWriter;
import java.io.IOException;

public class FileString {

    private String string;
    private boolean rewrite;

    public void writestring(String string, boolean rewrite) {
        this.string = string;
        this.rewrite = rewrite;
        try (
                FileWriter writer = new FileWriter("file.txt", rewrite)) {
            // запись  строки
            writer.write(string + " ");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
