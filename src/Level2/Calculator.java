package Level2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> resultList;
    AddOperator addOperator = new AddOperator();
    SubtractOperator subtractOperator = new SubtractOperator();
    MultiplyOperator multiplyOperator = new MultiplyOperator();
    DivideOperator divideOperator = new DivideOperator();
    ModOperator modOperator = new ModOperator();
}