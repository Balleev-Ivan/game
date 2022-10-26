package Repository;

import java.io.FileWriter;
import java.io.IOException;

public class Filein {
    private int st10;
    private int st20;
    private String st1;
    private String st2;
    private boolean rewriter;

    public void zapis(int st10, String st1, int st20, String st2, boolean rewriter) {
        this.st10 = st10;
        this.st1 = st1;
        this.st20 = st20;
        this.st2 = st2;
        this.rewriter = rewriter;
        RealTime realTime = new RealTime();
        FileINT fileINT = new FileINT();
        FileString fileString = new FileString();
        fileINT.writenumber(st10, rewriter);
        fileString.writestring(st1, rewriter);
        fileINT.writenumber(st20, rewriter);
        fileString.writestring(st2, rewriter);

    }
}