package secao10_arrays_listas._exercicios.ex04_numerosPares;

import java.util.Locale;
import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar: ");
        int n = sc.nextInt();

        double[] vectNum = new double[n];

        for (int i = 0; i < vectNum.length; i++) {
            System.out.println("Digite um numero: ");
            vectNum[i] = sc.nextDouble();
        }

        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vectNum.length; i++ ){
            if (vectNum[i] % 2 == 0){
                System.out.println(vectNum[i]);
            }
        }

        int numerosPares = 0;
        for (int i = 0; i < vectNum.length; i++){
            if (vectNum[i] % 2 == 0){
                numerosPares++;
            }
        }

        System.out.println("Quantidade de pares = " + numerosPares);
    }
}
