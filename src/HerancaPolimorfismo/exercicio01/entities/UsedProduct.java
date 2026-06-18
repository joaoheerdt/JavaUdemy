package HerancaPolimorfismo.exercicio01.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    LocalDate manufactureDate;


    public UsedProduct(String nameProduct, double priceProduct, LocalDate manufactureDate) {
        super(nameProduct, priceProduct);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return getNameProduct()
                + " (used) $ "
                + String.format("%.2f", getPriceProduct())
                + " (Manufacture date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }
}
