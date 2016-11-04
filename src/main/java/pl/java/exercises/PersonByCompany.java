package pl.java.exercises;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iza on 2016-11-01.
 */
public class PersonByCompany {
    List<Person> employeesJit;
    List<Person> employeesJepp;


    public PersonByCompany() {
        employeesJit = new ArrayList<Person>();
        employeesJepp = new ArrayList<Person>();
    }

    public List<Person> addPersonsJit(List<Person> personAsParameter) {
        for (Person p: personAsParameter) {
            if (p.getCompany() == "JIT") {
                employeesJit.add(p);
            }
        }
        return employeesJit;
    }

    public List<Person> addPersonsJepp(List<Person> personAsParameter) {
        for (Person p: personAsParameter) {
            if (p.getCompany() == "Jepp") {
                employeesJepp.add(p);
            }
        }
        return employeesJepp;
    }

    @Override
    public String toString() {
        return "PersonByCompany{" +
                "employeesJit=" + employeesJit +
                '}';
    }
    public void showJitEmployees() {
        for (Person p: employeesJit) {
            System.out.println(p.toString());

        }
    }

    public void showJeppEmployees() {
        System.out.println("Test");
        for (Person p: employeesJepp) {
            System.out.println(p.toString());
        }
    }

    public List<Person> getEmployeesJit() {
        return employeesJit;
    }

    public List<Person> getEmployeesJepp() {
        return employeesJepp;
    }

    public void setEmployeesJit(List<Person> employeesJit) {
        this.employeesJit = employeesJit;
    }

    public void setEmployeesJepp(List<Person> employeesJepp) {
        this.employeesJepp = employeesJepp;
    }
}
