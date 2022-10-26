package Repository;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileStartIN {

    private boolean rewrite;
    public int[] gen;
    public String string;

    public void startfile(boolean rewrite) throws IOException {
        this.rewrite = rewrite;
        RealTime realTime = new RealTime();
        FileString fileString = new FileString();
        FileINT fileINT = new FileINT();
        FileINTarray fileINTarray = new FileINTarray();
        Gennumber gennumber = new Gennumber();
        ConvertInt2String convertInt2String = new ConvertInt2String();
        FilereadLastString filereadLastString = new FilereadLastString();
        Countstring countstring = new Countstring();


        int[] num = new int[150];

        int numberOFgame = 0;
        int counter = countstring.countLines() + 1;


        fileString.writestring("service.Game № ", rewrite);

        fileINT.writenumber(counter++, rewrite);
        fileString.writestring(realTime.getDataTime(), rewrite);
        fileString.writestring(" Загаданная строка: ", rewrite);

        gen = gennumber.getData();
        fileINTarray.writearray(gen, rewrite);
        string = convertInt2String.perevod(gen);
        fileString.writestring("\n", rewrite);


    }


}


