package Level2;

public class App {

    public static void main(String[] args) {
        int num1=1, num2=0;
        char operationSymbol='/';
        String msg;
        Calculator cal = new Calculator();
        try {
            double a = cal.calculate(num1, num2, operationSymbol);
            System.out.println(a);
            Exception e = new Exception("분모가 0입니다.");
            throw e;
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
