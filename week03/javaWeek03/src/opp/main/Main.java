package opp.main;


import opp.pk1.Car;

public class Main {
    public static void main(String[] args) {
        opp.pk1.Car car = new opp.pk1.Car();
        car.horn(); // pk1 빵빵

        opp.pk2.Car car2 = new opp.pk2.Car();
        car2.horn(); // pk2 빵빵

        Car car3 = new Car();
        opp.pk2.Car car4 = new opp.pk2.Car();
    }

}