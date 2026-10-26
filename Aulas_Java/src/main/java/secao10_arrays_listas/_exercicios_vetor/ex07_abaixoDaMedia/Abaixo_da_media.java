package secao10_arrays_listas._exercicios_vetor.ex07_abaixoDaMedia;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();


        double[] vect = new double[n];
        System.out.println("Digite os numeros: ");
        for (int i = 0; i < vect.length; i++) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
        }

        double avg = soma / n;

        System.out.printf("MEDIA DO VETOR = %.3f%n", avg);

        System.out.println("NUMEROS ABAIXO DA MEDIA");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] < 11.0){
                System.out.println(vect[i]);
            }
        }
    }
}
