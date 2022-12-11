package creational.builder.telescoping1.tour;

import java.time.LocalDate;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        // 순서를 파악이 어렵고, 가독성이 떨어진다.
        TourPlan tourPlan = new TourPlan("여행 계획", LocalDate.of(2021, 12, 24), 3, 4, "호텔",
                Collections.singletonList(new DetailPlan(1, "체크인")));

        // 생성자를 만들지 않고 당일치기 객체를 생성하면 불필요한 Null을 채워야한다.
        TourPlan shortTrip = new TourPlan("여행 계획", LocalDate.of(2021, 12, 24), 3, 4, null,
                Collections.singletonList(new DetailPlan(1, "놀고 돌아오기")));

        System.out.println(shortTrip);
        System.out.println(tourPlan);
    }
}
