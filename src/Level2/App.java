package Level2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            try {       // 숫자 2개와 연산기호 넣고 계산
                double calculationResult = calculator.calculate(num1, num2, operator);
                calculator.setResultList(calculationResult);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (sc.nextLine().equals("remove")) calculator.removeResult();

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.nextLine().equals("inquiry")) calculator.inquiryResults();


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while(! sc.nextLine().equals("exit"));

    }
}
