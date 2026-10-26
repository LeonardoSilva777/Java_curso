package secao10_arrays_listas._exercicios_vetor.ex09_maisVelho.entities;

public class PessoaIdade {
    private String name;
    private int idade;


    public PessoaIdade(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
