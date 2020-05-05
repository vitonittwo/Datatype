package Constants;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Constants {

    public static final double LAND_TAX = 44.55;
    public static final double COVER = 11.05;

    public static void main(String[] args) {

       final double CA = 34.67;
        System.out.println(CA);
        System.out.println(CA + 1);
        System.out.println("CA = " + (CA + 1) + " !!!");
        System.out.println("CA = " + CA + 1 + " !!!");
       // "CA = 67.98" - not correct
       // "CA = CA + 1" - not correct

int land_area = 600;
// LAND_TAX = land_area * LAND_TAX;  - not correct
      double  land_tax = LAND_TAX * land_area;
      System.out.println(land_tax);

        System.out.println(COVER);

        System.out.println("Number PI = " + Math.PI);
    }

}
