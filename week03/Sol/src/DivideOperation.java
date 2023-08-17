public class DivideOperation extends AbstractOperation {
    double operate(int num1, int num2){
        if (num2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        } else if (num1 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
