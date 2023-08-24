package sec05.classAbstract;

public class Button extends FormElement {
    private String print;

    public Button(int space, String print) {
        super(7);
        System.out.println("===");
        this.print = print;
        System.out.println(this.space);
    }

    @Override
    void func() {
        System.out.println(print + "입력 적용");
    }
}