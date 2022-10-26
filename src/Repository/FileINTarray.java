package Repository;

import java.io.FileWriter;
import java.io.IOException;
public class FileINTarray {
    private int[] number =  new int[4];
    private boolean rewrite;

    public void writearray(int[] number, boolean rewrite) {
        this.number = number;
        this.rewrite = rewrite;
        try (
                FileWriter writer = new FileWriter("file.txt", rewrite)) {
            // запись  строки
            for (int i = 0; i < 4; i++) {final String number1 = Integer.toString(number[i]);
            writer.write(number1);}
            writer.append("  ");
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }
}
