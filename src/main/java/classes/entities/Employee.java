package classes.entities;

public abstract class Employee {
    private String name;
    
    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculateSalary();

    protected double validateValue(double value) {
        if (value < 0) {
            System.out.println("Invalid value. Value set to 0.");
            return 0;
        } 
        return value;
    }
}
