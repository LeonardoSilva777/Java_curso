package secao11_TopicosEspeciais.Program;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcData {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-10-26");
        LocalDateTime d05 = LocalDateTime.parse("2026-10-26T01:30:26");
        Instant d06 = Instant.parse(("2026-10-26T01:30:26Z"));

        //Subtraindo 7 dias da semana
        LocalDateTime minusWeekLocalDate = d05.minusDays(7);

        //Adicionando 7 dias

        LocalDate nextWeekLocalDate = d04.plusDays(7);

        //Var Instant

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant NextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        //Calcular Duração

        Duration t1 = Duration.between(minusWeekLocalDate, d05); //Calcular durações entre duas data horas

        System.out.println(d04);
        System.out.println(minusWeekLocalDate);

        System.out.println("+====================+");

        System.out.println(d04);
        System.out.println(nextWeekLocalDate);

        System.out.println("+====================+");
        System.out.println(d06);
        System.out.println(NextWeekInstant);

        System.out.println("=====================");
        System.out.println("T1 dias = " + t1.toDays());


    }
}
