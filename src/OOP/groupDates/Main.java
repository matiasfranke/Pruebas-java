package OOP.groupDates;

import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String str = "ZPsdfsd214323rfwsefwe423424";
        str = str.replaceAll("[^\\d.]","");
        System.out.println(str);
    }
}
