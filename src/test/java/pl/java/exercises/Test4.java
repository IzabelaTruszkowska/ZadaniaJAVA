package pl.java.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iza on 2016-11-04.
 */
public class Test4 {

    public static void main(String [] args) {
        int raz = 1;
        int trzy = 3;
        double osiem = 8.01;
        double dwanascie = 12.07;

        String razString = Integer.toString(raz);
        String trzyString = Integer.toString(trzy);
        String osiemString = Double.toString(osiem);
        String dwanascieString = Double.toString(dwanascie);

        List<String> zmString = new ArrayList<String>();
        zmString.add(razString);
        zmString.add(trzyString);
        zmString.add(osiemString);
        zmString.add(dwanascieString);

        for (String e: zmString) {
            System.out.println(e);
        }
    }

}
