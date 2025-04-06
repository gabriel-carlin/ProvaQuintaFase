package classes.entities;

public class Janitor extends Employee{

    private double fixedSalary;
    private int extraShifts;
    private double bonusPerShift = 100;

    public Janitor(String name, double fixedSalary, int extraShifts) {
        super(name);
        this.fixedSalary = fixedSalary;
        this.extraShifts = extraShifts;
    }
    public double getFixedSalary() {
        return fixedSalary;
    }
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    public int getExtraShifts() {
        return extraShifts;
    }
    public void setExtraShifts(int extraShifts) {
        this.extraShifts = extraShifts;
    }
    public double getBonusPerShift() {
        return bonusPerShift;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary + extraShifts*bonusPerShift;
    }
    

}
