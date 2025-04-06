package classes.entities;

public class Stocker extends Employee{
    private int workedHours;
    private double hourlyRate;

    public Stocker(String name, int workedHours, double hourlyRate) {
        super(name);
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    public int getWorkedHours() {
        return workedHours;
    }
    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return workedHours*hourlyRate;
    }
}
