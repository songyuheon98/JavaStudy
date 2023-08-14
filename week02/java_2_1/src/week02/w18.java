package week02;

public class w18 {
    public static void main(String[] args) {
//
//         **기본형 변수와 참조형 변수의 차이! 눈치 채셨나요?**
//
//        기본형 변수인 char 와 참조형 변수 String 의 차이점을 눈치채셨나요?
//
//        기본형 변수는 소문자로 시작하고 참조형 변수는 대문자로 시작합니다!
//
//        다시한번 리마인드! 참조형 변수는 실제값의 주소값을 저장하고 있는 변수 입니다.

//        - String 은 char배열과 같기 때문에 둘다 문자열을 저장할 수 있는 변수 입니다.
//        - 하지만 String을 더 많이 쓰는데 그 이유는 참조형 변수가 더 많은 기능들을 가지고 있기 때문입니다.
//        - char배열에는 없은 String 만 가지고 있는 기능은 아래와 같습니다.

        String str = "ABCD";

        // (1) length
        int strLength = str.length();
        System.out.println(strLength);

        // (2) charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        // (3) substring(int fromIdx, int toIdx)
        String strSub = str.substring(0,3);
        System.out.println(strSub);

        // (4) equals(String str)
        String newStr="ABCD";
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        // (5) toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();

        // (6) 반대로 char[] -> String
        char[] charArray = {'A','B','C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);


    }
}
