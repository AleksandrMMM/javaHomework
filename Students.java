package homework3;

public class Students {
    String name;
    String lastName;
    int numberStudy;
    int yearStudy;
    double math;
    double economy;
    double english;

    void summ(double math, double economy, double english ){
        double summm = math + economy + english;
        System.out.println(summm);
    }
}
