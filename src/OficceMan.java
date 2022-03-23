public class OficceMan extends Human{
    private String company;

    public OficceMan(String firstName, String lastName, String company) {
        super(firstName, lastName);
        this.company = company;
    }

    @Override
    public void describeHumanInfo() {
        super.describeHumanInfo();
        System.out.println("Мое место работы "+ company);
    }
}
