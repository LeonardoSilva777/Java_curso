package secao10_arrays_listas._exercicios_vetor.ex05_maiorPosicao;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros vai digitar: ");
        int n = sc.nextInt();

        double[] maiorNumero = new double[n];

        for (int i = 0; i < maiorNumero.length; i++){
            System.out.println("Digite um numero: ");
            maiorNumero[i] = sc.nextDouble();

        }

        double maiorValor = maiorNumero[0];
        int posicaoMaior = 0;

        for (int i = 0; i < maiorNumero.length; i++){
            if (maiorNumero[i] > maiorValor){

                maiorValor = maiorNumero[i];
                posicaoMaior = i;
            }
        }

        System.out.println("MAIOR VALOR: " + maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR:" + posicaoMaior);
    }
}
