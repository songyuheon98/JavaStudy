package sample01;

public class OurBadException extends Exception{
    public OurBadException(){
        super("위험한 행동 예외 처리");
    }
}
