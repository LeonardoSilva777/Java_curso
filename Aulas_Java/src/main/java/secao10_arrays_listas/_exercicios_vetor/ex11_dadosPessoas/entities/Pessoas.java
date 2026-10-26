package secao10_arrays_listas._exercicios_vetor.ex11_dadosPessoas.entities;

public class Pessoas {
    private double altura;
    private char sexo;

    public Pessoas(double altura, char sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
