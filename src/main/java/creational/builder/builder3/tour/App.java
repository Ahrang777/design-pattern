package creational.builder.builder3.tour;

public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan1 = director.cancunTrip();

        director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan2 = director.longBeachTrip();

        System.out.println(tourPlan1);
        System.out.println(tourPlan2);
    }
}
