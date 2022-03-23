import java.util.Random;
import java.util.Scanner;

public class computer {
   private String cpu;
   private int ram;
   private int hdd;
  private   int fullLifeCycle = 3;

    public computer() {
    }

    public computer(String cpu, int ram, int hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.fullLifeCycle = fullLifeCycle;
    }

    @Override
    public String toString() {
        return "computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", hdd=" + hdd +
                ", fullLifeCycle=" + fullLifeCycle +
                '}';
    }

    public void turnOn(){
//         Random random = new Random();
//         int randomValye = random.nextInt(2);
//         Scanner scanner = new Scanner(System.in);
//         int userEnteredValye = scanner.nextInt();
//         if (randomValye == userEnteredValye && fullLifeCycle > 0) {
        if (isEquelNumbers() && fullLifeCycle > 0) {
            System.out.println("Компьютер включен");
        } else {
            System.out.println("Компьютер сгорел");
        }
    }

    public void turnOff() {
//        Random random = new Random();
//        int randomValye = random.nextInt(2);
//        Scanner scanner = new Scanner(System.in);
//        int userEnteredValye = scanner.nextInt();
//        if (randomValye == userEnteredValye && fullLifeCycle > 0) {
        if (isEquelNumbers() && fullLifeCycle > 0) {
            System.out.println("Компьютер включен");
            fullLifeCycle--;
        } else {
            System.out.println("Компьютер сгорел");
        }
      }
    private boolean isEquelNumbers(){
        Random random = new Random();
        int randomValye = random.nextInt(2);
        Scanner scanner = new Scanner(System.in);
        int userEnteredValye = scanner.nextInt();
        return randomValye == userEnteredValye;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getFullLifeCycle() {
        return fullLifeCycle;
    }

    public void setFullLifeCycle(int fullLifeCycle) {
        this.fullLifeCycle = fullLifeCycle;
    }
}

