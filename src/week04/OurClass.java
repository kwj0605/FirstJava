package week04;

public class OurClass {
    private final boolean just = true;

    // throws : 던지다!! (=예외를 던지다 / 발생시키다)
    public void thisMethodIsDangerous() throws OurBadException {    // 밑에서 throw를 할 수 있는 이유 : 이 메서드가 throws ~로 위험하다고 플래그를 달아줘서
        // custom logic~!
        if(just) {
            throw new OurBadException();
        }
    }
}
// 이 메서드는 checked Exception이다. 위험하다고 말해둬서.