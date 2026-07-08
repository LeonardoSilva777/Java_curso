package secao8_poo.aulas._exercicios.ex4_cotacaoDollar;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do dollar atualmente: ");
        double precoDollar = sc.nextDouble();

        System.out.println("Quantos dollares voce quer comprar: ");
        double qtdDollar = sc.nextDouble();

        System.out.println("Valor dos dollares em reais: " + Dollar.ValorFinal(qtdDollar, precoDollar));
    }
}
