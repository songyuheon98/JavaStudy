public class Main {
    public static void main(String[] args) {
        double doubleNumber = 10.101010;
        float floatNumber = 10.6010f;

        int intNumber, intNumber2;
        intNumber = (int)doubleNumber; // double -> int 형변환
        intNumber2 = (int)floatNumber; // float -> int 형변환

        System.out.println(doubleNumber);
        System.out.println("double => "+intNumber);
        System.out.println(floatNumber);
        System.out.println("float => "+intNumber2);

        int intNum=23;
        double doubleNum = (double)intNum;
        float floatNum = (float)intNum;

        System.out.println(intNum);
        System.out.println(doubleNum);
        System.out.println(floatNum);

        // 변수 타입별 크기 순서
        // byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)

        // byte -> int
        byte byteNumber =10;
        int intNum1= byteNumber;
        System.out.println(intNum1);

        // char -> int
        char charAlphabet = 'A';
        intNum1=charAlphabet;
        System.out.println(intNum1);

        // int -> Long
        long longNum= intNum1;
        System.out.println(longNum);

        // int -> double
        intNum=200;
        double doubleNum1 = intNum;
        System.out.println(doubleNum1);

        // 작은 크기의 타입이 큰 크기의 타입과 '계산' 될 때, 자동으로 큰 크기의 타입으로 형변환된다.
        int a = 23;
        double b= 23;
        double result = a+b;

        System.out.println(result);

        int iResult = a/4;
        double dResult = a/b;
        System.out.println(iResult);
        System.out.println(dResult);

        // 작은 타입 -> 큰 타입
        // 자동 형변환
        // 값 손실 없음

        // 큰 타입 -> 작은 타입
        //강제 형변환 ( = 캐스팅 )
        // 값의 손실 발생
    }
}