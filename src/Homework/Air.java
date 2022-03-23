package Homework;

public class Air extends Transport {
    private double wingspan;
    private double takeofflength;

    public Air(int power, double maximumSpeed, double weight, String stamp, double wingspan, double takeofflength) {
        super(power, maximumSpeed, weight, stamp);
        this.wingspan = wingspan;
        this.takeofflength = takeofflength;
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public double getTakeofflength() {
        return takeofflength;
    }

    public void setTakeofflength(double takeofflength) {
        this.takeofflength = takeofflength;
    }
}
