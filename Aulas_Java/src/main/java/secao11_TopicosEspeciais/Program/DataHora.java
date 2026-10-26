package secao11_TopicosEspeciais.Program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");



        // Instanciar Data Hora Local
        LocalDate d01 = LocalDate.now(); // Data Atual

        LocalDateTime d02 = LocalDateTime.now(); // Data e Hora Atual
        Instant d03 = Instant.now(); // Diferença do Z no final mostra que é uma data hora GMT

        // Texto ISO 8601 -→ Data-Hora

        LocalDate d04 = LocalDate.parse("2022-07-20"); //aqui estamos a definir como queremos a data
        LocalDateTime d05 = LocalDateTime.parse("2022-06-20T01:30:20"); //aqui definimos como queremos data e hora (baseda no ISO 8601)
        Instant d06 = Instant.parse("2022-06-20T01:30:20Z"); //Horario de Londres (ING)
        Instant d07 = Instant.parse("2022-06-20T01:30:20-03:00"); //Horario de SP (BR), em londres é 3 horas adiantado

        //Texto no formato customizado:

        LocalDate d08 = LocalDate.parse("20/09/2026", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/09/2026 01:30", fmt2);

        //Passando data separados (Dia, Mes, Ano)

        LocalDate d10 = LocalDate.of(2026, 10, 26);
        LocalDateTime d11 = LocalDateTime.of(2026, 10, 26, 01, 30 );

        System.out.println("d01 = "+ d01);
        System.out.println("d02 = "+ d02);
        System.out.println("d03 = "+ d03);
        System.out.println("d04 = "+ d04);
        System.out.println("d05 = "+ d05);
        System.out.println("d06 = "+ d06);
        System.out.println("d07 = "+ d07);
        System.out.println("d08 = "+ d08);
        System.out.println("d09 = "+ d09);
        System.out.println("d10 = "+ d10);
        System.out.println("d11 = "+ d11);







    }
}
