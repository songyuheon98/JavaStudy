package week02;

public class W19 {
    public static void main(String[] args) {
        // 중괄호를 사용해 초기화

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6}
        };
        // 반복문을 통한 초기화

        int[][] array1 = new int[2][3];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = 0;
                System.out.println(array1[i][j]);
            }
        }


        // 가변 배열
        // 선언 및 초기화
        int[][] array3 = new int[3][];
        // 배열 원소마다 각기다른 크기로 지정 가능합니다.
        array3[0] = new int[2];
        array3[1] = new int[4];
        array3[2] = new int[1];

        // 중괄호 초기화할때도 원소배열들의 크기를 각기 다르게 생성 가능합니다.
        int[][] array4 = {
                {10, 20},
                {10, 20, 30, 40},
                {10}

        };

        // 3차원 배열의 이해

        // 중괄호 3개를 써서 3차원 배열 초기화를 할 수 있습니다.
        int[][][] MultiArray = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};


        // 가변 2차원 배열 조회

        for (int i = 0; i < array4.length; i++) { // 1차원 길이
            for (int j = 0; j < array4[i].length; j++) { // 2차원 길이
                System.out.println(array4[i][j]); // 2중 반복문으로 i, j 인덱스 순회
            }
        }
        // 최대값 구하기

        int[] arr = { 3, 2, 1, 5, 1 };

// 최대값 초기값 세팅
        int max = arr[0];

// 최대값 구하기
        for (int num : arr) {
            if (num > max) { // 반복문 돌면서 나(max)보다 값이 작으면 저장
                max = num;
            }
        }

// 최대값 5 출력
        System.out.println(max);
    }
}
