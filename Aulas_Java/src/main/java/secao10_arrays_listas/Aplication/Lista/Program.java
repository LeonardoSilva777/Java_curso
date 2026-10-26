package secao10_arrays_listas.Aplication.Lista;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        //teste lista de numeros inteiros
        //<> são generics
        List<String> list = new ArrayList<>(); //implementação do ArrayList é a melhorzinha

        list.add("João");
        list.add("Leo");
        list.add("Bob");
        list.add("Ana");
        list.add("Maria");
        list.add(2, "marco"); // é assim que adicionamos pessoas a nossa lista

        System.out.println(list.size()); //para ver o tamanho da lista

        list.remove("Ana");

        for (String x: list ){ //para cada string que pertencer a minha lista
            System.out.println(x); //ele vai imprimir o valor de x
        }
        //instancia a lista

     }
}
