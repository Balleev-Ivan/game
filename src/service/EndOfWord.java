package service;

public class EndOfWord {
    public static String declension(String w1, String w2, String w3, int num) {
        String declension = null;
        int last = num - (((int) num / 10) * 10);
        if (num <= 14) {
            if (num == 1)
                declension = " " + w1;
            if (num >= 2 && num <= 4)
                declension = " " + w2;
            if (num >= 5 && num <= 14)
                declension = " " + w3;
        } else {
            if (last == 1)
                declension = " " + w1;
            if (last >= 2 && last <= 4)
                declension = " " + w2;
            if ((last >= 5 && last <= 9) || last == 0)
                declension = " " + w3;

        }
        return declension;

    }
}
