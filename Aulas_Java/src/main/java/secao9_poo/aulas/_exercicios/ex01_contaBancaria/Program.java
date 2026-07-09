package secao9_poo.aulas._exercicios.ex01_contaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Cadastro conta; // declaro o objeto fora para poder usar em outras coisas


        System.out.println("Enter number accont: ");
        int NumberAccont = sc.nextInt();

        System.out.println("Enter accont Holder: ");
        String name = sc.next();

        System.out.println("Is there na initial deposit (y/n)?");
        char resposta = sc.next().charAt(0);

        if(resposta == 'y'){
            System.out.println("Enter initial deposit value:");
            double initialValue = sc.nextDouble();
            conta = new Cadastro(NumberAccont, name, initialValue);
        } else {
            conta = new Cadastro(NumberAccont, name);
        }

        System.out.println("Accont Data: ");
        System.out.println(conta);

        System.out.println("Enter a deposit value:");
        double Deposito = sc.nextDouble();
        conta.Deposit(Deposito); //chamo o Deposit passando como argumento o Deposito

        System.out.println("Update Data: "+conta);

        System.out.println("Enter a withdraw value:");
        double Retirada = sc.nextDouble();
        conta.Withdraw(Retirada);

        System.out.println("Update Data: "+conta);
    }
}
