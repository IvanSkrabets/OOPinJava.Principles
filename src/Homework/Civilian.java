package Homework;

public class Civilian extends Air {
    private int numberOfPassengers;
    private boolean businessClass;

    public Civilian(int power, double maximumSpeed, double weight, String stamp, double wingspan, double takeofflength, int numberOfPassengers, boolean businessClass) {
        super(power, maximumSpeed, weight, stamp, wingspan, takeofflength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void Civilianinfo (){
        System.out.println("Мощность - " + getPower());
        System.out.println("Максимальная скорость - " + getMaximumSpeed());
        System.out.println("Масса - " + getWeight());
        System.out.println("Марка - " + getStamp());
        System.out.println("Размах крыльев - " + getWingspan());
        System.out.println("Минимальная длина взлётно-посадочной полосы для взлёта - " + getTakeofflength());
        System.out.println("Кол-во пассажиров - " + numberOfPassengers);
        System.out.println("Наличие бизнес класса - " + businessClass);
    }

    public void capacity (int capacity) {
        System.out.println("Колличество человек на посадку " + capacity);
        if (capacity <= numberOfPassengers) {
            System.out.println("Самолет взлетит");
        } else {
            System.out.println("Нужен другой самолет");
        }
    }
}
