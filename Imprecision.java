/**
 * This program demonstrates imprecision that can occur when performing 
 * calculations with large and small floating-point numbers.
 * @author Tobey Agapito, tagapito@student.sdccd.edu
 * @since (09/06/2026)
 * @version 6.0.0
 */
public class Imprecision {
    public static void main(String[] args) {
        double x = 12345.6789e200;
        double y = 1 / x;
        double z = x * y;

        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z (x*y) is: " + z);
        System.out.println("The value of 1 - z is: " + (1 - z));
    }
}