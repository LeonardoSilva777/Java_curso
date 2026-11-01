package secao12_Composicao_Objetos.entities;

import javax.xml.crypto.Data;

public class EnumTest {
    Day day;

    public EnumTest(Day day){
        this.day = day;
    }

    public void DiasLegaisDaSemana() {
        switch (day) {
            case MONDAY:
                System.out.println("Segunda: começando a semana!");
                break;

            case FRIDAY:
                System.out.println("Sexta: quase fim de semana!");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Dia de aproveitar o fim de semana!");
                break;

            default:
                System.out.println("Estamos no meio da semana!");
                break;
        }
    }

    public static void main(String[] args) {
        EnumTest teste = new EnumTest(Day.TUESDAY); // teste é a variavel que guarda uma referencia ao objeto, ele ta criando um objeto e chamando o construtor
        teste.DiasLegaisDaSemana(); // metodo do objeto
    }

}
