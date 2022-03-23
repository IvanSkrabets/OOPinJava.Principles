public class Calculator {
    private double firstNumber;
    private double secondNumber;

    public void Addition (){
        System.out.println(firstNumber + secondNumber);
    }
    public void Subtraction (){
        System.out.println(firstNumber - secondNumber);
    }
    public void Multiplication (){
        System.out.println(firstNumber * secondNumber);
    }
    public void Division (){
        System.out.println(firstNumber / secondNumber);
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
