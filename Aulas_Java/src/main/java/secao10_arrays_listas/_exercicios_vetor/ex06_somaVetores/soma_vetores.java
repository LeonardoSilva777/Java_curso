package secao10_arrays_listas._exercicios_vetor.ex06_somaVetores;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vai ter cada vetor: ");
        int n = sc.nextInt();

        double[] somaVectA = new double[n];
        System.out.println("digite os numeros do vetor A:");
        for (int i = 0; i < somaVectA.length; i++) {
            somaVectA[i] = sc.nextDouble();
        }


        double[] somaVectB = new double[n];
        System.out.println("Digite os numeros do vetor B:");
        for (int i = 0; i < somaVectB.length; i++){
            somaVectB[i] = sc.nextDouble();
        }

        double somaA = 0;
        for (int i = 0; i < somaVectA.length; i++) {
            somaA += somaVectA[i];
        }

        double somaB = 0;
        for (int i = 0; i < somaVectB.length; i++) {
            somaB += somaVectB[i];
        }

        double[] somasTotais = new double[n];
        for (int i = 0; i < somasTotais.length; i++) {
            somasTotais[i] = somaVectA[i] + somaVectB[i];
        }

        System.out.println("VETOR RESULTANTE:");


        for (int i = 0; i < somasTotais.length; i++) {
            System.out.println(somasTotais[i]);
        }

    }
}
