package JavaHomework;

public class Calculator {

    private AbstractOperation operation;
    public Calculator (AbstractOperation operation) {
        this.operation = operation;
    }

    public void setOperation (AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber) {
        double answer = 0;

        answer = operation.operate(firstNumber, secondNumber);

//        return switch (operator.charAt(0)) {
//            case '+' -> AddOperation.operate(firstNumber, secondNumber);
//            case '-' -> SubstractOperation.operate(firstNumber, secondNumber);
//            case '*' -> MultiplyOperation.operate(firstNumber, secondNumber);
//            case '/' -> (double) DivideOperation.operate(firstNumber, secondNumber);
//            default -> 0;
//        };
        return answer;
    }
}

