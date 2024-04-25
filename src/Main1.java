import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요리 제목을 입력하세요");
        String title = sc.nextLine();
        System.out.println("별점을 입력하세요(1~5)");
        String star = sc.nextLine();  //nextDouble에서 수정 \n
        System.out.println("요리 레시피를 10문장 입력하세요");
        String[] recipe = new String[10];
        for(int i=0; i<10; i++) {
            recipe[i] = sc.nextLine();
        }

        //퍼센트 계산
        int intStar = (int)Float.parseFloat(star);
        int percent = (intStar*100/5);       //(int)star/5*100;
        System.out.println(percent);


        //출력 부분
        System.out.println("[ "+title+" ]");
        System.out.println("별점 : "+intStar+" ("+percent+"%)");
        for(int j=1; j<=10; j++) {
            System.out.println(j+". "+recipe[j-1]);
        }
    }

}
