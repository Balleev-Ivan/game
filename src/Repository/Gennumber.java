package Repository;

import java.util.Random;

public class Gennumber {
    public int[] getData() {

        int[] integ = new int[4];
        {
            //System.out.println("Загаданное число: ");
            Random random = new Random();
            int[] num = new int[4];
            int rand = random.nextInt(10);
            for (int i = 0; i < 4; i++) {
                while (!checkOnRepeat(num, rand))
                    rand = random.nextInt(10);
                num[i] = rand;
                rand = random.nextInt(10);
            }


            for (int i = 0; i < 4; i++) {
                integ[i] = num[i];
            }
        }
        return integ;
    }


    public static boolean checkOnRepeat(int[] num, int rand) {
        for (int i : num)
            if (i == rand)
                return false;

        return true;
    }


}
