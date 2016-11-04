package pl.java.exercises;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iza on 2016-11-03.
 */
public class PersonBySalary {
    private List<Person> richPersons;

    public PersonBySalary() {
        richPersons = new ArrayList<Person>();
    }

    public List<Person> addRichPerson(List<Person> personAsParameter) {
        for (Person p: personAsParameter) {
            if (p.getSalary() > 3000) {
                richPersons.add(p);
            }
        }
        return richPersons;
    }


    @Override
    public String toString() {
        return "PersonBySalary{" +
                "richPersons=" + richPersons +
                '}';
    }
}

