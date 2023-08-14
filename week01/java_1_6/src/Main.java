import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // (1) boolean
        // 변수를 선언 해보자 -> 타입 이름 = 값
        boolean flag = true;
        boolean flag2;
        flag2=true;
        flag2=false;

        System.out.println(flag);
        System.out.println(flag2);


        // (2) 문자형(char)
        char alphabet = 'A';
        System.out.println(alphabet);


        // (3) 정수형 ( byte, short, int, long )
        byte byteNumber = 127; // -128 ~ 127
        short shortNumber = 32767; // -23,768 ~ 32,767
        int intNumber = 2147483647;
        long longNumber = 2147483647L;

        System.out.println(byteNumber);
        System.out.println(shortNumber);
        System.out.println(intNumber);
        System.out.println(longNumber);


        // (3) 실수형
        // float(4byte), double(8byte)

        float floatNumber = 3.14f;
        double doubleNumer = 3.14;

        System.out.println(floatNumber);
        System.out.println(doubleNumer);


        // 참조형
        // (1) 문자열 변수
        // (2) 배열
        String helloWorld = "hello";
        System.out.println(helloWorld);


        int[] a = {1,2,3};
        System.out.println(a);
        System.out.println(Arrays.toString(a));
        System.out.println(a[1]);

        // 래퍼 클래스
        int number = 21;
        Integer num = number; // boxing

        System.out.println(num.intValue()); // unboxing


    }
}