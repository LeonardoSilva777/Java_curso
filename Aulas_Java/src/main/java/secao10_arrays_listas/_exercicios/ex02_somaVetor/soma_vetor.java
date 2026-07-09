package secao10_arrays_listas._exercicios.ex02_somaVetor;

import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros Voce vai digitar: ");
        int n = sc.nextInt();

        double[] valores = new double[n];

        for (int i = 0; i < valores.length; i++){
            System.out.println("Digite um numero: ");
            valores[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < valores.length; i++){
            soma+= valores[i];
        }

        double media = soma / n;

        System.out.println("VALORES: ");
        for (int i = 0; i < valores.length; i++) {
            System.out.print(valores[i] + "  ");
        }
        System.out.println("");
        System.out.printf("SOMA: %.2f%n",  soma);
        System.out.printf("MEDIA: %.2f%n", media);

    }
}

