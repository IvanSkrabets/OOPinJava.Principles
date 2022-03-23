import java.util.Scanner;

public class ExtendedCalculator extends Calculator {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void Addition() {
        populateData();
//        double firstNumber = scanner.nextDouble();
//        double secondNumber = scanner.nextDouble();
//        setFirstNumber(firstNumber);
//        setSecondNumber(secondNumber);
        super.Addition();
    }

    @Override
    public void Subtraction() {
        populateData();
        super.Subtraction();
    }

    @Override
    public void Multiplication() {
        populateData();
        super.Multiplication();
    }

    @Override
    public void Division() {
        populateData();
        super.Division();
    }
    private void populateData(){
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();
        double secondNumber = scanner.nextDouble();
        setFirstNumber(firstNumber);
        setSecondNumber(secondNumber);
    }
}
