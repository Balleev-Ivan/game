package Repository;

import java.util.*;
import java.text.*;

public class RealTime {
    public static String getDataTime() {
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("  dd.MM.yyyy' 'HH:mm  ");
        //System.out.println("Текущая дата " + formatForDateNow.format(dateNow));
        return formatForDateNow.format(dateNow);
    }
}


