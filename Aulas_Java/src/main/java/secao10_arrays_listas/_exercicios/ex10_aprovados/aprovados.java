package secao10_arrays_listas._exercicios.ex10_aprovados;

import secao10_arrays_listas._exercicios.ex10_aprovados.entities.AlunosAprovados;

import java.util.Locale;
import java.util.Scanner;

public class aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos serão digitados");
        int n = sc.nextInt();

        AlunosAprovados[] alunos = new AlunosAprovados[n];

        System.out.println("Digite o Nome, primeira e segunda nota dos alunos");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("aluno " + i);
            sc.nextLine();
            String name = sc.nextLine();
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();

            alunos[i] = new AlunosAprovados(name, n1, n2);
        }

        System.out.println("Alunos aprovados: ");
        for (int i = 0; i < alunos.length; i++) {
            double mediaDoAluno = alunos[i].calcularMedia();

            if (mediaDoAluno >= 6.0){
                System.out.println(alunos[i].getName());
            }
        }
    }
}
