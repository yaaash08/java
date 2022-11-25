import java.util.*;
public class Function4{
    public static double circle(Double r) {
        double p = 3.14;
        double circum = 2 * p * r;
        System.out.println(circum);
        return circum;
    }
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    double r = sc.nextDouble();
    circle(r);
}
}