package secao10_arrays_listas._exercicios.ex03_alturas;

import secao10_arrays_listas._exercicios.ex03_alturas.entities.AlturaPessoas;
import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão registradas: ");
        int n = sc.nextInt();

        AlturaPessoas[] pessoas= new AlturaPessoas[n];
        for (int i = 0; i < pessoas.length; i++){
            System.out.println("Dados da "+ i + "a Pessoa");
            System.out.println("Nome: ");
            String name = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            pessoas[i] = new AlturaPessoas(name, idade, altura);
        }

        double soma = 0;
        int quantidadeMenores = 0;
        for (int i = 0; i < pessoas.length; i++){
            soma += pessoas[i].getAltura();

            if (pessoas[i].getIdade() < 16){
                quantidadeMenores++;
            }
        }

        //Aplicamos a fórmula da porcentagem usando o (double) para não perder os decimais
        double porcentagem = ((double) quantidadeMenores / n) * 100;

        double mediaAltura = soma / n;

        System.out.printf("Altura media: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n ", porcentagem);
        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getName());
            }
        }
    }
}
