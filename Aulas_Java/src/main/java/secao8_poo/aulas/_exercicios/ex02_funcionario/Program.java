package secao8_poo.aulas._exercicios.ex02_funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario f1 = new Funcionario();

        System.out.println("Nome do Funcionario: ");
        f1.nome = sc.next();

        System.out.println("Salario do funcionario: ");
        f1.salario = sc.nextDouble();

        System.out.println("Taxa do salario: ");
        f1.taxa = sc.nextDouble();

        System.out.println("nome:" + f1.nome + " Salario: R$"+ f1.taxacao());

        System.out.println();
        System.out.println("quantos % de aumento: ");
        double porcentagem = sc.nextDouble();
        f1.IncreaseSalary(porcentagem);

        System.out.println();
        System.out.println("Update Salario: ");
        System.out.println("Nome: "+ f1.nome);
        System.out.println("Salario Atual: R$ " + f1.taxacao());

    }
}

