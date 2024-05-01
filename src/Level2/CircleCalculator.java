package Level2;

import java.util.ArrayList;
import java.util.List;

public class CircleCalculator {
    private List<Double> circleAreaList = new ArrayList<Double>();  /* 원의 넓이 결과를 저장하는 컬렉션 타입의 필드 선언 및 생성 */
    static final double pi = Math.PI;

    public double calculateCircleArea(double radius) {   /* 원의 넓이를 구하는 메서드 선언*/
        return pi*radius*radius;
    }

    public double getCircleArea(int index) {       //getter
        return circleAreaList.get(index);
    }

    public void setCircleArea(double circleArea) {      //setter
        circleAreaList.add(calculateCircleArea(circleArea));
    }

    public void inquiryCircleArea() {  /* 연산 결과들을 조회 */
        for (double j :circleAreaList)
            System.out.println(j);
    }
}
