package HerancaPolimorfismo.exercicio02.entities;

public class CompanyTax extends TaxPayer {
    private int EmployeeNumber;

    public CompanyTax(String name, Double annualIncome, int employeeNumber) {
        super(name, annualIncome);
        EmployeeNumber = employeeNumber;
    }

    public int getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        EmployeeNumber = employeeNumber;
    }

    @Override
    public double tax() {
        double taxTemp;
        if (getEmployeeNumber() <= 10) {
            taxTemp = getAnnualIncome() * 0.16;
        } else {
            taxTemp = getAnnualIncome() * 0.14;
        }
        return taxTemp;
    }

}
