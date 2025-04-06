package classes.entities;

public class SalesPerson extends Employee {
    private double fixedSalary;
    private double salesThisMonth;
    private double saleComission = 0.05;

    public SalesPerson(String name, double fixedSalary, double salesThisMonth) {
        super(name);
        this.fixedSalary = fixedSalary;
        this.salesThisMonth = salesThisMonth;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    public double getSalesThisMonth() {
        return salesThisMonth;
    }
    public void setSalesThisMonth(double salesThisMonth) {
        this.salesThisMonth = salesThisMonth;
    }
    public double getSaleComission() {
        return saleComission;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary + salesThisMonth*saleComission;
    }
}
