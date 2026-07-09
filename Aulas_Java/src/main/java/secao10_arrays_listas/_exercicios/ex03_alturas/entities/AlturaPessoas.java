package secao10_arrays_listas._exercicios.ex03_alturas.entities;

public class AlturaPessoas {
    private String name;
    private int Idade;
    private double Altura;

    public AlturaPessoas(String name, int idade, double altura) {
        this.name = name;
        Idade = idade;
        Altura = altura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }
}
