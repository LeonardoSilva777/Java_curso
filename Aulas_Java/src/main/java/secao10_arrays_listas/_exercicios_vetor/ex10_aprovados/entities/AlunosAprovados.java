package secao10_arrays_listas._exercicios_vetor.ex10_aprovados.entities;

public class AlunosAprovados {
    private String name;
    private double n1, n2;

    public AlunosAprovados(String name, double n1, double n2) {
        this.name = name;
        this.n1 = n1;
        this.n2 = n2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double calcularMedia() {
        return (n1 + n2) / 2.0;
    }
}
