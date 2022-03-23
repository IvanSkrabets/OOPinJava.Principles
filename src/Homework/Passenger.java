package Homework;

public class Passenger extends Ground {
    private String bodyType;
    private int passengers;

    public Passenger(int power, double maximumSpeed, double weight, String stamp, int numberOfwheels, double expenditure, String bodyType, int passengers) {
        super(power, maximumSpeed, weight, stamp, numberOfwheels, expenditure);
        this.bodyType = bodyType;
        this.passengers = passengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    public void passengerTransportInfo() {
        System.out.println("Мощность - " + getPower());
        System.out.println("Максимальная скорость - " + getMaximumSpeed());
        System.out.println("Масса - " + getWeight());
        System.out.println("Марка - " + getStamp());
        System.out.println("Количество колёс - " + getNumberOfwheels());
        System.out.println("Расход топлива - " + getExpenditure());
        System.out.println("Тип кузова - " + bodyType);
        System.out.println("Кол-во пассажиров - " + passengers);
        System.out.println("Мощность в киловатах - " + powerСalculation() );
    }

    public double powerСalculation() {
       return getPower() * 0.74;
    }

    public void getKilometresWithMaxSpeed(double time) {
        double allDistance = time * getMaximumSpeed();
        System.out.println("За время " + time + " ч, автомобиль " + getStamp() + " двигаясь с максимальной скоростью " + getMaximumSpeed()
                + " км/ч проедет " + allDistance + " км и израсходует " + getSpendFuel(allDistance) + " литров топлива."  );
    }


    public double getSpendFuel(double allDistance) {
        return allDistance / getExpenditure();
    }

}
