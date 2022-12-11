package creational.builder.telescoping1.tour;

/**
 * n일차 할 일
 */
public class DetailPlan {
    private int day;    // n일차
    private String plan;    // 할 일

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "DetailPlan{" +
                "day=" + day +
                ", plan='" + plan + '\'' +
                '}';
    }
}
