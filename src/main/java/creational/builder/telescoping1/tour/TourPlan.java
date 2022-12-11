package creational.builder.telescoping1.tour;

import java.time.LocalDate;
import java.util.List;

/**
 * 여행 계획
 */
public class TourPlan {
    private String title; // 여행 제목
    private LocalDate startDate; // 출발 일
    private int nights; // 몇 박
    private int days; // 며칠
    private String whereToStay; // 어디서 머물지
    private List<DetailPlan> plans; // n일차 할 일

    /**
     * 기본 생성자(필수)
     */
    public TourPlan() {

    }

    /**
     * 일반적인 여행 계획 생성자
     *
     * @param title 여행 제목
     * @param startDate 출발 일
     * @param nights n박
     * @param days m일
     * @param whereToStay 머물 장소
     * @param plans n일차 할 일
     */
    public TourPlan(String title, LocalDate startDate, int nights,
                    int days, String whereToStay, List<DetailPlan> plans) {

        this.title = title;
        this.startDate = startDate;
        this.nights = nights;
        this.days = days;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }

    /**
     * 당일치기 여행 계획 생성자
     *
     * @param title 여행 제목
     * @param startDate 출발 일
     * @param plans 1일차 할 일
     */
    public TourPlan(String title, LocalDate startDate, List<DetailPlan> plans) {
        this.title = title;
        this.startDate = startDate;
        this.plans = plans;
    }


    @Override
    public String toString() {
        return "TourPlan{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", nights=" + nights +
                ", days=" + days +
                ", whereToStay='" + whereToStay + '\'' +
                ", plans=" + plans +
                '}';
    }
}
