package ra;
/*
@date 07.02.2024
@author Sergey Bugaienko
*/

public class ArrayTest {
    public static void main(String[] args) {

        RubberArrayOld ra = new RubberArrayOld();

        ra.add(10, 15, -6, -1, -16, 99, 0, 15);

        System.out.println(ra.toString());

        System.out.println("size: " + ra.size());

        System.out.println(ra.get(3));
        System.out.println(ra.get(9));
    }
}
