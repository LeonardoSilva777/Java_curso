package secao11_TopicosEspeciais.Program;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatarHoraTexto {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20"); //aqui estamos a definir como queremos a data
        LocalDateTime d05 = LocalDateTime.parse("2022-06-20T01:30:20"); //aqui definimos como queremos data e hora (baseda no ISO 8601)
        Instant d06 = Instant.now(); //Horário local da máquina

        DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter ftm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //Criando uma formatação de data, com o padrão dd/mm/yyyy porem com o fusoriario do computador local
        DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter ftm4 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("d05 = " + d05); //2022-06-20T01:30:20
        System.out.println("do5 = " + d05.format(ftm1)); //(20/07/2022).formt seve para informar como eu quero que a data passe para texto
        System.out.println("d05 = " + d05.format(ftm2));
        System.out.println("d06 = " + ftm3.format(d06));
        System.out.println("d05 = " + d05.format(ftm4));


        System.out.println();

    }
}
