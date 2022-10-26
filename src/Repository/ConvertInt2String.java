package Repository;

import java.util.Arrays;

public class ConvertInt2String {
    private int[] j;

    public String perevod(int[] j) {
        this.j = j;
        String res = Arrays.toString(j).replaceAll("[\\[\\],\\s]", "");
        return res;
    }


}