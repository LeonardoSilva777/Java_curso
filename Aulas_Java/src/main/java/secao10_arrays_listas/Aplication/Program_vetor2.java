package secao10_arrays_listas.Aplication;

import secao10_arrays_listas.entities.ProductVect;

import java.util.Locale;
import java.util.Scanner;

public class Program_vetor2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos produtos: ");

        int n = sc.nextInt();

        ProductVect[] vect = new ProductVect[n];

        for (int i = 0; i < vect.length; i++){ //vect.length = quantidade de lementos no vetor
            sc.nextLine();
            System.out.println("Digite o nome: ");
            String name = sc.nextLine();
            System.out.println("Digite o Valor: ");
            double price = sc.nextDouble();

            vect[i] = new ProductVect(name, price); // instanciando um novo produto onde o vetor aponta para os atributos da classe
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++){
            soma += vect[i].getPrice();
        }

        double avg = soma / vect.length;

        System.out.printf("Media de Preço: %.2f%n", avg);
    }
}
