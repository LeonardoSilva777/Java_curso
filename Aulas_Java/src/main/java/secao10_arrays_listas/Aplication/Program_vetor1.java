package secao10_arrays_listas.Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program_vetor1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt(); //quantidade de pessoas

        double[] vect = new double[n]; //criação de vetor. [n] = quantidade de espaço no vetor

        for(int i = 0; i < n; i++){
            //Dentro do for vamos ler os dados do vetor. Vetor começa: 0,1,2,3...;
            vect[i] = sc.nextDouble(); //i começa com 0, então a primeira repetição do for, vai ser no vetor 0.
        }

        double soma = 0;

        for (int i = 0; i < n; i++){
            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("Media de altura: %.2f%n",  media);



    }
}
