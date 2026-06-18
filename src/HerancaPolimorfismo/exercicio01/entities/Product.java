package HerancaPolimorfismo.exercicio01.entities;

public class Product {

    private String nameProduct;
    private double priceProduct;

    public Product(String nameProduct) {
    }

    public Product(String nameProduct, double priceProduct) {
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String toString() {
        return nameProduct + " $ " + priceProduct;
    }
}
