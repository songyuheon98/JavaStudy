public class Calculator {
    AbstractOperation abstractOperation;
    Calculator(AbstractOperation abstractOperation){
        this.abstractOperation = abstractOperation;
    }
    public void setter(AbstractOperation abstractOperation){
        this.abstractOperation = abstractOperation;
    }
    double calculate(int num1,int num2){
        return abstractOperation.operate(num1,num2);
    }
}