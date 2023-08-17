public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AddOperation());
        System.out.println(calculator.calculate(13,20));
        calculator.setter(new SubstractOperation());
        System.out.println(calculator.calculate(13,20));
        calculator.setter((new DivideOperation()));
        System.out.println(calculator.calculate(13,20));
        calculator.setter(new MultiplyOperation());
        System.out.println(calculator.calculate(13,20));

    }

}