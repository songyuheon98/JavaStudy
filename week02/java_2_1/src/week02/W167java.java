package week02;

import java.util.Arrays;

public class W167java {
    public static void main(String[] args) {
        // 얕은 복사
        int[] a = { 1, 2, 3, 4 };
        int[] b = a; // 얕은 복사

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a[0]); // 출력 3  <- a 배열의 0번째 순번값도 3으로 조회됩니다.

        // 깊은 복사
        int[] a1 = { 1, 2, 3, 4 };
        int[] b1 = new int[a1.length];

        for (int i = 0; i < a1.length; i++) {
            b1[i] = a1[i]; // 깊은 복사
        }

        b1[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했습니다. (1 -> 3)

        System.out.println(a1[0]); // 출력 1 <- 깊은 복사를 했기때문에 a 배열은 그대로 입니다.

        // 깊은 복사 메서드
        // 1. clone() 메서드
        int[] a2 = { 1, 2, 3, 4 };
        int[] b2 = a2.clone(); // 가장 간단한 방법입니다.
        // 하지만, clone() 메서드는 2차원이상 배열에서는 얕은 복사로 동작합니다!!


        // 깊은 복사 메서드
        // 2. Arrays.copyOf() 메서드
        int[] a3 = { 1, 2, 3, 4 };
        int[] b3 = Arrays.copyOf(a, a.length); // 배열과 함께 length값도 같이 넣어줍니다.

    }
}
