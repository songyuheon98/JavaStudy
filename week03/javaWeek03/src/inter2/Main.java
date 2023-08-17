package inter2;

public class Main implements A {

    @Override
    public void a() {
        System.out.println("A");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.a();
        main.aa();
        System.out.println();

        // static 메서드 aaa() 호출
        A.aaa();
    }
}

interface A {
    void a();
    default void aa() {
        System.out.println("AA");
    }
    static void aaa() {
        System.out.println("static method");
    }
}