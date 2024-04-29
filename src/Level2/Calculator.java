package Level2;

public class Calculator {
    public Calculator() {}; // 생성자
    double result=0;

    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    double operationResult;

    public Double calculate(int num1, int num2, char operationSymbol) throws Exception {
        switch (operationSymbol) {
            case '+':
                result = (double)num1 + num2;
                break;

            case '-':
                result = (double)num1 - num2;
                break;

            case '*':
                result = (double)num1 * num2;
                break;

            case '/':
                if (num2 == 0) {
                    Exception e = new Exception("분모가 0입니다.");
                    throw e;
                }

                result = (double)num1 / num2;
                break;
        }
        return result;
    }
}