package secao11_TopicosEspeciais.Program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertData {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-10-26");
        LocalDateTime d05 = LocalDateTime.parse("2026-10-26T01:30:26");
        Instant d06 = Instant.parse(("2026-10-26T01:30:26Z"));

        /*for (String s: ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }*/

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
    }
}
