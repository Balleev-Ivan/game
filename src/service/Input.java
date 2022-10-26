package service;

import java.util.Scanner;

public class Input {


    public String getId() {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        String str = null;
        {
            while (x == true) {

                System.out.println(" Введите 4-х значное число: ");
                str = scanner.nextLine();


                if (str.length() >= 5) {
                    System.out.println("число неправильное, повторите запрос ");
                } else if (str.length() < 4) {
                    System.out.println("число неправильное, повторите запрос ");
                } else {
                    x = false;
                }
            }

            return str;
        }
    }
}

