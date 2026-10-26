package secao10_arrays_listas._exercicios_vetor.ex11_dadosPessoas;

import secao10_arrays_listas._exercicios_vetor.ex11_dadosPessoas.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão? ");
        int n = sc.nextInt();


        Pessoas[] pes = new Pessoas[n];
        for (int i = 0; i < pes.length; i++) {
            System.out.println("Digite a altura e depois o sexo (M or F): ");
            double altura = sc.nextDouble();
            char sexo = sc.next().charAt(0);

            pes[i] = new Pessoas(altura, sexo);
        }

        double soma_altura = 0.0;
        double contPessoas = 0;

        for (int i = 0; i < pes.length; i++) {
            if (pes[i].getSexo() == 'F'){
                soma_altura+= pes[i].getAltura();
                contPessoas++;
            }
        }

        double menor_altura = pes[0].getAltura();
        double maior_altura = pes[0].getAltura();

        for (int i = 0; i < pes.length; i++) {
            if (pes[i].getAltura() > maior_altura){
                maior_altura = pes[i].getAltura();
            }

            if (pes[i].getAltura() < menor_altura){
                menor_altura = pes[i].getAltura();
            }
        }

        int qtdhomens = 0;
        int qtdmulheres = 0;
        double alturafemtotal = 0;
        for (int i = 0; i < pes.length; i++) {
            if (pes[i].getSexo() == 'M'){
                qtdhomens++;
            } else {
                qtdmulheres++;
                alturafemtotal = alturafemtotal + pes[i].getAltura();
            }
        }

        alturafemtotal = alturafemtotal / qtdmulheres;

        System.out.printf("MAIOR ALTURA: %.2f%n", maior_altura);
        System.out.printf("MENOS ALTURA: %.2f%n", menor_altura);
        System.out.printf("ALTURA MEDIA DAS MULHERES: %.2f%n", alturafemtotal);
        System.out.println("Quantidade de Homens: " + qtdhomens);
    }
}
