package service;

public class Compare {
    private String st1 = "";
    private String st2 = "";
    private int[] str3 = new int[3];
    private int k = 0;
    private int b = 0;


    public int[] compare(String st1, String st2) {
        this.st1 = st1;
        this.st2 = st2;
        k = 0;
        b = 0;

        if (st1.charAt(0) == st2.charAt(0) &&
                st1.charAt(1) == st2.charAt(1) &&
                st1.charAt(2) == st2.charAt(2) &&
                st1.charAt(3) == st2.charAt(3)) {
            str3[0] = 4;

        } else {
            for (int i = 0; i < (st1.length()); i++) {
                for (int j = 0; j < (st2.length()); j++) {
                    if (st1.charAt(i) == st2.charAt(j)) {
                        if (i == j) { //str3[i] = 1;
                            // System.out.println(str3[i] + "бык");
                            b++;
                        } else {//str3[i] = 0;
                            // System.out.println(str3[i] + "корова");
                            k++;
                        }
                    }

                }

            }
            str3[0] = b;
            str3[1] = k;
        }


        return (str3);

    }
}

