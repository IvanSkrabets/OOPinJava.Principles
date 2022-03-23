package Homework;

public class Cargo extends Ground {
    private double loadCapacity;

    public Cargo(int power, double maximumSpeed, double weight, String stamp, int numberOfwheels, double expenditure, String sedan, double loadCapacity) {
        super(power, maximumSpeed, weight, stamp, numberOfwheels, expenditure);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public void cargoTransInfo (){
        System.out.println("Мощность - " + getPower());
        System.out.println("Максимальная скорость - " + getMaximumSpeed());
        System.out.println("Масса - " + getWeight());
        System.out.println("Марка - " + getStamp());
        System.out.println("Количество колёс - " + getNumberOfwheels());
        System.out.println("Расход топлива - " + getExpenditure());
        System.out.println("Грузоподъёмность - " + loadCapacity);
        System.out.println("Мощность в киловатах - " + powerСalculation() );
    }

    public double powerСalculation() {
        return getPower() * 0.74;
    }

    public void checkingFormass(int cargoWeight) {
        if (cargoWeight <= loadCapacity ) {
                 System.out.println("Грузовик загружен");
             } else {
            System.out.println("Вам нужен новый грузовик");
        }
    }
}
