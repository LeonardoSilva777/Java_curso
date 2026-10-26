package secao10_arrays_listas._exercicios_vetor.ex09_maisVelho;

import secao10_arrays_listas._exercicios_vetor.ex09_maisVelho.entities.PessoaIdade;

import java.util.Locale;
import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas pessoas serão: ");
        int n = sc.nextInt();

        PessoaIdade[] pessoas = new PessoaIdade[n];
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("nome: ");
            String name = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            pessoas[i] = new PessoaIdade(name, idade);
        }

        int MaiorIdade = pessoas[0].getIdade();
        int maisVelho = 0;

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > MaiorIdade){
                MaiorIdade = pessoas[i].getIdade();
                maisVelho = i;
            }
        }

        System.out.println("Pessoas mais velha: " + pessoas[maisVelho].getName());
        System.out.println("Idade da pessoa Mais Velha = " +MaiorIdade);
    }
}
