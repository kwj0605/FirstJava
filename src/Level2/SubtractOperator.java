package Level2;

public class SubtractOperator implements OperateInterface {
    @Override
    public double operate(int num1, int num2) {
        return num1 - num2;
    }

    /*public double operate(int num1, int num2) {
        return (double) num1 - num2;
    }*/
}
