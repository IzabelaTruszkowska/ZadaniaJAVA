package pl.java.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iza on 2016-11-01.
 */
public class PersonByGenderHeight {
    List<Person> tallMan;

    public PersonByGenderHeight() {
        tallMan = new ArrayList<Person>();
    }

    public List<Person> addTallMan(List<Person> personAsParameter){
        for (Person p: personAsParameter) {
            if (p.getGender() == "male") {
                if (p.getHeight() > 184) {
                    tallMan.add(p);
                }
            }
        }
        return tallMan;
    }

    public void showTallMen () {
        System.out.println("Test2");
        for (Person p: tallMan) {
            System.out.println (p.toString());
        }
    }
}
