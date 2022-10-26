package Repository;

import java.io.FileWriter;
import java.io.IOException;

public class FileINT {

    private int number;
    private boolean rewrite;

    public void writenumber(int number, boolean rewrite) {
        this.number = number;
        this.rewrite = rewrite;
        try (
                FileWriter writer = new FileWriter("file.txt", rewrite)) {
            // запись всей строки
            final String number1 = Integer.toString(number);
            writer.write(number1 + " ");
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
