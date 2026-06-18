package HerancaPolimorfismo.exercicio02.entities;

public class IndividualTax extends TaxPayer {
    private Double spentOnHealth;

    public IndividualTax(String name, Double annualIncome, Double spentOnHealth) {
        super(name, annualIncome);
        this.spentOnHealth = spentOnHealth;
    }

    public Double getSpentOnHealth() {
        return spentOnHealth;
    }

    public void setSpentOnHealth(Double spentOnHealth) {
        this.spentOnHealth = spentOnHealth;
    }

    @Override
    public double tax() {
        double taxTemp;
        if (getAnnualIncome() < 20000.00) {
            taxTemp = getAnnualIncome() * 0.15;
        } else {
            taxTemp = getAnnualIncome() * 0.25;
        }
        if (spentOnHealth > 0) {
            taxTemp = taxTemp - (spentOnHealth * 0.50);
        }
        if (taxTemp < 0) {
            taxTemp = 0.0;
        }
        return taxTemp;
    }
}
