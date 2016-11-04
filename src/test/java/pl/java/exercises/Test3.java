package pl.java.exercises;

/**
 * Created by Iza on 2016-11-03.
 */
public class Test3 {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;

        String oneString = Integer.toString(one);

        System.out.println("Integer to String: " + oneString);


        int oneStringToInt = Integer.parseInt(oneString);

        System.out.println("String to Integer: " + oneStringToInt);

        String twoString = Integer.toString(two);
        System.out.println("Int to String: " + twoString);
        int twoStringToInt = Integer.parseInt(twoString);
        System.out.println("String to Int: " + twoStringToInt);
    }
}
