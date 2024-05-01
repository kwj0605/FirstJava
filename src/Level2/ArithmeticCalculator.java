package Level2;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    double result = 0;    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */

    private List<Double> resultList;  /* 연산 결과를 저장하는 컬렉션 타입 필드를 외부에서 직접 접근 하지 못하도록 수정*/

    public ArithmeticCalculator() {
        new ArrayList<Double>();
    }

    public double calculate(int num1, int num2, char operationSymbol) throws Exception {
        switch (operationSymbol) {
            case '+':
                AddOperator addOperator = new AddOperator();
                result = addOperator.operate(num1, num2);
                break;

            case '-':
                SubtractOperator subtractOperator = new SubtractOperator();
                result = subtractOperator.operate(num1, num2);
                break;

            case '*':
                MultiplyOperator multiplyOperator = new MultiplyOperator();
                result = multiplyOperator.operate(num1, num2);
                break;

            case '/':
                if (num2 == 0) {
                    Exception e = new Exception("분모가 0입니다.");
                    throw e;
                }
                DivideOperator divideOperator = new DivideOperator();
                result = divideOperator.operate(num1,num2);
                break;

            case '%':
                ModOperator modOperator = new ModOperator();
                result = modOperator.operate(num1, num2);
                break;
        }
        return result;
    }

    public double getResultList(int i) {        // i번째 list요소 출력
        return this.resultList.get(i);
    }        /* Getter 메서드 구현 */

    public void setResultList(double calculationResult) {   // list에 연산결과 추가
        this.resultList.add(calculationResult);
    }            /* Setter 메서드 구현 */

    public void removeResult() {    /* 리스트의 가장 첫 번째 삭제 */
        resultList.remove(0);
    }

    public void inquiryResults() {  /* 연산 결과들을 조회 */
        for (double k:resultList)
            System.out.println(k);
    }
}
