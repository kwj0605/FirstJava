package Level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> listResult = new ArrayList<>();

        String answer;
        do {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operater = sc.next().charAt(0);

            int result = 0;
            switch (operater) {
                case '+' :
                    result = num1 + num2;
                    break;

                case '-' :
                    result = num1 - num2;
                    break;

                case '*' :
                    result = num1 * num2;
                    break;

                case  '/' :
                    result = num1 / num2;
                    break;
            }
            System.out.println("결과: " + result);


            listResult.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if (sc.nextLine().equals("remove")) listResult.remove(0);

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if (sc.nextLine().equals("inquiry")) {
                for (int k:listResult)
                    System.out.println(k);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = sc.nextLine();
        } while (! sc.nextLine().equals("exit"));


    }
}
