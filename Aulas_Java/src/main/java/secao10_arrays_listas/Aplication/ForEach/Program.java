package secao10_arrays_listas.Aplication.ForEach;

public class Program {
    public static void main(String[] args) {

        String[] vect = new String[] {"bob", "maria", "alex"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }
        //ja que o vect só tem string temos que passar pro for só string
        //depois damos um apelido, ex: obj

        System.out.println("----------------------------------");

        for (String obj : vect){ //ele percorre todos os elementos do meu  vetor, chamando cada 1 dos elementos de obj
            System.out.println(obj);
        }

        // os 2 fors fazem a mesma coisa, então se eu chamo o for no obj, vai ser a mesma coisa que o primeiro for
    }
}
