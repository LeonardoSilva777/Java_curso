package secao10_arrays_listas.entities;

public class ProductVect {
    private String name;
    private double price;

    public ProductVect(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPreco(double preco) {
        this.price = preco;
    }
}
