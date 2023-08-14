package week02;

public class W14 {
    public static void main(String[] args) {
// for 문
        for(int i=0; i < 4; i++) { // 변수 i 값은 0 ~ 3 까지 반복
            System.out.println(i + "번째 출력"); // i 변수와 문자열 합치기
        }
        // 향상된 for 문

        int[] numbers = {3,6,9,12,15};
        for(int number: numbers) {
            System.out.print(number + " ");
        }

        // break 명령
        int number = 0;
        while(number < 3) {
            number++;
            if (number == 2) {
                break;  // 2일때 반복 중단
            }
            System.out.println(number + "출력");
        }
        // while 문

        number = 0;
        while(number < 3) {
            number++;
            System.out.println(number + "출력");
        }
        // do-while 문

        number = 4;
        do {
            System.out.println(number + "출력");
        } while(number < 3); // 연산을 한번 수행 후 조건문 체크



        // break 명령 범위
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                break; // i 가 2일때 가장 바깥 반복문이 종료됩니다.
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j: " + j);
                if (j == 2) {
                    break; // j 가 2일때 가장 안쪽 반복문이 종료됩니다.
                }
            }
            // continue 명령

            number = 0;
            while(number < 3) {
                number++;
                if (number == 2) {
                    continue;  // 2일때 반복 패스
                }
                System.out.println(number + "출력");
            }

        }

    }

}
