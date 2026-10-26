package secao11_TopicosEspeciais.Program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatarHoraTexto {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20"); //aqui estamos a definir como queremos a data
        LocalDateTime d05 = LocalDateTime.parse("2022-06-20T01:30:20"); //aqui definimos como queremos data e hora (baseda no ISO 8601)
        Instant d06 = Instant.parse("2022-06-20T01:30:20Z"); //Horario de Londres (ING)

        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("d05 = " + d05); //2022-06-20T01:30:20
        System.out.println("do4 = " + d04.format(ftm1)); //(20/07/2022).formt seve para informar como eu quero que a data passe para texto
    }
}
