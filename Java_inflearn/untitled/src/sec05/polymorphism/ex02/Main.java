package sec05.inheritance.ex01;

public class Main {
    public static void main(String[] args) {
        YalcoChickenDT dtStore1 = new YalcoChickenDT(108, "철원");

        dtStore1.takeHallOrder();

        dtStore1.takeDTOrder();
        System.out.println();
        dtStore1.setDriveThruOpen(false);
        dtStore1.takeDTOrder();
    }
}
