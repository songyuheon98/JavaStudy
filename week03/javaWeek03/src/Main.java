public class Main {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        Car car1 = new Car();
        car1.changeGear('P');
        carArray[0]=car1;

        Car car2 = new Car();
        car2.changeGear('N');
        carArray[1]=car2;

        Car car3 = new Car();
        car3.changeGear('D');
        carArray[2]=car3;

        for (Car car:carArray) {
            System.out.println("car.gear = "+car.gear);
        }

        Car car = new Car();

        System.out.println("car.model = "+car.model); // 초기값 "Gv80이 출력
        System.out.println("car.color = "+car.color); // 기본값 NULL이 출력
        System.out.println();

        System.out.println("car.speed = "+car.speed); // 기본값 0.0이 출력됩
        System.out.println("car.gear = "+car.gear); // 기본값 \u0000(공백)
        System.out.println("car.light = "+car.lights); // 초기값 true 출력
        System.out.println();

        System.out.println("car.tire = "+car.tire); // 초기값 인스턴스의 주소가 출력
        System.out.println("car.door = "+car.door); // 기본값 NULL이 출력
        System.out.println();


        // 필드 사용
        car.color = "blue";
        car.speed = 100;
        car.lights = false;

        System.out.println("car.color = "+car.color); // 기본값 NULL이 출력
        System.out.println("car.speed = "+car.speed); // 기본값 0.0이 출력됩
        System.out.println("car.light = "+car.lights); // 초기값 true 출력


    }

}