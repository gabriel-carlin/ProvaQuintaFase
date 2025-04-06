package classes.entities;

public class Stocker extends Employee{
    private int workedHours;
    private double hourlyWage;

    public Stocker(String name, int workedHours, double hourlyRate) {
        super(name);
        this.workedHours = workedHours;
        this.hourlyWage = hourlyRate;
    }

    public int getWorkedHours() {
        return workedHours;
    }
    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
    public double getHourlyWage() {
        return hourlyWage;
    }
    public void setHourlyWage(double hourlyRate) {
        this.hourlyWage = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workedHours*hourlyWage;
    }

    @Override
    public String getRole() {
        return "Stocker";
    }
}
