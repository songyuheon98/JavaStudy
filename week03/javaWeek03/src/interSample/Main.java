package interSample;

public class Main {
    public static void main(String[] args) {

        // A 인터페이스에 구현체 B 대입
        A a1 = new B();

        // A 인터페이스에 구편체 B를 상속받은 C 대입
        A a2 = new C();

    }
}

interface A { }
class B implements A {}
class C extends B {}