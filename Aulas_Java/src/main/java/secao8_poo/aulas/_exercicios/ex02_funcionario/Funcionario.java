package secao8_poo.aulas._exercicios.ex02_funcionario;

public class Funcionario {
    public String nome;
    public double salario;
    public double taxa;

    public double taxacao(){
        return salario - taxa;
    }
    public void IncreaseSalary(double porcentagem){
        // Atualiza o salário somando o valor do salário atual multiplicado pela porcentagem
        this.salario += this.salario * (porcentagem / 100);

    }
}
