package secao9_poo.aulas.exercicios.ex01_contaBancaria;

public class Cadastro {
    private int NumberAccont;
    private String Name;
    private double Value;

    public Cadastro(){}

    public Cadastro(int numberAccont, String name, double Value) { //criei variavel de deposito inicial
        this.NumberAccont = numberAccont;
        this.Name = name;
        Deposit(Value); // Junto com a função Deposit, o usuario vai conseguir armazenar o valor
    }

    public Cadastro(int numberAccont, String name) {
        this.NumberAccont = numberAccont;
        this.Name = name;
    }

    public int getNumberAccont() {
        return NumberAccont;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getValue() {
        return Value;
    }

    public void Deposit(double  amount){

        Value += amount;
    }

    public void Withdraw(double amount){

        Value -= amount + 5;
    }


    public String toString() {
        return "Cadastro "
                + NumberAccont
                + ", Holder: "
                + Name
                + ", Balance: $ "
                + String.format("%.2f", Value);
    }
}
