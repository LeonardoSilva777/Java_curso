package secao8_poo.aulas._exercicios.ex3_notaAluno;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno a1 = new Aluno();

        System.out.println("Nome do Aluno: ");
        a1.nome = sc.nextLine();

        System.out.println("Nota 1: ");
        a1.n1 = sc.nextDouble();

        System.out.println("Nota 2: ");
        a1.n2 = sc.nextDouble();

        System.out.println("Nota 3: ");
        a1.n3 = sc.nextDouble();

        if (a1.somaNota() >= 60){
            System.out.println("Voce foi aprovado! ");
        } else {
            System.out.println("Voce foi reprovado!");
            double faltam = 60 - a1.somaNota() ;
            System.out.println("Faltam: " + faltam + " Pontos para ser aprovado!");
        }
    }
}

