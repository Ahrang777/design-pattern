package creational.builder.builder3.tour;

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

    public TourPlan() {

    }

    public TourPlan(String title, LocalDate startDate, int nights,
                    int days, String whereToStay, List<DetailPlan> plans) {

        this.title = title;
        this.startDate = startDate;
        this.nights = nights;
        this.days = days;
        this.whereToStay = whereToStay;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getWhereToStay() {
        return whereToStay;
    }

    public void setWhereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
    }

    public List<DetailPlan> getPlans() {
        return plans;
    }

    public void setPlans(List<DetailPlan> plans) {
        this.plans = plans;
    }

    public void addPlan(int day, String plan) {
        this.plans.add(new DetailPlan(day, plan));
    }
}
