package service;

import Repository.FileStartIN;
import Repository.FileString;
import Repository.Filein;

import java.io.IOException;


public class Game {
    Input input = new Input();
    FileString fileString = new FileString();
    Compare compare = new Compare();
    FileStartIN fileStartIn = new FileStartIN();
    Filein filein = new Filein();
    EndOfWord endOfWord = new EndOfWord();
    String id = null;
    String str3 = " бык ";
    String str31 = " быков ";
    String str4 = " быка ";
    String str5 = " корова ";
    String str51 = " коров ";
    String str6 = " коровы ";
    String bik = null;
    String kor = null;
    boolean b = true;
    int[] str2 = new int[1];
    int col = 0; // счетчик попыток

    public void playstart() throws IOException {
        fileStartIn.startfile(true); // запись начального комментария в файл: номер игры и ген.число
        while (b == true) {

            id = input.getId();  // ввод числа, запросы на угадывание
            fileString.writestring("Запрос: " + id + "  Ответ: ", true);
            str2 = compare.compare(fileStartIn.string, id); // cравнение чисел
            col++;

            if (str2[0] == 0) {
                System.out.print(str2[0] + str31);
                bik = str31;
            } else if (str2[0] == 1) {
                System.out.print(str2[0] + str3);
                bik = str3;
            } else {
                System.out.print(str2[0] + str4);
                bik = str4;
            }

            if (str2[1] == 0) {
                System.out.print(str2[1] + str51);
                kor = str51;
            } else if (str2[1] == 1) {
                System.out.print(str2[1] + str5);
                kor = str5;
            } else {
                System.out.print(str2[1] + str6);
                kor = str6;
            }

            filein.zapis(str2[0], bik, str2[1], kor + "\n", true); //запись ответа в файл
            if (str2[0] == 4) {
                System.out.print("\n");
                System.out.print(" Число угаданно ");
                fileString.writestring(" Строка была угадана за " + col +
                        endOfWord.declension("попытка", "попытки", "попыток", col) + "\n", true); // запись комментария в файл
                b = false;
            } else {
                System.out.print("\n");
                System.out.println("Попытка неудачная. ");
                str2[0] = 0;
                str2[1] = 0;
            }

        }
    }
}

