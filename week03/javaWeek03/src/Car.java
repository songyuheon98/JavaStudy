public class Car {

//    * 클래스 설계 단계
//    1. 클래스 선언 : 만들려고하는 설계도를 선언
//    2. 객체가 가지고 있어야할 속성 ( 필드 ) 을 정의
//    3. 객체 생성하는 방식을 정의 ( 생성자 )
//    4. 객체가 가지고 있어야 할 행위 ( 메서드 ) 정의

    // << 필드 영역 >>
    // 1) 고유 데이터 영역
    String company; // 자동차 회사
    String model = "Gv80"; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격

    // 2) 상태 데이터 영역
    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights=true; // 자동차 조명의 상태

    // 객체 데이터 영역
    Tire tire = new Tire();
    Door door;
    Handle handle;

    // << 생성자 영역 >>
    public Car() {
        // logic
    }
    // 생성자 : 처음 객체가 생성될 때 (instance화) 어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야 하는지 정의
    // 기본 생성자 : 생략가능


    // << 메서드 영역 >>
    double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }
    double brakePedal() {
        speed = 0;
        return speed;
    }
    char changeGear(char type) {
        gear = type;
        return gear;
    }
    boolean onOffLights() {
        lights = !lights;
        return lights;
    }
    void horn() {
        System.out.println("빵빵");
    }
}
