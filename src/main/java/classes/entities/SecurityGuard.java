package classes.entities;

public class SecurityGuard extends Employee{

    private double fixedSalary;
    private double nightShiftBonus = fixedSalary*0.25;
    private boolean worksNightShift = false;

    public SecurityGuard(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    public SecurityGuard(String name, double fixedSalary, boolean worksNightShift) {
        super(name);
        this.fixedSalary = fixedSalary;
        this.worksNightShift = worksNightShift;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    public double getNightShiftBonus() {
        return nightShiftBonus;
    }
    
    public boolean isWorksNightShift() {
        return worksNightShift;
    }
    

    @Override
    public double calculateSalary() {
        if (worksNightShift) return fixedSalary + nightShiftBonus;
        return fixedSalary;
    }

}
