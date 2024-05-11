package week04;

public class OurBadException extends Exception{
    public OurBadException() {
        super("위험한 행동을 하면 예외처리를 꼭 해야함!!");
    }
}
