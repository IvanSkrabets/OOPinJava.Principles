package Homework;

public class Military extends Air {
    private boolean ejectionSystem;
    private int numberOfMissiles;

    public Military(int power, double maximumSpeed, double weight, String stamp, double wingspan, double takeofflength, boolean ejectionSystem, int numberOfMissiles) {
        super(power, maximumSpeed, weight, stamp, wingspan, takeofflength);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissiles = numberOfMissiles;
    }

    public boolean isEjectionSystem() {
        return ejectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.ejectionSystem = ejectionSystem;
    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;
    }

    public void setNumberOfMissiles(int numberOfMissiles) {
        this.numberOfMissiles = numberOfMissiles;
    }

    public void printTransInfo(){
        System.out.println("Мощность - " + getPower());
        System.out.println("Максимальная скорость - " + getMaximumSpeed());
        System.out.println("Масса - " + getWeight());
        System.out.println("Марка - " + getStamp());
        System.out.println("Размах крыльев - " + getWingspan());
        System.out.println("Минимальная длина взлётно-посадочной полосы для взлёта - " + getTakeofflength());
        System.out.println("Наличие системы катапультирования - " + ejectionSystem);
        System.out.println("Кол-во ракет на борту - " + numberOfMissiles);
    }

    public void startRacket() {
        if(numberOfMissiles > 0) {
            System.out.println("Ракета пошла");
            numberOfMissiles--;
        } else {
            System.out.println("Пополни боекомплект");
        }
    }

    public void sistemEjection() {
        if(ejectionSystem == true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
