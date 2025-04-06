package classes.entities;

public abstract class Employee {
    protected String name;
    
    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    public abstract String getRole();

    protected double validateValue(double value) {
        if (value < 0) {
            System.out.println("Invalid value. Value set to 0.");
            return 0;
        } 
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s%nName: %s %nSalary: %.2f", getRole(), name, calculateSalary());
    }
}
