package secao8_poo.aulas._exercicios.ex4_cotacaoDollar;

public class Dollar {
    public static final double VALORIOF = 0.06; //6% de imposto pela compra do dollar

    public static double ValorFinal(double qntDollar, double precoDollar){
        return  (qntDollar*precoDollar) * (1.0 + VALORIOF);
    }


}
