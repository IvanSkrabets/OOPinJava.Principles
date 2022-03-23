public class GoodJob {
    public static void main(String[] args) {
//        computer computer = new computer();
//        computer.setHdd(1024);
//        computer.setCpu("Intel 5");
//        System.out.println(computer.getHdd());
//        System.out.println(computer.getCpu());
//        System.out.println(computer.getFullLifeCycle());

        Human vasya = new Human("Cawa", "Popov");
        vasya.describeHumanInfo();
        System.out.println("+++++++++++++++++++++++++++++++");
        Client petya = new Client("petya","pypkin",25);
        petya.describeHumanInfo();
        System.out.println("++++++++++++++++++++");
        OficceMan petr = new OficceMan("Petr","polikov", "Tms" );
        petr.describeHumanInfo();
    }
}
