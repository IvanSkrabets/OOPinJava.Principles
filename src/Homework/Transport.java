package Homework;

public class Transport {
    private int power;
    private double maximumSpeed;
    private double weight;
    private String stamp;

    public Transport(int power, double maximumSpeed, double weight, String stamp) {
        this.power = power;
        this.maximumSpeed = maximumSpeed;
        this.weight = weight;
        this.stamp = stamp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }
}
