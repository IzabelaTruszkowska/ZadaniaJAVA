package pl.java.exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Iza on 2016-11-01.
 */
public class Test2 {
    public static void main (String[] args) {

        Person person1 = new Person("male", "Mikołaj", "Chodkowski", 196, 3000, "Smart4Aviation", 100, "green", "brown" );
        Person person2 = new Person("male", "Marek", "Zienkiewicz", 182, 2000, "AM", 90, "grey", "blond");
        Person person3 = new Person("female", "Anna", "Anuszewska", 165, 2500, "WBGiTR", 55, "grey", "blond");
        Person person4 = new Person("female", "Anna", "Gzik", 165, 3000, "Jepp", 70, "blue", "brown");
        Person person5 = new Person("female", "Joanna", "Laskowska", 175, 3000, "Jepp", 68, "blue", "blond");
        Person person6 = new Person("female", "Marta", "Senderska", 168, 3000, "Jepp", 75, "blue", "blond");
        Person person7 = new Person("female", "Marta", "Lewicka", 172, 4000, "JIT", 65, "blue", "brown");
        Person person8 = new Person("female", "Klaudia", "Grabowska", 170, 4000, "JIT", 80, "blue", "blond");
        Person person9 = new Person("male", "Jacek", "Kowalski", 175, 5000, "JIT", 90, "blue", "blond");
        Person person10 = new Person("male", "Przemek", "Białczak", 185, 3000, "UW", 80, "brown", "black");

        List<Person> people = new ArrayList<Person>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        people.add(person6);
        people.add(person7);
        people.add(person8);
        people.add(person9);
        people.add(person10);

       // System.out.println(people.toString());
/*
        PersonByCompany jitEmployees = new PersonByCompany();
        jitEmployees.addPersonsJit(people);

       // System.out.println(jitEmployees.toString());

        jitEmployees.showJitEmployees();

        PersonByCompany jeppEmployees = new PersonByCompany();
        jeppEmployees.addPersonsJepp(people);

        jeppEmployees.showJeppEmployees();
*/
        PersonBySalary personBySalary = new PersonBySalary();
        personBySalary.addRichPerson(people);
        System.out.println(personBySalary.toString());

        PersonByCompany personByCompany = new PersonByCompany();

        personByCompany.setEmployeesJepp(personByCompany.addPersonsJepp(people));

        personByCompany.showJeppEmployees();
        personByCompany.showJitEmployees();

        PersonByGenderHeight menTall = new PersonByGenderHeight();
        menTall.addTallMan(people);

        menTall.showTallMen();
    }
}
