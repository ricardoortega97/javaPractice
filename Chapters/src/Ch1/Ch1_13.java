package Ch1;
/*
(Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following
2 * 2 system of linear equation
 */
public class Ch1_13 {
    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        System.out.println("x: " + x + "\ny: " + y);
    }
}
