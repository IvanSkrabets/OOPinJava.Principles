package Homework;

public class Main {
    public static void main(String[] args) {
      Passenger volvo = new Passenger(200,250,2500,"Volvo",4,8.6,"sedan",6);
      volvo.passengerTransportInfo();
      volvo.getKilometresWithMaxSpeed(6);
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        Cargo gazel =new Cargo(200,150,3000,"gazel",6,9,"gryzovik",8000);
        gazel.cargoTransInfo();
        gazel.checkingFormass(3000);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Civilian boing = new Civilian(600,500,6000,"boing",10,600,800,true);
        boing.Civilianinfo();
        boing.capacity(500);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Military akula = new Military(600,800,9000,"akula",9,1000,false,3);
        akula.printTransInfo();
        akula.startRacket();
        akula.startRacket();
        akula.startRacket();
        akula.startRacket();
        akula.sistemEjection();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }
}
