public class Client extends Human {
    private int age;

    public Client(String firstName, String lastName, int age) {
        super(firstName, lastName);
        this.age = age;
    }

    @Override
    public void describeHumanInfo() {
        super.describeHumanInfo();
        System.out.println("Мой возвраст " + age);
    }
}
