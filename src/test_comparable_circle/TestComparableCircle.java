package test_comparable_circle;

import comparable_circle.ComparableCircle;
import java.util.Arrays;


public class TestComparableCircle {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(15);
        circles[2] = new ComparableCircle(13,"red",true);

        System.out.println("Pre Sorted.");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);

        System.out.println("After Sorted.");
        for (ComparableCircle circle : circles){
            System.out.println(circle);
        }
    }
}
