public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void describeHumanInfo(){
        System.out.println("Moe ima - " + firstName);
        System.out.println("Moe family - " + lastName);
    }
}
