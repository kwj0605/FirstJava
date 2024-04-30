package Level2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int index=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("사칙연산을 구하려면 1, 원의 넓이를 구하려면 2를 입력하세요.");    /* 사칙연산을 진행할지 원의 너비를 구할지 선택 구현 */
            int checkKind = sc.nextInt();
            if(checkKind == 1){
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
            } else if (checkKind == 2) {
                System.out.println("반지름을 입력해주세요.");
                double radius = sc.nextDouble();

                calculator.setCircleArea(radius);   // 반지름 입력 후 넓이 구하기
                System.out.println(calculator.getCircleArea(index));    // 리스트에 저장된 index번째 반지름 출력
                index++;

                System.out.println("저장된 원의 넓이 값을 전부 조회합니다.");
                calculator.inquiryCircleArea();
            }
            else System.out.println("입력값이 올바르지 않습니다.");
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while(! sc.nextLine().equals("exit"));

    }
}
