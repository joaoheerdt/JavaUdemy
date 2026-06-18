package HerancaPolimorfismo.exercicio01.entities;

public class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct(String nameProduct, double priceProduct, double customsFee) {
        super(nameProduct, priceProduct);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    private double totalPrice() {
        return getPriceProduct() + customsFee;
    }

    @Override
    public String toString() {
        return getNameProduct()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";
    }
}
