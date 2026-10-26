package secao10_arrays_listas._exercicios_vetor.ex08_mediaPares;

import java.util.Locale;
import java.util.Scanner;

public class media_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();
        double soma = 0.0;

        double[] pares = new double[n];
        System.out.println("Digite os numeros:");
        for (int i = 0; i < pares.length; i++) {
            pares[i] = sc.nextDouble();
        }

        for (int i = 0; i < pares.length; i++) {
            soma += pares[i];
        }

        double avg;
        int somaPares = 0;
        int qtdPares = 0;

        for (int i = 0; i < pares.length; i++) {
            if (pares[i] % 2 ==0){
                somaPares += pares[i];
                qtdPares++;
            }
        }

        if (qtdPares > 0 ){
            avg = (double) somaPares / qtdPares;
            System.out.println();
            System.out.printf("MEDIA DOS PARES = %.1f%n", avg);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

    }
}
