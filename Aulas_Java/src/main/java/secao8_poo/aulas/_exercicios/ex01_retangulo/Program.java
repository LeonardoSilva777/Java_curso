package secao8_poo.aulas._exercicios.ex01_retangulo;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Retangulo ret = new Retangulo();

        System.out.println("Digite a largura: ");
        ret.largura = sc.nextDouble();

        System.out.println("Digite a altura: ");
        ret.altura = sc.nextDouble();

        System.out.println(ret.Area());
        System.out.println(ret.Perimetro());
        System.out.println(ret.Diagonal());

    }
}

