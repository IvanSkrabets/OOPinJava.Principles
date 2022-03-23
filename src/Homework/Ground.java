package Homework;

public class Ground extends Transport {
    private int numberOfwheels;
    private double expenditure;

    public Ground(int power, double maximumSpeed, double weight, String stamp, int numberOfwheels, double expenditure) {
        super(power, maximumSpeed, weight, stamp);
        this.numberOfwheels = numberOfwheels;
        this.expenditure = expenditure;
    }

    public int getNumberOfwheels() {
        return numberOfwheels;
    }

    public void setNumberOfwheels(int numberOfwheels) {
        this.numberOfwheels = numberOfwheels;
    }

    public double getExpenditure() {
        return expenditure;
    }

    public void setExpenditure(double expenditure) {
        this.expenditure = expenditure;
    }
}
